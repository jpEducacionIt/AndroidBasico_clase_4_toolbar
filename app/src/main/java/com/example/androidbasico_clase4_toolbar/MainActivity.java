package com.example.androidbasico_clase4_toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbarLayout);
        constraintLayout = findViewById(R.id.constraintLayout);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        switch (itemId) {
            case R.id.opcionToast:
                Toast.makeText(this, "Ha presionado la opcion toast", Toast.LENGTH_LONG).show();
                break;
            case R.id.opcionSnack:
                Snackbar.make(constraintLayout, "Ha presionado la opcion de SnackBack", Snackbar.LENGTH_LONG).show();
                break;
            default:
                finish();
                break;
        }
        return true;
    }
}