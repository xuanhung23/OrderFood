package Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.orderfood.R;
import com.example.orderfood.databinding.FragmentFavoriteBinding;

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
        fragmentFavoriteBinding= DataBindingUtil.inflate(inflater, R.layout.fragment_favorite, container, false);
        return fragmentFavoriteBinding.getRoot();
    }
}
