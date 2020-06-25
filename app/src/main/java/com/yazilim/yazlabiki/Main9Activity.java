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

public class Main9Activity extends AppCompatActivity implements View.OnClickListener {
    String a;
    String[] besharfliler = {"MİMAR","MİRAS","KARGO"};
    String[] besharfliler1 = {"İNCİL","İPLİK","KİTAP"};
    Button as,as1,as2,as3,as4,as5,as6,as7,as8,as9,as10,as11,as12,as13,as14,as15,as16,as17,as18,as19,as20,as21;
    Button harf1,harf2,harf3,harf4,harf5,harf6,harf7,harf,harf8,harf9,harf10,harf11,harf12;
    String kelime="";
    int Sayac=0;
    int number;
    TextView textView,textView1;
    Random random= new Random();
    Long Süre;
    int Yanlıs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
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
            harf.setText("İ");
            harf1.setText("N");
            harf2.setText("C");
            harf3.setText("L");
            harf4.setText("K");
            harf5.setText("P");
            harf6.setText("T");
            harf7.setText("A");
        }
        harf.setOnClickListener(this);
        harf1.setOnClickListener(this);
        harf2.setOnClickListener(this);
        harf3.setOnClickListener(this);
        harf4.setOnClickListener(this);
        harf6.setOnClickListener(this);
        harf5.setOnClickListener(this);
        harf7.setOnClickListener(this);
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
                kelime = kelime +"M";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button57) {
                kelime = kelime + "İ";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button58) {
                kelime = kelime + "R";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button59) {
                kelime = kelime +"A";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button60) {
                kelime = kelime + "K";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button61) {
                kelime = kelime + "G";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button62) {
                kelime = kelime + "O";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button63) {
                kelime = kelime + "S";
                textView.setText(kelime);
            }
            a = kelime;
            if (gelenBtn.getId() == R.id.button36) {
                    if (a.contains(besharfliler[0]) && (a.contains("MİMAR"))) {
                        as.setText("M");
                        as1.setText("İ");
                        as2.setText("M");
                        as3.setText("A");
                        as4.setText("R");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else if (a.contains(besharfliler[1]) && (a.contains("MİRAS"))) {
                        as.setText("M");
                        as5.setText("İ");
                        as6.setText("R");
                        as9.setText("A");
                        as8.setText("S");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);

                    } else if (a.contains(besharfliler[2]) && (a.contains("KARGO"))) {
                        as7.setText("K");
                        as9.setText("A");
                        as10.setText("R");
                        as11.setText("G");
                        as12.setText("O");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else
                    {  Yanlıs=Yanlıs+1;
                        kelime = "";
                        textView.setText(kelime);
                        Toast.makeText(Main9Activity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız"+Yanlıs, Toast.LENGTH_SHORT).show();
                    }
                if (Sayac == 3) {
                    Toast.makeText(Main9Activity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_SHORT).show();
                    Intent intent1 =new Intent(Main9Activity.this,Main8Activity.class);
                    startActivity(intent1);
                }}
        }
        if (number==2){
            if (gelenBtn.getId() == R.id.button56) {
                kelime = kelime +"İ";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button57) {
                kelime = kelime + "N";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button58) {
                kelime = kelime + "C";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button59) {
                kelime = kelime +"L";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button60) {
                kelime = kelime + "K";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button61) {
                kelime = kelime + "P";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button62) {
                kelime = kelime + "T";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button63) {
                kelime = kelime + "A";
                textView.setText(kelime);
            }
            a = kelime;
            if (gelenBtn.getId() == R.id.button36) {
                    if (a.contains(besharfliler1[0]) && (a.contains("İNCİL"))) {
                        as.setText("İ");
                        as1.setText("N");
                        as2.setText("C");
                        as3.setText("İ");
                        as4.setText("L");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else if (a.contains(besharfliler1[1]) && (a.contains("İPLİK"))) {
                        as.setText("İ");
                        as5.setText("P");
                        as6.setText("L");
                        as9.setText("İ");
                        as8.setText("K");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);

                    } else if (a.contains(besharfliler1[2]) && (a.contains("KİTAP"))) {
                        as7.setText("K");
                        as9.setText("İ");
                        as10.setText("T");
                        as11.setText("A");
                        as12.setText("P");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else {
                        Yanlıs=Yanlıs+1;
                        kelime = "";
                        textView.setText(kelime);
                        Toast.makeText(Main9Activity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız"+Yanlıs, Toast.LENGTH_SHORT).show();

                    }
            }
            if (Sayac == 3) {
                Toast.makeText(Main9Activity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_SHORT).show();
                Toast.makeText(Main9Activity.this, "Toplam yanlış sayınız"+Yanlıs, Toast.LENGTH_LONG).show();
                Intent intent1 =new Intent(Main9Activity.this,Main8Activity.class);
                startActivity(intent1);
            }

        }


    }}


