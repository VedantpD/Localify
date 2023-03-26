package com.example.project2_;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class register extends AppCompatActivity {
    TextView text;
    EditText username , password;
    String Susername , Spassword;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    ProgressDialog progressDialog;

    FirebaseAuth mAuth;
    FirebaseUser muser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextTextPassword);
        text = findViewById(R.id.textView22);
        progressDialog  = new ProgressDialog(this);
        mAuth= FirebaseAuth.getInstance();
        muser = mAuth.getCurrentUser();

    }
    public void tologin_(View V){
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }
    public void tologin_2(View V){
        validity_();
    }

    private void validity_() {
        Susername = username.getText().toString();
        Spassword = password.getText().toString();
        if(!Susername.matches(emailPattern)){
            username.setError("Enter a valid email");
        }
        else if(Susername.isEmpty() && Spassword.isEmpty()){
            text.setText("Username and password fields cannot be empty");
        }
        else if(Susername.isEmpty()){
            username.setError("Field cannot be empty");
        }
        else if(Spassword.isEmpty()){
            password.setError("Field cannot be empty");
        }
        else{
            progressDialog.setMessage("Please wait while we register...");
            progressDialog.setTitle("Registration");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();

            mAuth.createUserWithEmailAndPassword(Susername,Spassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        progressDialog.dismiss();
                        Toast.makeText(register.this, "Registration successfull !", Toast.LENGTH_SHORT).show();
                        homepage();
                    }
                    else{
                        progressDialog.dismiss();
                        Toast.makeText(register.this, ""+task.getException(), Toast.LENGTH_SHORT).show();
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
