package com.sekar.tugasakhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView Rpl, Tei, Tptu, Sija, Toi, Meka, Tedk, Iop, Pfpt, test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Rpl = findViewById(R.id.btnRpl);
        Tei = findViewById(R.id.btnTei);
        Tptu = findViewById(R.id.btnTptu);
        Sija = findViewById(R.id.btnSija);
        Toi = findViewById(R.id.btnToi);
        Meka = findViewById(R.id.btnMeka);
        Tedk = findViewById(R.id.btnTedk);
        Iop = findViewById(R.id.btnIop);
        Pfpt = findViewById(R.id.btnPfpt);
        test = findViewById(R.id.btnTest);

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Test.class);
                startActivity(i);
            }
        });

        Rpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Jurusan.class);
                i.putExtra("jurusan", "RPL");
                startActivity(i);
            }
        });

        Tei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Jurusan.class);
                i.putExtra("jurusan", "TEI");
                startActivity(i);
            }
        });

        Tptu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Jurusan.class);
                i.putExtra("jurusan", "TPTU");
                startActivity(i);
            }
        });

        Sija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Jurusan.class);
                i.putExtra("jurusan", "SIJA");
                startActivity(i);
            }
        });

        Toi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Jurusan.class);
                i.putExtra("jurusan", "TOI");
                startActivity(i);
            }
        });

        Meka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Jurusan.class);
                i.putExtra("jurusan", "MEKA");
                startActivity(i);
            }
        });

        Tedk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Jurusan.class);
                i.putExtra("jurusan", "TEDK");
                startActivity(i);
            }
        });

        Iop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Jurusan.class);
                i.putExtra("jurusan", "IOP");
                startActivity(i);
            }
        });

        Pfpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, Jurusan.class);
                i.putExtra("jurusan", "PFPT");
                startActivity(i);
            }
        });
    }
}