package com.example.project2_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


public class Stationary2_ extends AppCompatActivity {
    GridView gridView;
    String[] fruitname = {"a","b","c","d","e","f"};
    int[] fruitimage = {R.drawable.ic_home_black_24dp, R.drawable.aa,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stationary2);
        gridView = findViewById(R.id.gridview);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(getApplicationContext(), GridItemActivity.class);
            intent.putExtra("name",fruitname[i]);
            intent.putExtra("image",fruitimage[i]);
            startActivity(intent);
        });
    }

    private class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return fruitimage.length;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1  = getLayoutInflater().inflate(R.layout.row_data_,null);
            TextView name = view1.findViewById(R.id.productdata);
            ImageView image = view1.findViewById(R.id.images);
            name.setText(fruitname[i]);
            image.setImageResource(fruitimage[i]);
            return view;
        }
    }
}