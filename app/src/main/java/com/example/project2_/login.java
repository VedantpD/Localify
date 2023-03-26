package com.example.project2_;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class login extends AppCompatActivity {
    TextView text;
    EditText username1 , password1;
    String S1username , S1password;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    ProgressDialog progressDialog;

    FirebaseAuth mAuth;
    FirebaseUser muser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username1 = findViewById(R.id.editTextTextPersonName);
        password1 = findViewById(R.id.editTextTextPassword);
        text = findViewById(R.id.textView22);
        progressDialog  = new ProgressDialog(this);
        mAuth= FirebaseAuth.getInstance();
        muser = mAuth.getCurrentUser();
    }
    public void tologin_3(View V){
        validity_();
    }
    private void validity_() {
        S1username = username1.getText().toString();
        S1password = password1.getText().toString();
        if(!S1username.matches(emailPattern)){
            username1.setError("Enter a valid email");
        }
        else if(S1username.isEmpty() && S1password.isEmpty()){
            text.setText("Username and password fields cannot be empty");
        }
        else if(S1username.isEmpty()){
            username1.setError("Field cannot be empty");
        }
        else if(S1password.isEmpty()){
            password1.setError("Field cannot be empty");
        }
        else{
            progressDialog.setMessage("Please wait while we login...");
            progressDialog.setTitle("Login");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            mAuth.createUserWithEmailAndPassword(S1username,S1password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        progressDialog.dismiss();
                        Toast.makeText(login.this, " Welcome back !", Toast.LENGTH_SHORT).show();
                        homepage();
                    }
                    else{
                        progressDialog.dismiss();
                        Toast.makeText(login.this, ""+task.getException(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
    private void homepage() {
        Intent intent = new Intent(this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}