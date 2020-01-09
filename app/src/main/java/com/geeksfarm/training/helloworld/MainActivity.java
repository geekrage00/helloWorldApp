package com.geeksfarm.training.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtAngka;
    Integer angka = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAngka = findViewById(R.id.angka);
    }

    public void tambahAngka(View view){
        angka++;
        txtAngka.setText(angka.toString());
    }


}
