package com.example.project2_;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Other_ extends AppCompatActivity {
    ImageView img99;
    TextView text99;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        img99 = findViewById(R.id.imageView99);
        text99 = findViewById(R.id.textView99);
        img99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager= (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData= ClipData.newPlainText("Copy",text99.getText().toString());
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(Other_.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void gpay3_(View V){
        Intent i = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.nbu.paisa.user");
        startActivity(i);
    }
}
