package com.example.itecno3.testdos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String simon = "esto es una puebassss ...";

        Toast.makeText(getApplicationContext(),"hola",Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),simon,Toast.LENGTH_SHORT).show();
        

    }
}
