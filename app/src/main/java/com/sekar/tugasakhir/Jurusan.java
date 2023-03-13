package com.sekar.tugasakhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Jurusan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jurusan);

        String kodejurusan = getIntent().getStringExtra("jurusan");

        ImageView kembali = findViewById(R.id.kembali);

        TextView textJurusan = findViewById(R.id.textJurusan);
        TextView deskripsiJurusan = findViewById(R.id.deskripsiJurusan);
        ImageView gambarJurusan = findViewById(R.id.gambarJurusan);
        ImageView logoJurusan = findViewById(R.id.logoJurusan);

        if (kodejurusan.equals("RPL")){
            textJurusan.setText("Rekayasa Perangkat Lunak");
            deskripsiJurusan.setText("\t\t\t RPL atau dalam bahasa Inggris Software Engineering adalah satu bidang profesi yang mendalami cara-cara pengembangan perangkat lunak termasuk pembuatan, pemeliharaan, manajemen organisasi pengembanganan perangkat lunak dan manajemen kualitas. \n\nPembelajaran Kejuruan : \n\t\t 1. Komputer dan Jaringan Dasar \n\t\t 2. Pemrograman Dasar \n\t\t 3. Dasar Desain Grafis \n\t\t 4. Pemodelan Perangkat Lunak \n\t\t 5. Basis Data \n\t\t 6. Pemrograman Berorientasi Obyek \n\t\t 7. Pemrograman Web dan Android \n\t\t 8. Produk Kreatifdan Kewirausahaan");
            gambarJurusan.setImageResource(R.drawable.rpl2);
            logoJurusan.setImageResource(R.drawable.rpl);
        }

        else if (kodejurusan.equals("TEI")){
            textJurusan.setText("Teknik Elektronika Industri");
            deskripsiJurusan.setText("\t\t\t Teknik Elektronika Industri adalah jurusan yang mendidik siswa agar mempunyai kemampuan/ keterampilan kepada anak didik dalam bidang system control dan maintenance peralatan industri berbasis “electrical control” dan “microprocessor”. \n\nPembelajaran Kejuruan : \n\t\t 1. Kerja Bengkel dan Gambar Teknik \n\t\t 2. Dasar Listrik dan Elektronika \n\t\t 3. Dasar Pemrograman \n\t\t 4. Mikroprosessor dan Mikrokontroller \n\t\t 5. Penerapan Rangkaian Elektronika \n\t\t 6. Sistem Pengendali Elektronik \n\t\t 7. Pengendali Sistem Robotik \n\t\t 8. Pemeliharaan Peralatan Elektronika \n\t\t 9. Produk Kreatif dan Kewirausahaan");
            gambarJurusan.setImageResource(R.drawable.tei2);
            logoJurusan.setImageResource(R.drawable.tei);
        }

        else if (kodejurusan.equals("TPTU")){
            textJurusan.setText("Teknik Pendingin dan Tata Udara");
            deskripsiJurusan.setText("\t\t\t Teknik Pendingin dan Tata Udara (Refrigeration) merupakan teknologi pengaturan temperatur udara sesuai dengan kebutuhan yang dikehandaki mencakup kebutuhan ruangan maupun lainnya guna keperluan prosesing pengawetan bahan pangan, meliputi pelayanan/produksi, pemeliharaan dan perawatan (maintenance) dan pengendalian mutu alat-alat pendingin. \n\nPembelajaran Kejuruan : \n\t\t 1. Gambar Teknik Kelistrikan \n\t\t 2. Dasar Listrik dan Elektronika \n\t\t 3. Pekerjaan Dasar Elektromekanik \n\t\t 4. Sistem dan Instalasi Refrigerasi \n\t\t 5. Sistem dan Instalasi Tata Udara \n\t\t 6. Sistem Kontrol Otomatik \n\t\t 7. Kontrol Refrigerasi dan Tata Udara \n\t\t 8. Produk Kreatif dan Kewirausahaan");
            gambarJurusan.setImageResource(R.drawable.tptu2);
            logoJurusan.setImageResource(R.drawable.tptu);
        }

        else if (kodejurusan.equals("SIJA")){
            textJurusan.setText("Sistem Informasi Jaringan dan Aplikasi");
            deskripsiJurusan.setText("\t\t\t Sistem Informatika, Jaringan dan Aplikasi (SIJA) merupakan salah satu Kompetensi Keahlian pada Bidang Keahlian Teknologi informasi dan Komunikasi, Program Keahlian Teknik Komputer dan Informatika. \n\nPembelajaran Kejuruan : \n\t\t 1. Komputer dan Jaringan Dasar \n\t\t 2. Pemrograman Dasar \n\t\t 3. Dasar Desain Grafis \n\t\t 4. Infrastruktur Komputasi Awan (IaaS) \n\t\t 5. Platform Komputasi Awan (PaaS) \n\t\t 6. Layanan Komputasi Awan (SaaS) \n\t\t 7. Sistem Internet of Things (SloT) \n\t\t 8. Sistem Keamanan Jaringan \n\t\t 9. Produk Kreatif dan Kewirausahaan");
            gambarJurusan.setImageResource(R.drawable.sija2);
            logoJurusan.setImageResource(R.drawable.sija);
        }

        else if (kodejurusan.equals("PFPT")){
            textJurusan.setText("Produksi Film dan Program Televisi");
            deskripsiJurusan.setText("\t\t\t Produksi Film dan Program Televisi adalah jurusan yang mempelajari proses produksi dan tata cara penyiaran. \n\nPembelajaran Kejuruan : \n\t\t 1. Komunikasi Massa \n\t\t 2. Dasar Seni Audio Visual \n\t\t 3. Produksi Audio Visual \n\t\t 4. Penulisan Naskah \n\t\t 5. Manajemen Produksi \n\t\t 6. Penyutradaraan \n\t\t 7. Kamera dan Pencahayaan \n\t\t 8. Tata Suara \n\t\t 9. Tata Artistik \n\t\t 10. Editing Audio dan Video \n\t\t 11. Produk Kreatifdan Kewirausahaan");
            gambarJurusan.setImageResource(R.drawable.pfpt2);
            logoJurusan.setImageResource(R.drawable.pfpt);
        }

        else if (kodejurusan.equals("MEKA")){
            textJurusan.setText("Mekatronika");
            deskripsiJurusan.setText("\t\t\t Mekatronika merupakan teknologi atau rekayasa yang menggabungkan teknologi tentang mesin, elektronika, dan informatika untuk merancang, memproduksi, mengoperasikan dan memelihara sistem untuk mencapai tujuan yang diinginkan. \n\nPembelajaran Kejuruan : \n\t\t 1. Teknik Kerja Bengkel  \n\t\t 2. Teknik Dasar Listrik \n\t\t 3. Mikroprosesor dan Mikrokontroller \n\t\t 4. Teknik Kontrol Sistem Mekatronik \n\t\t 5. Sistem Mekatronik Berbasis CAE \n\t\t 6. Sistem Robotik \n\t\t 7. Perawatan Peralatan Mekatronik \n\t\t 8. Produk Kreatif dan Kewirausahaan");
            gambarJurusan.setImageResource(R.drawable.meka2);
            logoJurusan.setImageResource(R.drawable.meka);
        }

        else if (kodejurusan.equals("TOI")){
            textJurusan.setText("Teknik Otomasi Industri");
            deskripsiJurusan.setText("\t\t\t Teknik Otomasi Industri (TOI) merupakan disiplin ilmu yang mempelajari otomatisasi perangkat/sistem.Pemanfaatan sistem kontrol seperti halnya komputer yang digunakan untuk mengendalikan mesin-mesin industri dan kontrol proses untuk menggantikan operator tenaga manusia. \n\nPembelajaran Kejuruan : \n\t\t 1. Gambar Teknik Listrik \n\t\t 2. Dasar Listrik dan Elektronika \n\t\t 3. Pekerjaan Dasar Elektromekanik \n\t\t 4. Piranti Sensor dan Aktuator \n\t\t 5. Sistem Elektromekanik dan Elektronik \n\t\t 6. Sistem Kontrol Elektropneumatik \n\t\t 7. Sistem Kontrol Terprogram \n\t\t 8. Produk Kreatif dan Kewirausahaan");
            gambarJurusan.setImageResource(R.drawable.toi2);
            logoJurusan.setImageResource(R.drawable.toi);
        }

        else if (kodejurusan.equals("IOP")){
            textJurusan.setText("Instrumentasi Otomatisasi Proses");
            deskripsiJurusan.setText("\t\t\t Instrumentasi dan Otomatisasi Proses (IOP) merupakan salah satu Kompetensi Keahlian dari Program Keahlian: Teknik Instrumentasi Industri, dan Bidang Keahlian: Teknologi dan Rekayasa. \n\nPembelajaran Kejuruan : \n\t\t 1. Gambar Teknik \n\t\t 2. Kelistrikan dan Elektronika Instrumentasi \n\t\t 3. Dasar Instrumentasi \n\t\t 4. Menggambar & Merencanakan \n\t\t 5. Pengukuran Besaran IOP \n\t\t 6. Sistem Kendali IOP \n\t\t 7. Pemeliharaan sistem IOP \n\t\t 8. Produk Kreatif dan Kewirausahaan");
            gambarJurusan.setImageResource(R.drawable.iop2);
            logoJurusan.setImageResource(R.drawable.iop);
        }

        else if (kodejurusan.equals("TEDK")){
            textJurusan.setText("Teknik Elektronika Daya dan Komunikasi");
            deskripsiJurusan.setText("\t\t\t Teknik Elektronika Daya dan Komunikasi (TEDK) adalah sebuah jurusan yang mempelajari tentang cara merancang, menginstalasi, perawatan dan melakukan perbaikan peralatan komunikasi dan membangun sistem minimum.  \n\nPembelajaran Kejuruan : \n\t\t 1. Desain dan Mekanik Elektro \n\t\t 2. Dasar Listrik dan Elektronika \n\t\t 3. Bahasa pemrograman mikrokontrol \n\t\t 4. Penerapan Rangkaian Elektronika \n\t\t 5. Transmisi Gelombang Elektromagnetik \n\t\t 6. Instalasi, Perbaikan Perangkat \n\t\t 7. Instalasi dan Perbaikan Sistem Televisi \n\t\t 8. Instalasi, Perbaikan Sistem Komunikasi  \n\t\t 9. Produk Kreatif dan Kewirausahaan");
            gambarJurusan.setImageResource(R.drawable.tedk2);
            logoJurusan.setImageResource(R.drawable.tedk);
        }

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Jurusan.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}