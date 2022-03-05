package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvCountry;
    ArrayList<Country> countryArrayList;
    CountryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCountry = (ListView) findViewById(R.id.listviewCountry);

        countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("Việt Nam", "Hà Nội", R.drawable.vietnam));
        countryArrayList.add(new Country("Mỹ", "Washington DC", R.drawable.usa));
        countryArrayList.add(new Country("Liên Bang Nga", "Moskva", R.drawable.nga));

        adapter = new CountryAdapter(this, R.layout.custom_contry_list, countryArrayList);
        lvCountry.setAdapter(adapter);
    }
}