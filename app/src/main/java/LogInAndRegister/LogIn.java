package LogInAndRegister;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.orderfood.R;
import com.example.orderfood.databinding.ActivityLogInBinding;

import Home.HomePage;

public class LogIn extends AppCompatActivity implements ICallFragment, LogInFragment.ILogIn {

    ActivityLogInBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_log_in);
        addFragment();



    }

    private void addFragment() {
        LogInFragment fragment = new LogInFragment();
        fragment.setiCallFragment(this);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment).commit();
    }

    public void replaceFragment() {
        Fragment fragment = new SignUpFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragmentContainer, fragment).commit();
    }


    @Override
    public void changeFragment() {
        replaceFragment();
    }


    @Override
    public void onSuccessfull(String mess) {
        Intent intent= new Intent(this, HomePage.class);
       startActivity(intent);

    }

    @Override
    public void onError(String mess) {

    }
}