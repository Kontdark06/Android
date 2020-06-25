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

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    String a;
    String[] dortharfliler = {"BUSE","UYKU","UYDU","UFUK","KASK"};
    String[] dortharfliler1 = {"JAVA","AJAN","NENE","EZME","KALE"};
    Button as,as1,as2,as3,as4,as5,as6,as7,as8,as9,as10,as11,as12,as13,as14,as15;
    Button harf1,harf2,harf3,harf4,harf5,harf6,harf7,harf,harf8,harf9,harf10;
    String kelime="";
    int Sayac=0;
    int number;
    TextView textView,textView1;
    Long Süre;
    Random random= new Random();
    int Yanlıs=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        as = findViewById(R.id.button11);
        as1 = findViewById(R.id.button12);
        as2 = findViewById(R.id.button13);
        as3 = findViewById(R.id.button8);
        as4 = findViewById(R.id.button14);
        as5 = findViewById(R.id.button16);
        as6 = findViewById(R.id.button15);
        as7 = findViewById(R.id.button17);
        as8 = findViewById(R.id.button);
        as9 =findViewById(R.id.button4);
        as10 =findViewById(R.id.button18);
        as11 =findViewById(R.id.button2);
        as12=findViewById(R.id.button19);
        as13=findViewById(R.id.button9);
        as14=findViewById(R.id.button10);
        as15=findViewById(R.id.button28);
        harf=findViewById(R.id.button20);
        harf1 = findViewById(R.id.button21);
        harf2 = findViewById(R.id.button22);
        harf3 = findViewById(R.id.button23);
        harf4= findViewById(R.id.button3);
        harf5 = findViewById(R.id.button24);
        harf6 = findViewById(R.id.button25);
        harf7 = findViewById(R.id.button26);
        harf8 = findViewById(R.id.button27);
        harf9= findViewById(R.id.button33);
        textView = findViewById(R.id.textView4);
        textView1 = findViewById(R.id.textView7);
        number=random.nextInt(2)+1;
        if(number==2){
            harf.setText("A");
            harf1.setText("V");
            harf2.setText("N");
            harf3.setText("Z");
            harf4.setText("E");
            harf5.setText("K");
            harf6.setText("L");
            harf7.setText("M");
            harf8.setText("J");
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
                kelime = kelime +"S";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button21) {
                kelime = kelime + "U";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button22) {
                kelime = kelime + "A";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button23) {
                kelime = kelime +"E";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button3) {
                kelime = kelime + "Y";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button24) {
                kelime = kelime + "D";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button25) {
                kelime = kelime + "F";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button26) {
                kelime = kelime + "B";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button27) {
                kelime = kelime + "K";
                textView.setText(kelime);
            }
            a = kelime;
            if (gelenBtn.getId() == R.id.button33) {
                    if (a.contains(dortharfliler[0]) && (a.contains("BUSE"))) {
                        as.setText("B");
                        as1.setText("U");
                        as2.setText("S");
                        as3.setText("E");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else if (a.contains(dortharfliler[1]) && (a.contains("UYKU"))) {
                        as1.setText("U");
                        as4.setText("Y");
                        as5.setText("K");
                        as6.setText("U");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);

                    } else if (a.contains(dortharfliler[2]) && (a.contains("UYDU"))) {
                        as6.setText("U");
                        as7.setText("Y");
                        as8.setText("D");
                        as9.setText("U");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else if (a.contains(dortharfliler[3]) && (a.contains("UFUK"))) {
                        as10.setText("F");
                        as9.setText("U");
                        as11.setText("U");
                        as12.setText("K");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }else if (a.contains(dortharfliler[4]) && (a.contains("KASK"))) {
                        as15.setText("K");
                        as14.setText("A");
                        as13.setText("S");
                        as12.setText("K");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else{
                        Yanlıs=Yanlıs+1;
                kelime = "";
                textView.setText(kelime);
                Toast.makeText(Main4Activity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız"+Yanlıs, Toast.LENGTH_SHORT).show();
                    }
            }
            if (Sayac == 4) {
                Toast.makeText(Main4Activity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_SHORT).show();
                Toast.makeText(Main4Activity.this, "Toplam yanlış sayınız"+Yanlıs, Toast.LENGTH_LONG).show();
                Intent intent1 =new Intent(Main4Activity.this,anasayfa.class);
                startActivity(intent1);

            }
        }
        if (number==2){
            if (gelenBtn.getId() == R.id.button20) {
                kelime = kelime +"A";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button21) {
                kelime = kelime + "V";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button22) {
                kelime = kelime + "N";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button23) {
                kelime = kelime +"Z";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button3) {
                kelime = kelime + "E";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button24) {
                kelime = kelime + "K";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button25) {
                kelime = kelime + "L";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button26) {
                kelime = kelime + "M";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button27) {
                kelime = kelime + "J";
                textView.setText(kelime);
            }
            a = kelime;
            if (gelenBtn.getId() == R.id.button33) {
                    if (a.contains(dortharfliler1[0]) && (a.contains("JAVA"))) {
                        as.setText("J");
                        as1.setText("A");
                        as2.setText("V");
                        as3.setText("A");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else if (a.contains(dortharfliler1[1]) && (a.contains("AJAN"))) {
                        as1.setText("A");
                        as4.setText("J");
                        as5.setText("A");
                        as6.setText("N");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);

                    } else if (a.contains(dortharfliler1[2]) && (a.contains("NENE"))) {
                        as6.setText("N");
                        as7.setText("E");
                        as8.setText("N");
                        as9.setText("E");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else if (a.contains(dortharfliler1[3]) && (a.contains("EZME"))) {
                        as10.setText("Z");
                        as9.setText("E");
                        as11.setText("M");
                        as12.setText("E");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                        else if (a.contains(dortharfliler1[4]) && (a.contains("KALE"))) {
                            as15.setText("K");
                            as14.setText("A");
                            as13.setText("L");
                            as12.setText("E");
                            Sayac = Sayac + 1;
                            kelime="";
                            textView.setText(kelime);
                        }
                     else{ Yanlıs=Yanlıs+1;
                        kelime = "";
                        textView.setText(kelime);
                        Toast.makeText(Main4Activity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız"+Yanlıs, Toast.LENGTH_SHORT).show();
            }}
            if (Sayac == 4) {
                Toast.makeText(Main4Activity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_SHORT).show();
                Toast.makeText(Main4Activity.this, "Toplam yanlış sayınız"+Yanlıs, Toast.LENGTH_LONG).show();
                Intent intent1 =new Intent(Main4Activity.this,anasayfa.class);
                startActivity(intent1);
            }
        }
    }
}
