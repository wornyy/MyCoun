package com.example.parkheewon.mycoun1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {
    FloatingActionMenu floatingActionMenu;
    FloatingActionButton floatingActionList, floatingActionAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionMenu = (FloatingActionMenu)findViewById(R.id.floatingActionMenu);
        floatingActionList = (FloatingActionButton)findViewById(R.id.floatingActionList);
        floatingActionAdd = (FloatingActionButton)findViewById(R.id.floatingActionAdd);

        floatingActionList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ListActivity.class));


            }
        });

        floatingActionAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddActivity.class));


            }
        });
    }
}
