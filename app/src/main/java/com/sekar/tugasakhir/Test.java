package com.sekar.tugasakhir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends AppCompatActivity {

    int rpl = 0, tei = 0, toi = 0, pfpt = 0, sija = 0, iop = 0, meka = 0, tptu = 0, tedk = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        CardView next = findViewById(R.id.next);

        RadioButton sts = findViewById(R.id.sts);
        RadioButton ts = findViewById(R.id.ts);
        RadioButton b = findViewById(R.id.b);
        RadioButton s = findViewById(R.id.s);
        RadioButton ss = findViewById(R.id.ss);
        RadioButton sts1 = findViewById(R.id.sts1);
        RadioButton ts1 = findViewById(R.id.ts1);
        RadioButton b1 = findViewById(R.id.b1);
        RadioButton s1 = findViewById(R.id.s1);
        RadioButton ss1 = findViewById(R.id.ss1);
        RadioButton sts2 = findViewById(R.id.sts2);
        RadioButton ts2 = findViewById(R.id.ts2);
        RadioButton b2 = findViewById(R.id.b2);
        RadioButton s2 = findViewById(R.id.s2);
        RadioButton ss2 = findViewById(R.id.ss2);
        RadioButton sts3 = findViewById(R.id.sts3);
        RadioButton ts3 = findViewById(R.id.ts3);
        RadioButton b3 = findViewById(R.id.b3);
        RadioButton s3 = findViewById(R.id.s3);
        RadioButton ss3 = findViewById(R.id.ss3);
        RadioButton sts4 = findViewById(R.id.sts4);
        RadioButton ts4 = findViewById(R.id.ts4);
        RadioButton b4 = findViewById(R.id.b4);
        RadioButton s4 = findViewById(R.id.s4);
        RadioButton ss4 = findViewById(R.id.ss4);
        RadioButton sts5 = findViewById(R.id.sts5);
        RadioButton ts5 = findViewById(R.id.ts5);
        RadioButton b5 = findViewById(R.id.b5);
        RadioButton s5 = findViewById(R.id.s5);
        RadioButton ss5 = findViewById(R.id.ss5);
        RadioButton sts6 = findViewById(R.id.sts6);
        RadioButton ts6 = findViewById(R.id.ts6);
        RadioButton b6 = findViewById(R.id.b6);
        RadioButton s6 = findViewById(R.id.s6);
        RadioButton ss6 = findViewById(R.id.ss6);
        RadioButton sts7 = findViewById(R.id.sts7);
        RadioButton ts7 = findViewById(R.id.ts7);
        RadioButton b7 = findViewById(R.id.b7);
        RadioButton s7 = findViewById(R.id.s7);
        RadioButton ss7 = findViewById(R.id.ss7);
        RadioButton sts8 = findViewById(R.id.sts8);
        RadioButton ts8 = findViewById(R.id.ts8);
        RadioButton b8 = findViewById(R.id.b8);
        RadioButton s8 = findViewById(R.id.s8);
        RadioButton ss8 = findViewById(R.id.ss8);
        RadioButton sts9 = findViewById(R.id.sts9);
        RadioButton ts9 = findViewById(R.id.ts9);
        RadioButton b9 = findViewById(R.id.b9);
        RadioButton s9 = findViewById(R.id.s9);
        RadioButton ss9 = findViewById(R.id.ss9);
        RadioButton sts10 = findViewById(R.id.sts10);
        RadioButton ts10 = findViewById(R.id.ts10);
        RadioButton b10 = findViewById(R.id.b10);
        RadioButton s10 = findViewById(R.id.s10);
        RadioButton ss10 = findViewById(R.id.ss10);
        RadioButton sts11 = findViewById(R.id.sts11);
        RadioButton ts11 = findViewById(R.id.ts11);
        RadioButton b11 = findViewById(R.id.b11);
        RadioButton s11 = findViewById(R.id.s11);
        RadioButton ss11 = findViewById(R.id.ss11);
        RadioButton sts12 = findViewById(R.id.sts12);
        RadioButton ts12 = findViewById(R.id.ts12);
        RadioButton b12 = findViewById(R.id.b12);
        RadioButton s12 = findViewById(R.id.s12);
        RadioButton ss12 = findViewById(R.id.ss12);
        RadioButton sts13 = findViewById(R.id.sts13);
        RadioButton ts13 = findViewById(R.id.ts13);
        RadioButton b13 = findViewById(R.id.b13);
        RadioButton s13 = findViewById(R.id.s13);
        RadioButton ss13 = findViewById(R.id.ss13);
        RadioButton sts14 = findViewById(R.id.sts14);
        RadioButton ts14 = findViewById(R.id.ts14);
        RadioButton b14 = findViewById(R.id.b14);
        RadioButton s14 = findViewById(R.id.s14);
        RadioButton ss14 = findViewById(R.id.ss14);
        RadioButton sts15 = findViewById(R.id.sts15);
        RadioButton ts15 = findViewById(R.id.ts15);
        RadioButton b15 = findViewById(R.id.b15);
        RadioButton s15 = findViewById(R.id.s15);
        RadioButton ss15 = findViewById(R.id.ss15);
        RadioButton sts16 = findViewById(R.id.sts16);
        RadioButton ts16 = findViewById(R.id.ts16);
        RadioButton b16 = findViewById(R.id.b16);
        RadioButton s16 = findViewById(R.id.s16);
        RadioButton ss16 = findViewById(R.id.ss16);
        RadioButton sts17 = findViewById(R.id.sts17);
        RadioButton ts17 = findViewById(R.id.ts17);
        RadioButton b17 = findViewById(R.id.b17);
        RadioButton s17 = findViewById(R.id.s17);
        RadioButton ss17 = findViewById(R.id.ss17);
        RadioButton sts18 = findViewById(R.id.sts18);
        RadioButton ts18 = findViewById(R.id.ts18);
        RadioButton b18 = findViewById(R.id.b18);
        RadioButton s18 = findViewById(R.id.s18);
        RadioButton ss18 = findViewById(R.id.ss18);
        RadioButton sts19 = findViewById(R.id.sts19);
        RadioButton ts19 = findViewById(R.id.ts19);
        RadioButton b19 = findViewById(R.id.b19);
        RadioButton s19 = findViewById(R.id.s19);
        RadioButton ss19 = findViewById(R.id.ss19);
        RadioButton sts20 = findViewById(R.id.sts20);
        RadioButton ts20 = findViewById(R.id.ts20);
        RadioButton b20 = findViewById(R.id.b20);
        RadioButton s20 = findViewById(R.id.s20);
        RadioButton ss20 = findViewById(R.id.ss20);
        RadioButton sts21 = findViewById(R.id.sts21);
        RadioButton ts21 = findViewById(R.id.ts21);
        RadioButton b21 = findViewById(R.id.b21);
        RadioButton s21 = findViewById(R.id.s21);
        RadioButton ss21 = findViewById(R.id.ss21);
        RadioButton sts22 = findViewById(R.id.sts22);
        RadioButton ts22 = findViewById(R.id.ts22);
        RadioButton b22 = findViewById(R.id.b22);
        RadioButton s22 = findViewById(R.id.s22);
        RadioButton ss22 = findViewById(R.id.ss22);
        RadioButton sts23 = findViewById(R.id.sts23);
        RadioButton ts23 = findViewById(R.id.ts23);
        RadioButton b23 = findViewById(R.id.b23);
        RadioButton s23 = findViewById(R.id.s23);
        RadioButton ss23 = findViewById(R.id.ss23);
        RadioButton sts24 = findViewById(R.id.sts24);
        RadioButton ts24 = findViewById(R.id.ts24);
        RadioButton b24 = findViewById(R.id.b24);
        RadioButton s24 = findViewById(R.id.s24);
        RadioButton ss24 = findViewById(R.id.ss24);
        RadioButton sts25 = findViewById(R.id.sts25);
        RadioButton ts25 = findViewById(R.id.ts25);
        RadioButton b25 = findViewById(R.id.b25);
        RadioButton s25 = findViewById(R.id.s25);
        RadioButton ss25 = findViewById(R.id.ss25);
        RadioButton sts26 = findViewById(R.id.sts26);
        RadioButton ts26 = findViewById(R.id.ts26);
        RadioButton b26 = findViewById(R.id.b26);
        RadioButton s26 = findViewById(R.id.s26);
        RadioButton ss26 = findViewById(R.id.ss26);
        RadioButton sts27 = findViewById(R.id.sts27);
        RadioButton ts27 = findViewById(R.id.ts27);
        RadioButton b27 = findViewById(R.id.b27);
        RadioButton s27 = findViewById(R.id.s27);
        RadioButton ss27 = findViewById(R.id.ss27);
        RadioButton sts28 = findViewById(R.id.sts28);
        RadioButton ts28 = findViewById(R.id.ts28);
        RadioButton b28 = findViewById(R.id.b28);
        RadioButton s28 = findViewById(R.id.s28);
        RadioButton ss28 = findViewById(R.id.ss28);
        RadioButton sts29 = findViewById(R.id.sts29);
        RadioButton ts29 = findViewById(R.id.ts29);
        RadioButton b29 = findViewById(R.id.b29);
        RadioButton s29 = findViewById(R.id.s29);
        RadioButton ss29 = findViewById(R.id.ss29);
        RadioButton sts30 = findViewById(R.id.sts30);
        RadioButton ts30 = findViewById(R.id.ts30);
        RadioButton b30 = findViewById(R.id.b30);
        RadioButton s30 = findViewById(R.id.s30);
        RadioButton ss30 = findViewById(R.id.ss30);
        RadioButton sts31 = findViewById(R.id.sts31);
        RadioButton ts31 = findViewById(R.id.ts31);
        RadioButton b31 = findViewById(R.id.b31);
        RadioButton s31 = findViewById(R.id.s31);
        RadioButton ss31 = findViewById(R.id.ss31);
        RadioButton sts32 = findViewById(R.id.sts32);
        RadioButton ts32 = findViewById(R.id.ts32);
        RadioButton b32 = findViewById(R.id.b32);
        RadioButton s32 = findViewById(R.id.s32);
        RadioButton ss32 = findViewById(R.id.ss32);
        RadioButton sts33 = findViewById(R.id.sts33);
        RadioButton ts33 = findViewById(R.id.ts33);
        RadioButton b33 = findViewById(R.id.b33);
        RadioButton s33 = findViewById(R.id.s33);
        RadioButton ss33 = findViewById(R.id.ss33);
        RadioButton sts34 = findViewById(R.id.sts34);
        RadioButton ts34 = findViewById(R.id.ts34);
        RadioButton b34 = findViewById(R.id.b34);
        RadioButton s34 = findViewById(R.id.s34);
        RadioButton ss34 = findViewById(R.id.ss34);
        RadioButton sts35 = findViewById(R.id.sts35);
        RadioButton ts35 = findViewById(R.id.ts35);
        RadioButton b35 = findViewById(R.id.b35);
        RadioButton s35 = findViewById(R.id.s35);
        RadioButton ss35 = findViewById(R.id.ss35);
        RadioButton sts36 = findViewById(R.id.sts36);
        RadioButton ts36 = findViewById(R.id.ts36);
        RadioButton b36 = findViewById(R.id.b36);
        RadioButton s36 = findViewById(R.id.s36);
        RadioButton ss36 = findViewById(R.id.ss36);
        RadioButton sts37 = findViewById(R.id.sts37);
        RadioButton ts37 = findViewById(R.id.ts37);
        RadioButton b37 = findViewById(R.id.b37);
        RadioButton s37 = findViewById(R.id.s37);
        RadioButton ss37 = findViewById(R.id.ss37);
        RadioButton sts38 = findViewById(R.id.sts38);
        RadioButton ts38 = findViewById(R.id.ts38);
        RadioButton b38 = findViewById(R.id.b38);
        RadioButton s38 = findViewById(R.id.s38);
        RadioButton ss38 = findViewById(R.id.ss38);
        RadioButton sts39 = findViewById(R.id.sts39);
        RadioButton ts39 = findViewById(R.id.ts39);
        RadioButton b39 = findViewById(R.id.b39);
        RadioButton s39 = findViewById(R.id.s39);
        RadioButton ss39 = findViewById(R.id.ss39);
        RadioButton sts40 = findViewById(R.id.sts40);
        RadioButton ts40 = findViewById(R.id.ts40);
        RadioButton b40 = findViewById(R.id.b40);
        RadioButton s40 = findViewById(R.id.s40);
        RadioButton ss40 = findViewById(R.id.ss40);
        RadioButton sts41 = findViewById(R.id.sts41);
        RadioButton ts41 = findViewById(R.id.ts41);
        RadioButton b41 = findViewById(R.id.b41);
        RadioButton s41 = findViewById(R.id.s41);
        RadioButton ss41 = findViewById(R.id.ss41);
        RadioButton sts42 = findViewById(R.id.sts42);
        RadioButton ts42 = findViewById(R.id.ts42);
        RadioButton b42 = findViewById(R.id.b42);
        RadioButton s42 = findViewById(R.id.s42);
        RadioButton ss42 = findViewById(R.id.ss42);
        RadioButton sts43 = findViewById(R.id.sts43);
        RadioButton ts43 = findViewById(R.id.ts43);
        RadioButton b43 = findViewById(R.id.b43);
        RadioButton s43 = findViewById(R.id.s43);
        RadioButton ss43 = findViewById(R.id.ss43);
        RadioButton sts44 = findViewById(R.id.sts44);
        RadioButton ts44 = findViewById(R.id.ts44);
        RadioButton b44 = findViewById(R.id.b44);
        RadioButton s44 = findViewById(R.id.s44);
        RadioButton ss44 = findViewById(R.id.ss44);
        RadioButton sts45 = findViewById(R.id.sts45);
        RadioButton ts45 = findViewById(R.id.ts45);
        RadioButton b45 = findViewById(R.id.b45);
        RadioButton s45 = findViewById(R.id.s45);
        RadioButton ss45 = findViewById(R.id.ss45);
        RadioButton sts46 = findViewById(R.id.sts46);
        RadioButton ts46 = findViewById(R.id.ts46);
        RadioButton b46 = findViewById(R.id.b46);
        RadioButton s46 = findViewById(R.id.s46);
        RadioButton ss46 = findViewById(R.id.ss46);
        RadioButton sts47 = findViewById(R.id.sts47);
        RadioButton ts47 = findViewById(R.id.ts47);
        RadioButton b47 = findViewById(R.id.b47);
        RadioButton s47 = findViewById(R.id.s47);
        RadioButton ss47 = findViewById(R.id.ss47);
        RadioButton sts48 = findViewById(R.id.sts48);
        RadioButton ts48 = findViewById(R.id.ts48);
        RadioButton b48 = findViewById(R.id.b48);
        RadioButton s48 = findViewById(R.id.s48);
        RadioButton ss48 = findViewById(R.id.ss48);
        RadioButton sts49 = findViewById(R.id.sts49);
        RadioButton ts49 = findViewById(R.id.ts49);
        RadioButton b49 = findViewById(R.id.b49);
        RadioButton s49 = findViewById(R.id.s49);
        RadioButton ss49 = findViewById(R.id.ss49);
        RadioButton sts50 = findViewById(R.id.sts50);
        RadioButton ts50 = findViewById(R.id.ts50);
        RadioButton b50 = findViewById(R.id.b50);
        RadioButton s50 = findViewById(R.id.s50);
        RadioButton ss50 = findViewById(R.id.ss50);



        sts.setEnabled(false);
        ts.setEnabled(false);
        b.setEnabled(false);
        s.setEnabled(false);
        ss.setEnabled(false);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (sts1.isChecked()) {
                    pfpt = pfpt - 3;
                } else if (ts1.isChecked()) {
                    pfpt = pfpt - 1;
                } else if (b1.isChecked()) {
                    pfpt = pfpt + 0;
                } else if (s1.isChecked()) {
                    pfpt = pfpt + 2;
                } else if (ss1.isChecked()) {
                    pfpt = pfpt + 4;
                }

                if (sts2.isChecked()) {
                    toi = toi - 2;
                    meka = meka - 2;
                    iop = iop - 2;
                    tptu = tptu - 2;
                    tei = tei - 2;
                    tedk = tedk - 2;
                } else if (ts2.isChecked()) {
                    toi = toi - 1;
                    meka = meka - 1;
                    iop = iop - 1;
                    tptu = tptu - 1;
                    tei = tei - 1;
                    tedk = tedk - 1;
                } else if (b2.isChecked()) {
                    toi = toi + 0;
                    meka = meka + 0;
                    iop = iop + 0;
                    tptu = tptu + 0;
                    tei = tei + 0;
                    tedk = tedk + 0;
                } else if (s2.isChecked()) {
                    toi = toi + 1;
                    meka = meka + 1;
                    iop = iop + 1;
                    tptu = tptu + 1;
                    tei = tei + 1;
                    tedk = tedk + 1;
                } else if (ss2.isChecked()) {
                    toi = toi + 2;
                    meka = meka + 2;
                    iop = iop + 2;
                    tptu = tptu + 2;
                    tei = tei + 2;
                    tedk = tedk + 2;
                }

                if (sts3.isChecked()) {
                    toi = toi - 3;
                    meka = meka - 3;
                } else if (ts3.isChecked()) {
                    toi = toi - 1;
                    meka = meka - 1;
                } else if (b3.isChecked()) {
                    toi = toi + 0;
                    meka = meka + 0;
                } else if (s3.isChecked()) {
                    toi = toi + 2;
                    meka = meka + 2;
                } else if (ss3.isChecked()) {
                    toi = toi + 4;
                    meka = meka + 4;
                }

                if (sts4.isChecked()) {
                    rpl = rpl - 3;
                    sija = sija - 3;
                } else if (ts4.isChecked()) {
                    rpl = rpl - 1;
                    sija = sija - 1;
                } else if (b4.isChecked()) {
                    rpl = rpl + 0;
                    sija = sija + 0;
                } else if (s4.isChecked()) {
                    rpl = rpl + 2;
                    sija = sija + 2;
                } else if (ss4.isChecked()) {
                    rpl = rpl + 4;
                    sija = sija + 4;
                }

                if (sts5.isChecked()) {
                    tedk = tedk - 3;
                } else if (ts5.isChecked()) {
                    tedk = tedk - 1;
                } else if (b5.isChecked()) {
                    tedk = tedk + 0;
                } else if (s5.isChecked()) {
                    tedk = tedk + 2;
                } else if (ss5.isChecked()) {
                    tedk = tedk + 4;
                }

                if (sts6.isChecked()) {
                    tei = tei - 3;
                } else if (ts6.isChecked()) {
                    tei = tei - 1;
                } else if (b6.isChecked()) {
                    tei = tei + 0;
                } else if (s6.isChecked()) {
                    tei = tei + 2;
                } else if (ss6.isChecked()) {
                    tei = tei + 4;
                }

                if (sts7.isChecked()) {
                    rpl = rpl - 3;
                } else if (ts7.isChecked()) {
                    rpl = rpl - 1;
                } else if (b7.isChecked()) {
                    rpl = rpl + 0;
                } else if (s7.isChecked()) {
                    rpl = rpl + 2;
                } else if (ss7.isChecked()) {
                    rpl = rpl + 4;
                }

                if (sts8.isChecked()) {
                    tptu = tptu - 3;
                } else if (ts8.isChecked()) {
                    tptu = tptu - 1;
                } else if (b8.isChecked()) {
                    tptu = tptu + 0;
                } else if (s8.isChecked()) {
                    tptu = tptu + 2;
                } else if (ss8.isChecked()) {
                    tptu = tptu + 4;
                }

                if (sts9.isChecked()) {
                    iop = iop - 3;
                } else if (ts9.isChecked()) {
                    iop = iop - 1;
                } else if (b9.isChecked()) {
                    iop = iop + 0;
                } else if (s9.isChecked()) {
                    iop = iop + 2;
                } else if (ss9.isChecked()) {
                    iop = iop + 4;
                }

                if (sts10.isChecked()) {
                    pfpt = pfpt - 3;
                } else if (ts10.isChecked()) {
                    pfpt = pfpt - 1;
                } else if (b10.isChecked()) {
                    pfpt = pfpt + 0;
                } else if (s10.isChecked()) {
                    pfpt = pfpt + 2;
                } else if (ss10.isChecked()) {
                    pfpt = pfpt + 4;
                }

                if (sts11.isChecked()) {
                    toi = toi - 3;
                } else if (ts11.isChecked()) {
                    toi = toi - 1;
                } else if (b11.isChecked()) {
                    toi = toi + 0;
                } else if (s11.isChecked()) {
                    toi = toi + 2;
                } else if (ss11.isChecked()) {
                    toi = toi + 4;
                }

                if (sts12.isChecked()) {
                    meka = meka - 3;
                } else if (ts12.isChecked()) {
                    meka = meka - 1;
                } else if (b12.isChecked()) {
                    meka = meka + 0;
                } else if (s12.isChecked()) {
                    meka = meka + 2;
                } else if (ss12.isChecked()) {
                    meka = meka + 4;
                }

                if (sts13.isChecked()) {
                    rpl = rpl - 3;
                    sija = sija - 3;
                } else if (ts13.isChecked()) {
                    rpl = rpl - 1;
                    sija = sija - 1;
                } else if (b13.isChecked()) {
                    rpl = rpl + 0;
                    sija = sija + 0;
                } else if (s13.isChecked()) {
                    rpl = rpl + 2;
                    sija = sija + 2;
                } else if (ss13.isChecked()) {
                    rpl = rpl + 4;
                    sija = sija + 4;
                }

                if (sts14.isChecked()) {
                    tedk = tedk - 3;
                } else if (ts14.isChecked()) {
                    tedk = tedk - 1;
                } else if (b14.isChecked()) {
                    tedk = tedk + 0;
                } else if (s14.isChecked()) {
                    tedk = tedk + 2;
                } else if (ss14.isChecked()) {
                    tedk = tedk + 4;
                }

                if (sts15.isChecked()) {
                    tei = tei - 3;
                } else if (ts15.isChecked()) {
                    tei = tei - 1;
                } else if (b15.isChecked()) {
                    tei = tei + 0;
                } else if (s15.isChecked()) {
                    tei = tei + 2;
                } else if (ss15.isChecked()) {
                    tei = tei + 4;
                }

                if (sts16.isChecked()) {
                    rpl = rpl - 3;
                    sija = sija - 3;
                } else if (ts16.isChecked()) {
                    rpl = rpl - 1;
                    sija = sija - 1;
                } else if (b16.isChecked()) {
                    rpl = rpl + 0;
                    sija = sija + 0;
                } else if (s16.isChecked()) {
                    rpl = rpl + 2;
                    sija = sija + 2;
                } else if (ss16.isChecked()) {
                    rpl = rpl + 4;
                    sija = sija + 4;
                }

                if (sts17.isChecked()) {
                    toi = toi - 2;
                    meka = meka - 2;
                    iop = iop - 2;
                    tptu = tptu - 2;
                    tei = tei - 2;
                    tedk = tedk - 2;
                } else if (ts17.isChecked()) {
                    toi = toi - 1;
                    meka = meka - 1;
                    iop = iop - 1;
                    tptu = tptu - 1;
                    tei = tei - 1;
                    tedk = tedk - 1;
                } else if (b17.isChecked()) {
                    toi = toi + 0;
                    meka = meka + 0;
                    iop = iop + 0;
                    tptu = tptu + 0;
                    tei = tei + 0;
                    tedk = tedk + 0;
                } else if (s17.isChecked()) {
                    toi = toi + 1;
                    meka = meka + 1;
                    iop = iop + 1;
                    tptu = tptu + 1;
                    tei = tei + 1;
                    tedk = tedk + 1;
                } else if (ss17.isChecked()) {
                    toi = toi + 2;
                    meka = meka + 2;
                    iop = iop + 2;
                    tptu = tptu + 2;
                    tei = tei + 2;
                    tedk = tedk + 2;
                }

                if (sts18.isChecked()) {
                    iop = iop - 3;
                } else if (ts18.isChecked()) {
                    iop = iop - 1;
                } else if (b18.isChecked()) {
                    iop = iop + 0;
                } else if (s18.isChecked()) {
                    iop = iop + 2;
                } else if (ss18.isChecked()) {
                    iop = iop + 4;
                }

                if (sts19.isChecked()) {
                    pfpt = pfpt - 3;
                } else if (ts19.isChecked()) {
                    pfpt = pfpt - 1;
                } else if (b19.isChecked()) {
                    pfpt = pfpt + 0;
                } else if (s19.isChecked()) {
                    pfpt = pfpt + 2;
                } else if (ss19.isChecked()) {
                    pfpt = pfpt + 4;
                }

                if (sts20.isChecked()) {
                    toi = toi - 3;
                } else if (ts20.isChecked()) {
                    toi = toi - 1;
                } else if (b20.isChecked()) {
                    toi = toi + 0;
                } else if (s20.isChecked()) {
                    toi = toi + 2;
                } else if (ss20.isChecked()) {
                    toi = toi + 4;
                }

                if (sts21.isChecked()) {
                    meka = meka - 3;
                } else if (ts21.isChecked()) {
                    meka = meka - 1;
                } else if (b21.isChecked()) {
                    meka = meka + 0;
                } else if (s21.isChecked()) {
                    meka = meka + 2;
                } else if (ss21.isChecked()) {
                    meka = meka + 4;
                }

                if (sts22.isChecked()) {
                    sija = sija - 3;
                } else if (ts22.isChecked()) {
                    sija = sija - 1;
                } else if (b22.isChecked()) {
                    sija = sija + 0;
                } else if (s22.isChecked()) {
                    sija = sija + 2;
                } else if (ss22.isChecked()) {
                    sija = sija + 4;
                }

                if (sts23.isChecked()) {
                    tei = tei - 3;
                } else if (ts23.isChecked()) {
                    tei = tei - 1;
                } else if (b23.isChecked()) {
                    tei = tei + 0;
                } else if (s23.isChecked()) {
                    tei = tei + 2;
                } else if (ss23.isChecked()) {
                    tei = tei + 4;
                }

                if (sts24.isChecked()) {
                    tedk = tedk - 3;
                } else if (ts24.isChecked()) {
                    tedk = tedk - 1;
                } else if (b24.isChecked()) {
                    tedk = tedk + 0;
                } else if (s24.isChecked()) {
                    tedk = tedk + 2;
                } else if (ss24.isChecked()) {
                    tedk = tedk + 4;
                }

                if (sts25.isChecked()) {
                    pfpt = pfpt - 3;
                } else if (ts25.isChecked()) {
                    pfpt = pfpt - 1;
                } else if (b25.isChecked()) {
                    pfpt = pfpt + 0;
                } else if (s25.isChecked()) {
                    pfpt = pfpt + 2;
                } else if (ss25.isChecked()) {
                    pfpt = pfpt + 4;
                }

                if (sts26.isChecked()) {
                    rpl = rpl - 3;
                } else if (ts26.isChecked()) {
                    rpl = rpl - 1;
                } else if (b26.isChecked()) {
                    rpl = rpl + 0;
                } else if (s26.isChecked()) {
                    rpl = rpl + 2;
                } else if (ss26.isChecked()) {
                    rpl = rpl + 4;
                }

                if (sts27.isChecked()) {
                    tptu = tptu - 3;
                } else if (ts27.isChecked()) {
                    tptu = tptu - 1;
                } else if (b27.isChecked()) {
                    tptu = tptu + 0;
                } else if (s27.isChecked()) {
                    tptu = tptu + 2;
                } else if (ss27.isChecked()) {
                    tptu = tptu + 4;
                }

                if (sts28.isChecked()) {
                    iop = iop - 3;
                } else if (ts28.isChecked()) {
                    iop = iop - 1;
                } else if (b28.isChecked()) {
                    iop = iop + 0;
                } else if (s28.isChecked()) {
                    iop = iop + 2;
                } else if (ss28.isChecked()) {
                    iop = iop + 4;
                }

                if (sts29.isChecked()) {
                    pfpt = pfpt - 3;
                } else if (ts29.isChecked()) {
                    pfpt = pfpt - 1;
                } else if (b29.isChecked()) {
                    pfpt = pfpt + 0;
                } else if (s29.isChecked()) {
                    pfpt = pfpt + 2;
                } else if (ss29.isChecked()) {
                    pfpt = pfpt + 4;
                }

                if (sts30.isChecked()) {
                    toi = toi - 3;
                } else if (ts30.isChecked()) {
                    toi = toi - 1;
                } else if (b30.isChecked()) {
                    toi = toi + 0;
                } else if (s30.isChecked()) {
                    toi = toi + 2;
                } else if (ss30.isChecked()) {
                    toi = toi + 4;
                }

                if (sts31.isChecked()) {
                    meka = meka - 3;
                    tei = tei - 3;
                } else if (ts31.isChecked()) {
                    meka = meka - 1;
                    tei = tei - 1;
                } else if (b31.isChecked()) {
                    meka = meka + 0;
                    tei = tei + 0;
                } else if (s31.isChecked()) {
                    meka = meka + 2;
                    tei = tei + 2;
                } else if (ss31.isChecked()) {
                    meka = meka + 4;
                    tei = tei + 4;
                }

                if (sts32.isChecked()) {
                    tedk = tedk - 3;
                    sija = sija - 3;
                } else if (ts32.isChecked()) {
                    tedk = tedk - 1;
                    sija = sija - 1;
                } else if (b32.isChecked()) {
                    tedk = tedk + 0;
                    sija = sija + 0;
                } else if (s32.isChecked()) {
                    tedk = tedk + 2;
                    sija = sija + 2;
                } else if (ss32.isChecked()) {
                    tedk = tedk + 4;
                    sija = sija + 4;
                }

                if (sts33.isChecked()) {
                    tedk = tedk - 3;
                } else if (ts33.isChecked()) {
                    tedk = tedk - 1;
                } else if (b33.isChecked()) {
                    tedk = tedk + 0;
                } else if (s33.isChecked()) {
                    tedk = tedk + 2;
                } else if (ss33.isChecked()) {
                    tedk = tedk + 4;
                }

                if (sts34.isChecked()) {
                    tei = tei - 3;
                } else if (ts34.isChecked()) {
                    tei = tei - 1;
                } else if (b34.isChecked()) {
                    tei = tei + 0;
                } else if (s34.isChecked()) {
                    tei = tei + 2;
                } else if (ss34.isChecked()) {
                    tei = tei + 4;
                }

                if (sts35.isChecked()) {
                    rpl = rpl - 3;
                } else if (ts35.isChecked()) {
                    rpl = rpl - 1;
                } else if (b35.isChecked()) {
                    rpl = rpl + 0;
                } else if (s35.isChecked()) {
                    rpl = rpl + 2;
                } else if (ss35.isChecked()) {
                    rpl = rpl + 4;
                }

                if (sts36.isChecked()) {
                    tptu = tptu - 3;
                } else if (ts36.isChecked()) {
                    tptu = tptu - 1;
                } else if (b36.isChecked()) {
                    tptu = tptu + 0;
                } else if (s36.isChecked()) {
                    tptu = tptu + 2;
                } else if (ss36.isChecked()) {
                    tptu = tptu + 4;
                }

                if (sts37.isChecked()) {
                    iop = iop - 3;
                } else if (ts37.isChecked()) {
                    iop = iop - 1;
                } else if (b37.isChecked()) {
                    iop = iop + 0;
                } else if (s37.isChecked()) {
                    iop = iop + 2;
                } else if (ss37.isChecked()) {
                    iop = iop + 4;
                }

                if (sts38.isChecked()) {
                    pfpt = pfpt - 3;
                } else if (ts38.isChecked()) {
                    pfpt = pfpt - 1;
                } else if (b38.isChecked()) {
                    pfpt = pfpt + 0;
                } else if (s38.isChecked()) {
                    pfpt = pfpt + 2;
                } else if (ss38.isChecked()) {
                    pfpt = pfpt + 4;
                }

                if (sts39.isChecked()) {
                    toi = toi - 3;
                } else if (ts39.isChecked()) {
                    toi = toi - 1;
                } else if (b39.isChecked()) {
                    toi = toi + 0;
                } else if (s39.isChecked()) {
                    toi = toi + 2;
                } else if (ss39.isChecked()) {
                    toi = toi + 4;
                }

                if (sts40.isChecked()) {
                    meka = meka - 3;
                } else if (ts40.isChecked()) {
                    meka = meka - 1;
                } else if (b40.isChecked()) {
                    meka = meka + 0;
                } else if (s40.isChecked()) {
                    meka = meka + 2;
                } else if (ss40.isChecked()) {
                    meka = meka + 4;
                }

                if (sts41.isChecked()) {
                    tptu = tptu - 3;
                } else if (ts41.isChecked()) {
                    tptu = tptu - 1;
                } else if (b41.isChecked()) {
                    tptu = tptu + 0;
                } else if (s41.isChecked()) {
                    tptu = tptu + 2;
                } else if (ss41.isChecked()) {
                    tptu = tptu + 4;
                }

                if (sts42.isChecked()) {
                    sija = sija - 3;
                } else if (ts42.isChecked()) {
                    sija = sija - 1;
                } else if (b42.isChecked()) {
                    sija = sija + 0;
                } else if (s42.isChecked()) {
                    sija = sija + 2;
                } else if (ss42.isChecked()) {
                    sija = sija + 4;
                }

                if (sts43.isChecked()) {
                    tei = tei - 3;
                } else if (ts43.isChecked()) {
                    tei = tei - 1;
                } else if (b43.isChecked()) {
                    tei = tei + 0;
                } else if (s43.isChecked()) {
                    tei = tei + 2;
                } else if (ss43.isChecked()) {
                    tei = tei + 4;
                }

                if (sts44.isChecked()) {
                    toi = toi - 3;
                } else if (ts44.isChecked()) {
                    toi = toi - 1;
                } else if (b44.isChecked()) {
                    toi = toi + 0;
                } else if (s44.isChecked()) {
                    toi = toi + 2;
                } else if (ss44.isChecked()) {
                    toi = toi + 4;
                }

                if (sts45.isChecked()) {
                    rpl = rpl - 3;
                    sija = sija - 3;
                } else if (ts45.isChecked()) {
                    rpl = rpl - 1;
                    sija = sija - 1;
                } else if (b45.isChecked()) {
                    rpl = rpl + 0;
                    sija = sija + 0;
                } else if (s45.isChecked()) {
                    rpl = rpl + 2;
                    sija = sija + 2;
                } else if (ss45.isChecked()) {
                    rpl = rpl + 4;
                    sija = sija + 4;
                }

                if (sts46.isChecked()) {
                    iop = iop - 3;
                } else if (ts46.isChecked()) {
                    iop = iop - 1;
                } else if (b46.isChecked()) {
                    iop = iop + 0;
                } else if (s46.isChecked()) {
                    iop = iop + 2;
                } else if (ss46.isChecked()) {
                    iop = iop + 4;
                }

                if (sts47.isChecked()) {
                    toi = toi - 3;
                } else if (ts47.isChecked()) {
                    toi = toi - 1;
                } else if (b47.isChecked()) {
                    toi = toi + 0;
                } else if (s47.isChecked()) {
                    toi = toi + 2;
                } else if (ss47.isChecked()) {
                    toi = toi + 4;
                }

                if (sts48.isChecked()) {
                    tptu = tptu - 3;
                } else if (ts48.isChecked()) {
                    tptu = tptu - 1;
                } else if (b48.isChecked()) {
                    tptu = tptu + 0;
                } else if (s48.isChecked()) {
                    tptu = tptu + 2;
                } else if (ss48.isChecked()) {
                    tptu = tptu + 4;
                }

                if (sts49.isChecked()) {
                    tptu = tptu - 3;
                } else if (ts49.isChecked()) {
                    tptu = tptu - 1;
                } else if (b49.isChecked()) {
                    tptu = tptu + 0;
                } else if (s49.isChecked()) {
                    tptu = tptu + 2;
                } else if (ss49.isChecked()) {
                    tptu = tptu + 4;
                }

                if (sts50.isChecked()) {
                    pfpt = pfpt - 3;
                } else if (ts50.isChecked()) {
                    pfpt = pfpt - 1;
                } else if (b50.isChecked()) {
                    pfpt = pfpt + 0;
                } else if (s50.isChecked()) {
                    pfpt = pfpt + 2;
                } else if (ss50.isChecked()) {
                    pfpt = pfpt + 4;
                }

                Intent goingResult = new Intent(getApplicationContext(), Hasil.class);

                    if (rpl >= tei && rpl >= toi && rpl >= sija && rpl >= iop && rpl >= pfpt && rpl >= meka && rpl >= tedk && rpl >= tptu) {
                        goingResult.putExtra("max", "rpl");
                    } else if (sija >= tei && sija >= toi && sija >= rpl && sija >= iop && sija >= pfpt && sija >= meka && sija >= tedk && sija >= tptu) {
                        goingResult.putExtra("max", "sija");
                    } else if (tei >= sija && tei >= toi && tei >= rpl && tei >= iop && tei >= pfpt && tei >= meka && tei >= tedk && tei >= tptu) {
                        goingResult.putExtra("max", "tei");
                    } else if (toi >= sija && toi >= tei && toi >= rpl && toi >= iop && toi >= pfpt && toi >= meka && toi >= tedk && toi >= tptu) {
                        goingResult.putExtra("max", "toi");
                    } else if (tedk >= sija && tedk >= tei && tedk >= rpl && tedk >= iop && tedk >= pfpt && tedk >= meka && tedk >= toi && tedk >= tptu) {
                        goingResult.putExtra("max", "tedk");
                    } else if (tptu >= sija && tptu >= tei && tptu >= rpl && tptu >= iop && tptu >= pfpt && tptu >= meka && tptu >= toi && tptu >= tedk) {
                        goingResult.putExtra("max", "tptu");
                    } else if (meka >= sija && meka >= tei && meka >= rpl && meka >= iop && meka >= pfpt && meka >= tptu && meka >= toi && meka >= tedk) {
                        goingResult.putExtra("max", "meka");
                    } else if (iop >= sija && iop >= tei && iop >= rpl && iop >= meka && iop >= pfpt && iop >= tptu && iop >= toi && iop >= tedk) {
                        goingResult.putExtra("max", "iop");
                    } else if (pfpt >= sija && pfpt >= tei && pfpt >= rpl && pfpt >= meka && pfpt >= iop && pfpt >= tptu && pfpt >= toi && pfpt >= tedk) {
                        goingResult.putExtra("max", "pfpt");
                    }

                    startActivity(goingResult);
                    finish();
            }
        });
    }
}