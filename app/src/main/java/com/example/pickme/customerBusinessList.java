/*package com.example.pickme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class customerBusinessList extends AppCompatActivity{

    private RecyclerView recyclerView;
    private List<Business> businessList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        businessList = new ArrayList<>();

        businessList.add(
                new Business(
                        "Business #1", "1234 Someplace Drive, Bowie, MD 20715", "Computer Science", 200, R.drawable.bowie
                )
        );

        businessList.add(
                new Business(
                        "Business #2", "1234 Someplace Drive, Annapolis, MD 21401", 1200, 22, R.drawable.annapolis
                )
        );

        businessList.add(
                new Business(
                        "Business #1", "1234 Someplace Drive, Upper Marlboro, MD 20772", 1200, 22, R.drawable.uppermarlboro
                )
        );

        Button logout = findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity();
            }
        });



}

}*/
