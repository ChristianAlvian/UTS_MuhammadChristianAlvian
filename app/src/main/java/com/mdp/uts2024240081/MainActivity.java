package com.mdp.uts2024240081;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btndaftar;
    EditText etNamalengkap, etNomorPendaftaran;
    Spinner spjalur;
    CheckBox cbkonfirmasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("UTS Muhammad Christian Alvian");

        btndaftar = findViewById(R.id.btn_daftar);
        etNamalengkap = findViewById(R.id.et_NamaLengkap);
        etNomorPendaftaran = findViewById(R.id.et_NomorPendaftaran);
        spjalur = findViewById(R.id.sp_jalur);
        cbkonfirmasi = findViewById(R.id.cb_konfirmasi);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namalengkap, nomorpendaftaran, jalurpendaftaran;


                namalengkap = etNamalengkap.getText().toString();
                nomorpendaftaran = etNomorPendaftaran.getText().toString();
                jalurpendaftaran = spjalur.getSelectedItem().toString();

                if (namalengkap.trim().equals("")){
                    etNamalengkap.setError("Nama Harus Diisi");
                }
                else if (nomorpendaftaran.trim().equals("")){
                    etNomorPendaftaran.setError("Nomor Pendaftaran Harus Diisi");
                }
                else if(!cbkonfirmasi.isChecked()){
                    Toast.makeText(MainActivity.this,"Checkbox ini harus diisi",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("xNama", namalengkap);
                    intent.putExtra("xNomor", nomorpendaftaran);
                    intent.putExtra("xJalur", jalurpendaftaran);
                    startActivity(intent);
                }

            }
        });
    }
}