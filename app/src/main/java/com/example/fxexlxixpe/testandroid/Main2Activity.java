package com.example.fxexlxixpe.testandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void cambiarVista (View view) {
        Intent intetn = new Intent(this, MainActivity.class);
        startActivity(intetn);
    }
}
