package com.example.project2_;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.io.File;

public class print extends AppCompatActivity {
    CheckBox colored, backtoback;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);
        colored = findViewById(R.id.checkBox);
        backtoback = findViewById(R.id.checkBox2);
    }

    public void send_(View V) {
        String messagestr = " ";
        if(colored.isChecked() && backtoback.isChecked()){
            messagestr = "backtoback printouts and Coloured printouts ";

        }
        else if(colored.isChecked()){
            messagestr = "Coloured printouts and single page printouts";
        }
        else if (backtoback.isChecked()){
            messagestr = "Black and white plus backtoback printouts";

        }
        else{
            messagestr = "Black and white printouts and single page printouts";
        }

        Intent sendIntent = new Intent("android.intent.action.MAIN");
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.setPackage("com.whatsapp");
        sendIntent.setType("text/plain");
        sendIntent.putExtra("jid", "919767892718" + "@s.whatsapp.net");// here 91 is country code
        sendIntent.putExtra(Intent.EXTRA_TEXT, ""+messagestr);
        startActivity(sendIntent);


    }
}