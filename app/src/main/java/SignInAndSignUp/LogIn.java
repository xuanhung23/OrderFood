package SignInAndSignUp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.orderfood.R;
import com.example.orderfood.databinding.ActivityLogInBinding;

public class LogIn extends AppCompatActivity {
    ActivityLogInBinding activityLogInBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLogInBinding= DataBindingUtil.setContentView(this, R.layout.activity_log_in);
        activityLogInBinding.tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogIn.this, SignUp.class));
            }
        });
    }
}