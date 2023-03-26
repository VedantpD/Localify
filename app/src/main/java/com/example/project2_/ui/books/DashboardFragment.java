package com.example.project2_.ui.books;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.project2_.GridItemActivity;
import com.example.project2_.R;
import com.example.project2_.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {
    GridView gridView;
    String[] fruitname = {"a","b","c","d","e","f"};
    int[] fruitimage = {R.drawable.ic_home_black_24dp, R.drawable.aa,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_home_black_24dp};
    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(this::onItemClick);
        return root;
    }
    public void NoClicked(View view) {
        // Do something
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }

    private class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return fruitimage.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
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