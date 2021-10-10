package Home;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.orderfood.R;
import com.example.orderfood.databinding.FragmentCartBinding;
import com.example.orderfood.databinding.FragmentFavoriteBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FavoriteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FavoriteFragment extends Fragment {

   FragmentFavoriteBinding fragmentFavoriteBinding;

    public FavoriteFragment() {
        // Required empty public constructor
    }


    public static FavoriteFragment newInstance() {
        FavoriteFragment fragment = new FavoriteFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentFavoriteBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_favorite, container, false);
        return fragmentFavoriteBinding.getRoot();
    }
}