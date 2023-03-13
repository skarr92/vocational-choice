package com.sekar.tugasakhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        String kodejurusan = getIntent().getStringExtra("max");
        ImageView logoJurusan = findViewById(R.id.gambarjur);
        TextView textJurusan = findViewById(R.id.namajur);
        TextView deskripsiJurusan = findViewById(R.id.lamajur);
        CardView next = findViewById(R.id.next);
        CardView lihatjurusan = findViewById(R.id.btnJurusan);

        if (kodejurusan.equals("rpl")){
            textJurusan.setText("Rekayasa Perangkat Lunak");
            deskripsiJurusan.setText("3 Tahun Pembelajaran");
            logoJurusan.setImageResource(R.drawable.rpl);

        } else if (kodejurusan.equals("tei")){
            textJurusan.setText("Teknik Elektronika Industri");
            deskripsiJurusan.setText("3 Tahun Pembelajaran");
            logoJurusan.setImageResource(R.drawable.tei);
        } else if (kodejurusan.equals("tptu")){
            textJurusan.setText("Teknik Pendingin dan Tata Udara");
            deskripsiJurusan.setText("3 Tahun Pembelajaran");
            logoJurusan.setImageResource(R.drawable.tptu);
        } else if (kodejurusan.equals("sija")){
            textJurusan.setText("Sistem Informasi Jaringan dan Aplikasi");
            deskripsiJurusan.setText("4 Tahun Pembelajaran");
            logoJurusan.setImageResource(R.drawable.sija);
        } else if (kodejurusan.equals("pfpt")){
            textJurusan.setText("Produksi Film dan Program Televisi");
            deskripsiJurusan.setText("4 Tahun Pembelajaran");
            logoJurusan.setImageResource(R.drawable.pfpt);
        } else if (kodejurusan.equals("meka")){
            textJurusan.setText("Mekatronika");
            deskripsiJurusan.setText("4 Tahun Pembelajaran");
            logoJurusan.setImageResource(R.drawable.meka);
        } else if (kodejurusan.equals("toi")){
            textJurusan.setText("Teknik Otomasi Industri");
            deskripsiJurusan.setText("4 Tahun Pembelajaran");
            logoJurusan.setImageResource(R.drawable.toi);
        } else if (kodejurusan.equals("iop")){
            textJurusan.setText("Instrumentasi Otomatisasi Proses");
            deskripsiJurusan.setText("4 Tahun Pembelajaran");
            logoJurusan.setImageResource(R.drawable.iop);
        } else if (kodejurusan.equals("tedk")){
            textJurusan.setText("Teknik Elektronika Daya dan Komunikasi");
            deskripsiJurusan.setText("4 Tahun Pembelajaran");
            logoJurusan.setImageResource(R.drawable.tedk);
        } else {

        }

        lihatjurusan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Jurusan.class);
                if (kodejurusan.equals("rpl")){
                    intent.putExtra("jurusan", "RPL");
                } else if (kodejurusan.equals("tei")){
                    intent.putExtra("jurusan", "TEI");
                } else if (kodejurusan.equals("tptu")){
                    intent.putExtra("jurusan", "TPTU");
                } else if (kodejurusan.equals("sija")){
                    intent.putExtra("jurusan", "SIJA");
                } else if (kodejurusan.equals("pfpt")){
                    intent.putExtra("jurusan", "PFPT");
                } else if (kodejurusan.equals("meka")){
                    intent.putExtra("jurusan", "MEKA");
                } else if (kodejurusan.equals("toi")){
                    intent.putExtra("jurusan", "TOI");
                } else if (kodejurusan.equals("iop")){
                    intent.putExtra("jurusan", "IOP");
                } else if (kodejurusan.equals("tedk")){
                    intent.putExtra("jurusan", "TEDK");
                }
                startActivity(intent);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}