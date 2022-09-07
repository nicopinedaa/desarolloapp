package com.anahuac.anahuac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anahuac.anahuac.adapters.CampusAdapter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity {
    private RecyclerView rvCampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        rvCampus = findViewById(R.id.rv_campus);
        rvCampus.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        ArrayList <String> listCampus = new ArrayList<String>();
        listCampus.add("Cancún");
        listCampus.add("Queretaro");
        listCampus.add("Merida");
        listCampus.add("Xalapa");
        listCampus.add("Cancún");
        listCampus.add("Queretaro");


        CampusAdapter adapter = new CampusAdapter(listCampus);
        rvCampus.setAdapter(adapter);

    }
}