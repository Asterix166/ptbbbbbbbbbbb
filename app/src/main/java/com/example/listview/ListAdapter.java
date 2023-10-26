package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListAdapter extends ArrayAdapter<ListData> {
    public ListAdapter(@NonNull Context context, ArrayList<ListData> dataArrayList) {
        super(context, R.layout.list_item, dataArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        ListData listData = getItem(position);

        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView listImage = view.findViewById(R.id.listImage);
        TextView listName = view.findViewById(R.id.listName);
        TextView listpem = view.findViewById(R.id.listpem);
        TextView listpeng = view.findViewById(R.id.listpeng);
        TextView listkategori = view.findViewById(R.id.listkategori);
        TextView listbayar = view.findViewById(R.id.listbayar);

        listImage.setImageResource(listData.image);
        listName.setText(listData.name);
        listpem.setText(listData.pem);
        listpeng.setText(listData.peng);
        listkategori.setText(listData.kategori);
        listbayar.setText(listData.uang);

        return view;
    }
}