package com.example.project2_;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import com.example.project2_.ui.database;

public class MainActivity extends AppCompatActivity {
    CardView print ,c;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        print = findViewById(R.id.print);
        c = findViewById(R.id.co);
    }
    public void print_(View V){
        Intent intent = new Intent(this,print.class);
        startActivity(intent);
    }
    public void stationary_(View V){
        Intent intent = new Intent(this,Stationary_3.class);
        startActivity(intent);
    }
    public void custom_s(View V){
        Intent intent1 = new Intent(this,Custom_.class);
        startActivity(intent1);
    }
    public void other_(View V){
        Intent intent1 = new Intent(this,Other_.class);
        startActivity(intent1);
    }
    public void quit_(View V){
        Intent intent1 = new Intent(this,Quit.class);
        startActivity(intent1);
    }
}