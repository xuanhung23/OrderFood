package Home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.orderfood.R;
import com.example.orderfood.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

import Adapter.AdapterCategories;
import Adapter.AdapterPhotoSlider;
import Domain.Categories;
import Domain.PhotoSlider;

public class HomeFragment extends Fragment {
    FragmentHomeBinding fragmentHomeBinding;
    AdapterCategories adapter;

    ArrayList<Categories> categoryList;
    List<PhotoSlider> mPhotoSliders;

    Context context;


    public HomeFragment() {
        // Required empty public constructor
    }


    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        fragmentHomeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        fragmentHomeBinding.homeRecyclerview1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
//        adapter= new AdapterCategories(context,categoryList);
//        fragmentHomeBinding.homeRecyclerview1.setAdapter(adapter);



        mPhotoSliders=getPhotoSliders();
        AdapterPhotoSlider adapterPhotoSlider=new AdapterPhotoSlider(mPhotoSliders);
        fragmentHomeBinding.viewPager2.setAdapter(adapterPhotoSlider);
        fragmentHomeBinding.circleIndicator3.setViewPager(fragmentHomeBinding.viewPager2);


        return fragmentHomeBinding.getRoot();
    }
    private List<PhotoSlider> getPhotoSliders(){
        List<PhotoSlider> photoSliders=new ArrayList<>();
        photoSliders.add(new PhotoSlider(R.drawable.bbq));
        photoSliders.add(new PhotoSlider(R.drawable.meatsalad));
        photoSliders.add(new PhotoSlider(R.drawable.seafood));
        photoSliders.add(new PhotoSlider(R.drawable.seafoodandsalad));
        return photoSliders;
    }
}
