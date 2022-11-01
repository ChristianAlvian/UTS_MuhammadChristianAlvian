package com.mdp.uts2024240081;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvnama,tvnomor,tvjalur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("UTS Muhammad Christian Alvian");

        tvnama =findViewById(R.id.tv_nama);
        tvnomor = findViewById(R.id.tv_nomor);
        tvjalur =findViewById(R.id.tv_jalur);

        Intent intent = getIntent();
        tvnama.setText(intent.getStringExtra("xNama"));
        tvnomor.setText(intent.getStringExtra("xNomor"));
        tvjalur.setText(intent.getStringExtra("xJalur"));
    }
}