package com.anahuac.anahuac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anahuac.anahuac.adapters.ListCampusAdapter;
import com.anahuac.anahuac.models.campus;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListCampusActivity extends AppCompatActivity {
    private RecyclerView tvCampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_campus);

        tvCampus =findViewById(R.id.rv_campus);
        ArrayList<campus> listCampus = new ArrayList<>();
        campus c1 = new campus(
                "Universidad Anáhuac - Campus Cancun",
                R.drawable.ic_campus_cancun
        );

        campus c2 = new campus(
               "Universidad Anáhuac - Campus Mayab",
                R.drawable.ic_campus_mayab
        );
        campus c3 = new campus(
                "Universidad Anáhuac - Campus Juan Pablo",
                R.drawable.ic_campus_juanpablo
        );
        campus c4 = new campus(
                "Universidad Anáhuac - Campus México Norte",
                R.drawable.ic_campus_mx_norte
        );
        campus c5 = new campus(
                "Universidad Anáhuac - México Sur",
                R.drawable.ic_campus_mx_sur
        );
        campus c6 = new campus(
                "Universidad Anáhuac - Campus Oaxaca",
                R.drawable.ic_campus_oaxaca
        );
        campus c7 = new campus(
                "Universidad Anáhuac - Campus Online",
                R.drawable.ic_campus_online
        );
        campus c8 = new campus(
                "Universidad Anáhuac - Campus Puebla",
                R.drawable.ic_campus_puebla
        );
        campus c9 = new campus(
                "Universidad Anáhuac - Campus Queretaro",
                R.drawable.ic_campus_queretaro
        );
        campus c10 = new campus(
                "Universidad Anáhuac - Campus Tamaulipas",
                R.drawable.ic_campus_tamaulipas
        );
        campus c11 = new campus(
                "Universidad Anáhuac - Campus Veracruz",
                R.drawable.ic_campus_veracruz
        );
        campus c12 = new campus(
                "Universidad Anáhuac - Campus Veracruz",
                R.drawable.ic_campus_veracruz
        );
        campus c13 = new campus(
                "Universidad Anáhuac - Campus Xalapa",
                R.drawable.ic_campus_xalapa
        );


        listCampus.add(c1);
        listCampus.add(c2);
        listCampus.add(c3);
        listCampus.add(c4);
        listCampus.add(c5);
        listCampus.add(c6);
        listCampus.add(c7);
        listCampus.add(c8);
        listCampus.add(c9);
        listCampus.add(c10);
        listCampus.add(c11);
        listCampus.add(c12);

        tvCampus.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        ListCampusAdapter adapter =new ListCampusAdapter(listCampus);
        tvCampus.setAdapter(adapter);
    }
}