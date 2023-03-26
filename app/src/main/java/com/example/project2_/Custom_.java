package com.example.project2_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project2_.ui.database;
public class Custom_ extends AppCompatActivity {
    Button place_order;
    EditText e1,e2,e3;
    Integer flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        place_order = findViewById(R.id.button3);
        e1 = findViewById(R.id.editTextTextPersonName2);
        e2 = findViewById(R.id.editTextTextPersonName3);
        e3 = findViewById(R.id.editTextTextPersonName4);
        database g = new database(this);
        // SQLiteDatabase da = g.getReadableDatabase();
        place_order.setOnClickListener(v -> {
            String name = e1.getText().toString();
            String Items= e2.getText().toString();
            String quantities = e3.getText().toString();
            if(name.isEmpty() || Items.isEmpty() || quantities.isEmpty()){
                Toast.makeText(Custom_.this, "Fill all the fields", Toast.LENGTH_SHORT).show();
            }
            else{
                Boolean i = g.insert_data(name,Items,quantities);
                if(i == true){
                    flag = 1;

                    Toast.makeText(Custom_.this, "Order placed successfully", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Custom_.this, "Order placing failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public void gpay_(View V){
        if(flag==1) {
            flag = 0;
            e1.setText("");
            e2.setText("");
            e3.setText("");
            Intent intent = new Intent(this, payment2.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Order is not placed", Toast.LENGTH_SHORT).show();
        }
    }}
