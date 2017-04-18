package com.example.reza.task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Home (View H){
        Intent home = new Intent(this,HOme.class);
        startActivity(home);
    }

    public void proFile(View p){
        Intent profilE = new Intent(this, Profile.class);
        startActivity(profilE);
    }

    public void kOntak(View k){
        Intent kontak = new Intent(this,KOntak.class);
        startActivity(kontak);
    }
}
