package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.listview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ListAdapter listAdapter;
    ArrayList<ListData> dataArrayList = new ArrayList<>();
    ListData listData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageList = {R.drawable.food, R.drawable.money, R.drawable.food, R.drawable.money, R.drawable.money, R.drawable.money, R.drawable.money};
        String[] nameList = {"22", "21", "20", "19", "18","17", "18"};
        String[] pemList = {"Rp 0,00", "Rp 700.000,00", "Rp 0,00","Rp 0,00", "Rp 0,00", "Rp 0,00", "Rp 0,00"};
        String[] pengList = {"Rp 800.000,00", "Rp 0,00", "Rp 500.000,00","Rp 0,00", "Rp 0,00", "Rp 0,00", "Rp 0,00"};
        String[] katList = {"Makan", "Gaji", "Makan","Gaji", "Rp 0,00", "Rp 0,00", "Rp 0,00"};
        String[] uangList = {"Tunai", "Bank", "Bank","Rp 0,00", "Rp 0,00", "Rp 0,00", "Rp 0,00"};
        for (int i = 0; i < imageList.length; i++){
            listData = new ListData(nameList[i], pemList[i], pengList[i], katList[i], uangList[i],  imageList[i]);
            dataArrayList.add(listData);
        }
        listAdapter = new ListAdapter(MainActivity.this, dataArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);

        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailedActivity.class);
                intent.putExtra("tanggal", nameList[i]);
                intent.putExtra("pemasukan", pemList[i]);
                intent.putExtra("pengeluaran", pengList[i]);
                intent.putExtra("kategori", katList[i]);
                intent.putExtra("uang", uangList[i]);
                intent.putExtra("image", imageList[i]);
                startActivity(intent);
            }
        });
    }
}