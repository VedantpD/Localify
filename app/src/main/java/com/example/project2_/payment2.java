package com.example.project2_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class payment2 extends AppCompatActivity {
    TextView text;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment2);
        img = findViewById(R.id.imageView9);
        text = findViewById(R.id.textView9);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager= (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData= ClipData.newPlainText("Copy",text.getText().toString());
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(payment2.this, "Copied", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void gpay2_(View V){
        Intent i = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.nbu.paisa.user");
        startActivity(i);
    }}