package com.example.m214_03_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new First()).commit();
                return true;

            case R.id.item2:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Second()).commit();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }


    }
}