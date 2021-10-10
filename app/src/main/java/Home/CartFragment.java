package Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.orderfood.R;
import com.example.orderfood.databinding.FragmentCartBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CartFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CartFragment extends Fragment {
    FragmentCartBinding fragmentCartBinding;


    public CartFragment() {
        // Required empty public constructor
    }


    public static CartFragment newInstance() {
        CartFragment fragment = new CartFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentCartBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_cart, container, false);
        return  fragmentCartBinding.getRoot();
    }
}