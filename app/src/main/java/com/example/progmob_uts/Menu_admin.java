package com.example.progmob_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu_admin extends AppCompatActivity {
    Button btndatadiri,btn_daftarDosen,btn_matkul,btn_klola_Krs,btn_dftr_mhs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);

        btndatadiri = (Button) findViewById(R.id.btndatadiri);
        btndatadiri.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol datadiri ", Toast.LENGTH_SHORT).show();

            }
        });

        btn_daftarDosen = (Button) findViewById(R.id.btn_daftarDosen);
        btn_daftarDosen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol daftar dosen ", Toast.LENGTH_SHORT).show();

            }
        });

        btn_dftr_mhs = (Button) findViewById(R.id.btn_dftr_mhs);
        btn_dftr_mhs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol Daftar Mahasiswa ", Toast.LENGTH_SHORT).show();

            }
        });

        btn_klola_Krs = (Button) findViewById(R.id.btn_klola_Krs);
        btn_klola_Krs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol Kelola Krs ", Toast.LENGTH_SHORT).show();

            }
        });

        btndatadiri = (Button) findViewById(R.id.btndatadiri);
        btndatadiri.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda Menekan Tombol datadiri ", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
