package com.yazilim.yazlabiki;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main8Activity extends AppCompatActivity implements View.OnClickListener {
    String a;
    String[] besharfliler = {"MARTI","MERİÇ","KİLER"};
    String[] besharfliler1 = {"METİN","MURAT","KAVUN"};
    Button as,as1,as2,as3,as4,as5,as6,as7,as8,as9,as10,as11,as12,as13,as14,as15,as16,as17,as18,as19,as20,as21;
    Button harf1,harf2,harf3,harf4,harf5,harf6,harf7,harf,harf8,harf9,harf10,harf11,harf12;
    String kelime="";
    int Sayac=0;
    int number;
    TextView textView,textView1;
    Long Süre;
    int Yanlıs;
    Random random= new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        as = findViewById(R.id.button00);
        as1 = findViewById(R.id.button01);
        as2 = findViewById(R.id.button02);
        as3 = findViewById(R.id.button03);
        as4 = findViewById(R.id.button04);
        as5 = findViewById(R.id.button05);
        as6 = findViewById(R.id.button06);
        as7 = findViewById(R.id.buttoN07);
        as8 = findViewById(R.id.button08);
        as9 =findViewById(R.id.button43);
        as10 =findViewById(R.id.button44);
        as11 =findViewById(R.id.button45);
        as12=findViewById(R.id.button46);
        as13=findViewById(R.id.button47);
        as14=findViewById(R.id.button48);
        as15=findViewById(R.id.button49);
        as16 = findViewById(R.id.button50);
        as17 = findViewById(R.id.button51);
        as18 = findViewById(R.id.button52);
        as19 = findViewById(R.id.button53);
        as20= findViewById(R.id.button54);
        as21= findViewById(R.id.button55);
        harf=findViewById(R.id.button56);
        harf1 = findViewById(R.id.button57);
        harf2 = findViewById(R.id.button58);
        harf3 = findViewById(R.id.button59);
        harf4= findViewById(R.id.button60);
        harf5 = findViewById(R.id.button61);
        harf6 = findViewById(R.id.button62);
        harf7 = findViewById(R.id.button63);
        harf8 = findViewById(R.id.button64);
        harf9= findViewById(R.id.button66);
        harf12 = findViewById(R.id.button36);
        textView = findViewById(R.id.textView6);
        textView1 = findViewById(R.id.textView7);
        number=random.nextInt(2)+1;
        if(number==2){
            harf.setText("M");
            harf1.setText("U");
            harf2.setText("E");
            harf3.setText("T");
            harf4.setText("R");
            harf5.setText("İ");
            harf6.setText("N");
            harf7.setText("V");
            harf8.setText("K");
            harf9.setText("A");
        }
        harf.setOnClickListener(this);
        harf1.setOnClickListener(this);
        harf2.setOnClickListener(this);
        harf3.setOnClickListener(this);
        harf4.setOnClickListener(this);
        harf6.setOnClickListener(this);
        harf5.setOnClickListener(this);
        harf7.setOnClickListener(this);
        harf8.setOnClickListener(this);
        harf9.setOnClickListener(this);
        harf12.setOnClickListener(this);
        new CountDownTimer(120000,1000){
            long millisUntilFinished1;
            public void onTick(long millisUntilFinished) {
                if (Sayac<3) {
                    textView1.setText("" + millisUntilFinished / 1000);
                }
                millisUntilFinished1=millisUntilFinished/1000;
            }

            public void onFinish() {
                if (Sayac==3){
                    Süre=millisUntilFinished1;
                }
                textView1.setText(""+millisUntilFinished1);
            }
        }.start();

    }

    @Override
    public void onClick(View v) {
        Button gelenBtn=(Button)v;
        if (number==1){
            if (gelenBtn.getId() == R.id.button56) {
                kelime = kelime +"R";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button57) {
                kelime = kelime + "M";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button58) {
                kelime = kelime + "T";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button59) {
                kelime = kelime +"A";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button60) {
                kelime = kelime + "E";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button61) {
                kelime = kelime + "I";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button62) {
                kelime = kelime + "L";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button63) {
                kelime = kelime + "Ç";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button64) {
                kelime = kelime + "İ";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button66) {
                kelime = kelime + "K";
                textView.setText(kelime);
            }
            a = kelime;
            if (gelenBtn.getId() == R.id.button36) {
                    if (a.contains(besharfliler[0]) && (a.contains("MARTI"))) {
                        as.setText("M");
                        as1.setText("A");
                        as2.setText("R");
                        as3.setText("T");
                        as4.setText("I");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else if (a.contains(besharfliler[1]) && (a.contains("MERİÇ"))) {
                        as.setText("M");
                        as5.setText("E");
                        as6.setText("R");
                        as9.setText("İ");
                        as8.setText("Ç");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);

                    } else if (a.contains(besharfliler[2]) && (a.contains("KİLER"))) {
                        as7.setText("K");
                        as9.setText("İ");
                        as10.setText("L");
                        as11.setText("E");
                        as12.setText("R");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else {     Yanlıs=Yanlıs+1;
                        kelime = "";
                        textView.setText(kelime);
                        Toast.makeText(Main8Activity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız"+Yanlıs, Toast.LENGTH_SHORT).show();
                    }
            if (Sayac == 3) {
                Toast.makeText(Main8Activity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_SHORT).show();
                Toast.makeText(Main8Activity.this, "Toplam yanlış sayınız"+ Yanlıs, Toast.LENGTH_LONG).show();
                Intent intent1 =new Intent(Main8Activity.this,Main5Activity.class);
                startActivity(intent1);
            }}
        }
        if (number==2){
            if (gelenBtn.getId() == R.id.button56) {
                kelime = kelime +"M";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button57) {
                kelime = kelime + "U";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button58) {
                kelime = kelime + "E";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button59) {
                kelime = kelime +"T";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button60) {
                kelime = kelime + "R";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button61) {
                kelime = kelime + "İ";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button62) {
                kelime = kelime + "N";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button63) {
                kelime = kelime + "V";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button64) {
                kelime = kelime + "K";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button66) {
                kelime = kelime + "A";
                textView.setText(kelime);
            }
            a = kelime;
            if (gelenBtn.getId() == R.id.button36) {
                    if (a.contains(besharfliler1[0]) && (a.contains("METİN"))) {
                        as.setText("M");
                        as1.setText("E");
                        as2.setText("T");
                        as3.setText("İ");
                        as4.setText("N");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else if (a.contains(besharfliler1[1]) && (a.contains("MURAT"))) {
                        as.setText("M");
                        as5.setText("U");
                        as6.setText("R");
                        as9.setText("A");
                        as8.setText("T");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);

                    } else if (a.contains(besharfliler1[2]) && (a.contains("KAVUN"))) {
                        as7.setText("K");
                        as9.setText("A");
                        as10.setText("V");
                        as11.setText("U");
                        as12.setText("N");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else{Yanlıs=Yanlıs+1;
                        kelime = "";
                        textView.setText(kelime);
                        Toast.makeText(Main8Activity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız"+Yanlıs, Toast.LENGTH_SHORT).show();
            }}
            if (Sayac == 5) {
                Toast.makeText(Main8Activity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_SHORT).show();
                Toast.makeText(Main8Activity.this, "Toplam yanlış sayınız"+Yanlıs, Toast.LENGTH_LONG).show();
                Intent intent1 =new Intent(Main8Activity.this,Main5Activity.class);
                startActivity(intent1); }

        }


    }}


