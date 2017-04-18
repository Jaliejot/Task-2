package com.example.reza.task2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by REZA on 17/04/2017.
 */

public class KOntak extends AppCompatActivity {
    TextView kontaka;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kontak);
        kontaka = (TextView) findViewById(R.id.alamat);
    }
}
