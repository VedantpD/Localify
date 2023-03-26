package com.example.project2_;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project2_.ui.database;

public class Stationary_3 extends AppCompatActivity {
    TextView header;
    EditText p1,p2,p3,p4,p5,p6,p7,p8;
    ImageView ig1,ig2,ig3,ig4,ig5,ig6,ig7,ig8;
    int flago,flagi1,flagi2,flagi3,flagi4,flagi5,flagi6,flagi7,flagi8= 0;
    int price = 0;
    String arr[] = {"","","","","","","","","",""};
    Integer arr1[] = {0,0,0,0,0,0,0,0,0,0};
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stationary3);

        header = findViewById(R.id.textView);
        p1 = findViewById(R.id.editTextTextPersonName6);
        p2 = findViewById(R.id.editTextTextPersonName7);
        p3 = findViewById(R.id.editTextTextPersonName8);
        p4 = findViewById(R.id.editTextTextPersonName9);
        p5 = findViewById(R.id.editTextTextPersonName10);
        p6 = findViewById(R.id.editTextTextPersonName11);
        p7 = findViewById(R.id.editTextTextPersonName12);
        p8 = findViewById(R.id.editTextTextPersonName13);
        header.setText("Amount to be paid : "+price);
        ig1 = findViewById(R.id.imageView13);
        ig2 = findViewById(R.id.imageView14);
        ig3 = findViewById(R.id.imageView12);
        ig4 = findViewById(R.id.imageView11);
        ig5 = findViewById(R.id.imageView6);
        ig6 = findViewById(R.id.imageView5);
        ig7 = findViewById(R.id.imageView10);
        ig8 = findViewById(R.id.imageView9);
    }
    public void nexi_(View V){
        database g1 = new database(this);
        int x;
        x = 0;
        for(int i = 0;i<10;i++){
            String name = "vedant";
            String Items= arr[i];
            String quantities = Integer.toString(arr1[i]);
            if(arr1[i]==0){
                continue;
            }
            else{
                x = 1;
                Boolean j = g1.insert_data(name,Items,quantities);
                if(j){
                    flago = 1;
                    Toast.makeText(this, "Order placed successfully", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(this, "Order placing failed", Toast.LENGTH_SHORT).show();
                }
            }
            if(flago ==0){
                Toast.makeText(this, "No products selected", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void ig1_(View V){
        flagi1++; //change
        String n1 = p1.getText().toString();  //p1 change
        if(n1.isEmpty()){
            Toast.makeText(this, "Enter the quantity first", Toast.LENGTH_SHORT).show();
            flagi1 = 0; //change
        }
        else if(flagi1%2!=0) {
            ig1.setBackgroundColor(Color.parseColor("#717171"));      //change
            n1 = p1.getText().toString();                                       //change
            int v1 = Integer.parseInt(n1);
            price = price + 25 * v1;
            header.setText("Amount to be paid : "+price);
            arr[0] = "spiral notebook";
            arr1[0] = v1;
        }
        else{
            ig1.setBackgroundColor(Color.parseColor("#FFFFFF"));         //change
            n1 = p1.getText().toString();                                         //change
            int v1 = Integer.parseInt(n1);
            price = price - 25 * v1;
            p1.getText().clear();
            header.setText("Amount to be paid : "+price);
            arr[0] = "";
            arr1[0] = 0;
        }
    }
    public void ig2_(View V){
        flagi2++; //change
        String n2 = p2.getText().toString();  //p1 change
        if(n2.isEmpty()){
            Toast.makeText(this, "Enter the quantity first", Toast.LENGTH_SHORT).show();
            flagi2 = 0; //change
        }
        else if(flagi2%2!=0) {
            ig2.setBackgroundColor(Color.parseColor("#717171"));      //change
            n2 = p2.getText().toString();                                       //change
            int v1 = Integer.parseInt(n2);
            price = price + 8 * v1;
            header.setText("Amount to be paid : "+price);
            arr[1] = "Ball point pen(Blue)";
            arr1[1] = v1;
        }
        else{
            ig2.setBackgroundColor(Color.parseColor("#FFFFFF"));         //change
            n2 = p2.getText().toString();                                         //change
            int v1 = Integer.parseInt(n2);
            price = price - 8 * v1;
            p2.getText().clear();
            header.setText("Amount to be paid : "+price);
            arr[1] = "";
            arr1[1] = 0;
        }
    }
    public void ig3_(View V){
        flagi3++; //change
        String n2 = p3.getText().toString();  //p1 change
        if(n2.isEmpty()){
            Toast.makeText(this, "Enter the quantity first", Toast.LENGTH_SHORT).show();
            flagi3 = 0; //change
        }
        else if(flagi3%2!=0) {
            ig3.setBackgroundColor(Color.parseColor("#717171"));      //change
            n2 = p3.getText().toString();                                       //change
            int v1 = Integer.parseInt(n2);
            price = price + 5 * v1;
            header.setText("Amount to be paid : "+price);
            arr[2] = "Pencil";
            arr1[2] = v1;
        }
        else{
            ig3.setBackgroundColor(Color.parseColor("#FFFFFF"));         //change
            n2 = p3.getText().toString();                                         //change
            int v1 = Integer.parseInt(n2);
            price = price - 5 * v1;
            p3.getText().clear();
            header.setText("Amount to be paid : "+price);
            arr[2] = "";
            arr1[2] = 0;
        }
    }
    public void ig4_(View V){
        flagi4++; //change
        String n2 = p4.getText().toString();  //p1 change
        if(n2.isEmpty()){
            Toast.makeText(this, "Enter the quantity first", Toast.LENGTH_SHORT).show();
            flagi4 = 0; //change
        }
        else if(flagi4%2!=0) {
            ig4.setBackgroundColor(Color.parseColor("#717171"));      //change
            n2 = p4.getText().toString();                                       //change
            int v1 = Integer.parseInt(n2);
            price = price + 10 * v1;
            header.setText("Amount to be paid : "+price);
            arr[3] = "Cello tape";
            arr1[3] = v1;
        }
        else{
            ig4.setBackgroundColor(Color.parseColor("#717171"));         //change
            n2 = p4.getText().toString();                                         //change
            int v1 = Integer.parseInt(n2);
            price = price - 10 * v1;
            p4.getText().clear();
            header.setText("Amount to be paid : "+price);
            arr[3] = "";
            arr1[3] = 0;
        }
    }
    public void ig5_(View V){
        flagi5++; //change
        String n2 = p5.getText().toString();  //p1 change
        if(n2.isEmpty()){
            Toast.makeText(this, "Enter the quantity first", Toast.LENGTH_SHORT).show();
            flagi5 = 0; //change
        }
        else if(flagi5%2!=0) {
            ig5.setBackgroundColor(Color.parseColor("#717171"));      //change
            n2 = p5.getText().toString();                                       //change
            int v1 = Integer.parseInt(n2);
            price = price + 5 * v1;
            header.setText("Amount to be paid : "+price);
            arr[4] = "e";
            arr1[4] = v1;
        }
        else{
            ig5.setBackgroundColor(Color.parseColor("#FFFFFF"));         //change
            n2 = p5.getText().toString();                                         //change
            int v1 = Integer.parseInt(n2);
            price = price - 5 * v1;
            p5.getText().clear();
            header.setText("Amount to be paid : "+price);
            arr[4] = "";
            arr1[4] = 0;
        }
    }
    public void ig6_(View V){
        flagi6++; //change
        String n2 = p6.getText().toString();  //p1 change
        if(n2.isEmpty()){
            Toast.makeText(this, "Enter the quantity first", Toast.LENGTH_SHORT).show();
            flagi6 = 0; //change
        }
        else if(flagi6%2!=0) {
            ig6.setBackgroundColor(Color.parseColor("#717171"));      //change
            n2 = p6.getText().toString();                                       //change
            int v1 = Integer.parseInt(n2);
            price = price + 6 * v1;
            header.setText("Amount to be paid : "+price);
            arr[5] = "f";
            arr1[5] = v1;
        }
        else{
            ig6.setBackgroundColor(Color.parseColor("#FFFFFF"));         //change
            n2 = p6.getText().toString();                                         //change
            int v1 = Integer.parseInt(n2);
            price = price - 7 * v1;
            p6.getText().clear();
            header.setText("Amount to be paid : "+price);
            arr[5] = "";
            arr1[5] = 0;
        }
    }
    public void ig7_(View V){
        flagi7++; //change
        String n2 = p7.getText().toString();  //p1 change
        if(n2.isEmpty()){
            Toast.makeText(this, "Enter the quantity first", Toast.LENGTH_SHORT).show();
            flagi7 = 0; //change
        }
        else if(flagi7%2!=0) {
            ig7.setBackgroundColor(Color.parseColor("#717171"));      //change
            n2 = p7.getText().toString();                                       //change
            int v1 = Integer.parseInt(n2);
            price = price + 8 * v1;
            header.setText("Amount to be paid : "+price);
            arr[6] = "g";
            arr1[6] = v1;
        }
        else{
            ig7.setBackgroundColor(Color.parseColor("#FFFFFF"));         //change
            n2 = p7.getText().toString();                                         //change
            int v1 = Integer.parseInt(n2);
            price = price - 8 * v1;
            p7.getText().clear();
            header.setText("Amount to be paid : "+price);
            arr[6] = "";
            arr1[6] = 0;
        }
    }
    public void ig8_(View V){
        flagi8++; //change
        String n2 = p8.getText().toString();  //p1 change
        if(n2.isEmpty()){
            Toast.makeText(this, "Enter the quantity first", Toast.LENGTH_SHORT).show();
            flagi8 = 0; //change
        }
        else if(flagi8%2!=0) {
            ig8.setBackgroundColor(Color.parseColor("#717171"));      //change
            n2 = p8.getText().toString();                                       //change
            int v1 = Integer.parseInt(n2);
            price = price + 9 * v1;
            header.setText("Amount to be paid : "+price);
            arr[7] = "h";
            arr1[7] = v1;
        }
        else{
            ig8.setBackgroundColor(Color.parseColor("#FFFFFF"));         //change
            n2 = p8.getText().toString();                                         //change
            int v1 = Integer.parseInt(n2);
            price = price - 9 * v1;
            p8.getText().clear();
            header.setText("Amount to be paid : "+price);
            arr[7] = "";
            arr1[7] = 0;
        }
    }
}