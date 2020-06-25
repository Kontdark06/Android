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

public class Main7Activity extends AppCompatActivity implements View.OnClickListener {

    String a;
    String[] dortharfliler = {"ÜZÜM","ZEKİ","İLÇE","KEÇE"};
    String[] dortharfliler1 = {"TOST","OZON","NANE","KETE"};
    Button as,as1,as2,as3,as4,as5,as6,as7,as8,as9,as10,as11,as12,as13;
    Button harf1,harf2,harf3,harf4,harf5,harf6,harf7,harf,harf8;
    String kelime="";
    int Sayac=0;
    int number;
    int Yanlıs;
    TextView textView,textView1;
    Long Süre;
    Random random= new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        as = findViewById(R.id.button11);
        as1 = findViewById(R.id.button12);
        as2 = findViewById(R.id.button13);
        as3 = findViewById(R.id.button8);
        as4 = findViewById(R.id.button14);
        as5 = findViewById(R.id.button16);
        as6 = findViewById(R.id.button15);
        as7 = findViewById(R.id.button17);
        as8 = findViewById(R.id.button);
        as9 =findViewById(R.id.button18);
        as10 =findViewById(R.id.button4);
        as11 =findViewById(R.id.button2);
        as12=findViewById(R.id.button19);
        harf=findViewById(R.id.button20);
        harf1 = findViewById(R.id.button21);
        harf2=findViewById(R.id.button22);
        harf3 = findViewById(R.id.button23);
        harf4 = findViewById(R.id.button24);
        harf5 = findViewById(R.id.button25);
        harf6 = findViewById(R.id.button26);
        harf7 = findViewById(R.id.button27);
        harf8= findViewById(R.id.button28);
        textView = findViewById(R.id.textView3);
        textView1 = findViewById(R.id.textView7);
        number=random.nextInt(2)+1;
        if(number==2){
            harf.setText("S");
            harf1.setText("Z");
            harf2.setText("O");
            harf3.setText("T");
            harf4.setText("E");
            harf5.setText("A");
            harf6.setText("N");
            harf7.setText("K");
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
            if (gelenBtn.getId() == R.id.button20) {
                kelime = kelime +"K";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button21) {
                kelime = kelime + "Z";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button22) {
                kelime = kelime + "Ü";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button23) {
                kelime = kelime +"M";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button24) {
                kelime = kelime + "Ç";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button25) {
                kelime = kelime + "E";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button26) {
                kelime = kelime + "L";
                textView.setText(kelime);
            }  if (gelenBtn.getId() == R.id.button27) {
                kelime = kelime + "İ";
                textView.setText(kelime);
            }
            a = kelime;
            if (gelenBtn.getId() == R.id.button28) {
                    if (a.contains(dortharfliler[0]) && (a.contains("ÜZÜM"))) {
                        as.setText("Ü");
                        as1.setText("Z");
                        as2.setText("Ü");
                        as3.setText("M");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else if (a.contains(dortharfliler[1]) && (a.contains("ZEKİ"))) {
                        as1.setText("Z");
                        as4.setText("E");
                        as5.setText("K");
                        as6.setText("İ");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);

                    } else if (a.contains(dortharfliler[2]) && (a.contains("İLÇE"))) {
                        as6.setText("İ");
                        as7.setText("L");
                        as8.setText("Ç");
                        as9.setText("E");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else if (a.contains(dortharfliler[3]) && (a.contains("KEÇE"))) {
                        as10.setText("K");
                        as9.setText("E");
                        as11.setText("Ç");
                        as12.setText("E");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else {     Yanlıs=Yanlıs+1;
                        kelime = "";
                        textView.setText(kelime);
                        Toast.makeText(Main7Activity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız"+Yanlıs, Toast.LENGTH_SHORT).show();
                    }
            }
            if (Sayac == 4) {
                Toast.makeText(Main7Activity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_SHORT).show();
                Toast.makeText(Main7Activity.this, "Toplam yanlış sayınız"+Yanlıs, Toast.LENGTH_LONG).show();
                Intent intent1 =new Intent(Main7Activity.this,Main4Activity.class);
                startActivity(intent1);
            }
        }
        if (number==2){
            if (gelenBtn.getId() == R.id.button20) {
                kelime = kelime +"S";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button21) {
                kelime = kelime + "Z";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button22) {
                kelime = kelime + "O";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button23) {
                kelime = kelime +"T";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button24) {
                kelime = kelime + "E";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button25) {
                kelime = kelime + "A";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button26) {
                kelime = kelime + "N";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button27) {
                kelime = kelime + "K";
                textView.setText(kelime);
            }
            a = kelime;
            if (gelenBtn.getId() == R.id.button28) {
                    if (a.contains(dortharfliler1[0]) && (a.contains("TOST"))) {
                        as.setText("T");
                        as1.setText("O");
                        as2.setText("S");
                        as3.setText("T");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else if (a.contains(dortharfliler1[1]) && (a.contains("OZON"))) {
                        as1.setText("O");
                        as4.setText("Z");
                        as5.setText("O");
                        as6.setText("N");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);

                    } else if (a.contains(dortharfliler1[2]) && (a.contains("NANE"))) {
                        as6.setText("N");
                        as7.setText("A");
                        as8.setText("N");
                        as9.setText("E");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else if (a.contains(dortharfliler1[3]) && (a.contains("KETE"))) {
                        as10.setText("K");
                        as9.setText("E");
                        as11.setText("T");
                        as12.setText("E");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else {
                        Yanlıs=Yanlıs+1;
                        kelime = "";
                        textView.setText(kelime);
                        Toast.makeText(Main7Activity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız"+Yanlıs, Toast.LENGTH_SHORT).show();
                    }
            }
            if (Sayac == 4) {
                Toast.makeText(Main7Activity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_SHORT).show();
                Toast.makeText(Main7Activity.this, "Toplam yanlış sayınız"+Yanlıs, Toast.LENGTH_LONG).show();
                Intent intent1 =new Intent(Main7Activity.this,Main4Activity.class);
                startActivity(intent1);
            }
        }
    }
}
