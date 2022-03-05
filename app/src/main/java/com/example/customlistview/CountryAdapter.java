package com.example.customlistview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CountryAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Country> countryList;

    public CountryAdapter(Context context, int layout, List<Country> countryList) {
        this.context = context;
        this.layout = layout;
        this.countryList = countryList;
    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView txtTen = (TextView) view.findViewById(R.id.txtTenNuoc);
        TextView txtThuDo = (TextView) view.findViewById(R.id.txtThuDo);
        ImageView img = (ImageView) view.findViewById(R.id.image);

        Country country = countryList.get(i);
        txtTen.setText(country.getTenNuoc());
        txtThuDo.setText(country.getThuDo());
        img.setImageResource(country.getHinh());
        return view;
    }
}
