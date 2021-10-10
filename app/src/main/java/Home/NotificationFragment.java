package Home;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.orderfood.R;
import com.example.orderfood.databinding.FragmentNotificationBinding;


public class NotificationFragment extends Fragment {
    FragmentNotificationBinding fragmentNotificationBinding;

    public NotificationFragment() {
        // Required empty public constructor
    }


    public static NotificationFragment newInstance() {
        NotificationFragment fragment = new NotificationFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentNotificationBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_notification, container, false);
        return fragmentNotificationBinding.getRoot();
    }
}