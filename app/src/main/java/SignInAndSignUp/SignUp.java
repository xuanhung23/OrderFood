package SignInAndSignUp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.orderfood.R;
import com.example.orderfood.databinding.ActivitySignUpBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import Home.HomePage;


public class SignUp extends AppCompatActivity {


    ActivitySignUpBinding activitySignUpBinding;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activitySignUpBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up);

        progressDialog = new ProgressDialog(SignUp.this);

        String confirmPassWord = activitySignUpBinding.edConfirmPassWord.getText().toString();


        activitySignUpBinding.btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSignup();
            }

        });

    }

    //
    private void onSignup() {
        String passWord = activitySignUpBinding.edPassWord.getText().toString();
        String email = activitySignUpBinding.edEmail.getText().toString();
        FirebaseAuth firebaseAuth;
        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog.show();
        firebaseAuth.createUserWithEmailAndPassword(email, passWord)
                .addOnCompleteListener(SignUp.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if (task.isSuccessful()) {

                            // Sign in success, update UI with the signed-in user's information
                            startActivity(new Intent(SignUp.this, HomePage.class));
                            finishAffinity();

                        } else {
                            // If sign in fails, display a message to the user.

                            Toast.makeText(SignUp.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }
                    }

                });

    }
}