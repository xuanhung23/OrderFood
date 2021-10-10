package LogInAndRegister;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.orderfood.R;
import com.example.orderfood.databinding.LogInFragmentBinding;

public class LogInFragment extends Fragment {
    LogInFragmentBinding binding;
    ICallFragment iCallFragment;
    ILogIn iLogIn;

    public interface ILogIn {
        void onSuccessfull(String mess);

        void onError(String mess);
    }

    public void setiCallFragment(ICallFragment iCallFragment) {
        this.iCallFragment = iCallFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.log_in_fragment, container, false);
        binding.btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mess = null;
                iLogIn.onSuccessfull(mess);

            }
        });
        binding.tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (iCallFragment != null) {
                    iCallFragment.changeFragment();
                }
            }
        });
        return binding.getRoot();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        iLogIn = (ILogIn) activity;
    }

    ;
}
