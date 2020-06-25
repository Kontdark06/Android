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

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {
    String a;
    String[] besharfliler = {"BESİN","BURAK","ASABİ","KARTON","KONYA"};
    String[] besharfliler1 = {"KASİS","KİRAZ","AZAMİ","TAYFUN","ZURNA"};
    Button as,as1,as2,as3,as4,as5,as6,as7,as8,as9,as10,as11,as12,as13,as14,as15,as16,as17,as18,as19,as20,as21;
    Button harf1,harf2,harf3,harf4,harf5,harf6,harf7,harf,harf8,harf9,harf10,harf11,harf12;
    String kelime="";
    int Sayac=0;
    int number;
    TextView textView,textView1;
    Long Süre;
    int Yanlıs=0;
    Random random= new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
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
        harf10 = findViewById(R.id.button67);
        harf11 = findViewById(R.id.button68);
        harf12 = findViewById(R.id.button36);
        textView = findViewById(R.id.textView6);
        textView1 = findViewById(R.id.textView7);
        number=random.nextInt(2)+1;
        if(number==2){
            harf.setText("A");
            harf1.setText("İ");
            harf2.setText("K");
            harf3.setText("S");
            harf4.setText("R");
            harf5.setText("Z");
            harf6.setText("T");
            harf7.setText("M");
            harf8.setText("N");
            harf9.setText("Y");
            harf10.setText("F");
            harf11.setText("U");
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
        harf10.setOnClickListener(this);
        harf11.setOnClickListener(this);
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
                kelime = kelime +"B";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button57) {
                kelime = kelime + "U";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button58) {
                kelime = kelime + "R";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button59) {
                kelime = kelime +"E";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button60) {
                kelime = kelime + "S";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button61) {
                kelime = kelime + "İ";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button62) {
                kelime = kelime + "A";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button63) {
                kelime = kelime + "K";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button64) {
                kelime = kelime + "N";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button66) {
                kelime = kelime + "O";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button67) {
                kelime = kelime + "T";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button68) {
                kelime = kelime + "Y";
                textView.setText(kelime);
            }
            a = kelime;
            if (gelenBtn.getId() == R.id.button36) {
                    if (a.contains(besharfliler[0]) && (a.contains("BESİN"))) {
                        as.setText("B");
                        as1.setText("E");
                        as2.setText("S");
                        as3.setText("İ");
                        as4.setText("N");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else if (a.contains(besharfliler[1]) && (a.contains("BURAK"))) {
                        as.setText("B");
                        as5.setText("U");
                        as6.setText("R");
                        as7.setText("A");
                        as8.setText("K");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);

                    } else if (a.contains(besharfliler[2]) && (a.contains("ASABİ"))) {
                        as7.setText("A");
                        as9.setText("S");
                        as10.setText("A");
                        as11.setText("B");
                        as12.setText("İ");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else if (a.contains(besharfliler[3]) && (a.contains("KARTON"))) {
                        as10.setText("A");
                        as13.setText("K");
                        as14.setText("R");
                        as15.setText("T");
                        as16.setText("O");
                        as17.setText("N");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }else if (a.contains(besharfliler[4]) && (a.contains("KONYA"))) {
                        as16.setText("O");
                        as18.setText("K");
                        as19.setText("N");
                        as20.setText("Y");
                        as21.setText("A");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else { Yanlıs=Yanlıs+1;
                        kelime = "";
                        textView.setText(kelime);
                        Toast.makeText(Main5Activity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız"+Yanlıs, Toast.LENGTH_SHORT).show();
                    }
            }
            if (Sayac == 5) {
                Toast.makeText(Main5Activity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_SHORT).show();
                Toast.makeText(Main5Activity.this, "Toplam yanlış sayınız"+Yanlıs, Toast.LENGTH_LONG).show();
                Intent intent1 =new Intent(Main5Activity.this,anasayfa.class);
                startActivity(intent1);
            }
        }
        if (number==2){
            if (gelenBtn.getId() == R.id.button56) {
                kelime = kelime +"A";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button57) {
                kelime = kelime + "İ";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button58) {
                kelime = kelime + "K";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button59) {
                kelime = kelime +"S";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button60) {
                kelime = kelime + "R";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button61) {
                kelime = kelime + "Z";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button62) {
                kelime = kelime + "T";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button63) {
                kelime = kelime + "M";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button64) {
                kelime = kelime + "N";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button66) {
                kelime = kelime + "Y";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button67) {
                kelime = kelime + "F";
                textView.setText(kelime);
            }
            if (gelenBtn.getId() == R.id.button68) {
                kelime = kelime + "U";
                textView.setText(kelime);
            }
            a = kelime;
            if (gelenBtn.getId() == R.id.button36) {
                    if (a.contains(besharfliler1[0]) && (a.contains("KASİS"))) {
                        as.setText("K");
                        as1.setText("A");
                        as2.setText("S");
                        as3.setText("İ");
                        as4.setText("S");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }
                    else if (a.contains(besharfliler1[1]) && (a.contains("KİRAZ"))) {
                        as.setText("K");
                        as5.setText("İ");
                        as6.setText("R");
                        as7.setText("A");
                        as8.setText("Z");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);

                    } else if (a.contains(besharfliler1[2]) && (a.contains("AZAMİ"))) {
                        as7.setText("A");
                        as9.setText("Z");
                        as10.setText("A");
                        as11.setText("B");
                        as12.setText("İ");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else if (a.contains(besharfliler1[3]) && (a.contains("TAYFUN"))) {
                        as10.setText("A");
                        as13.setText("T");
                        as14.setText("Y");
                        as15.setText("F");
                        as16.setText("U");
                        as17.setText("N");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    }else if (a.contains(besharfliler1[4]) && (a.contains("ZURNA"))) {
                        as16.setText("U");
                        as18.setText("Z");
                        as19.setText("R");
                        as20.setText("N");
                        as21.setText("A");
                        Sayac = Sayac + 1;
                        kelime="";
                        textView.setText(kelime);
                    } else { Yanlıs=Yanlıs+1;
                        kelime = "";
                        textView.setText(kelime);
                        Toast.makeText(Main5Activity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız" +Yanlıs, Toast.LENGTH_SHORT).show();
                    }
            }
            if (Sayac == 5) {
                Toast.makeText(Main5Activity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_SHORT).show();
                Toast.makeText(Main5Activity.this, "Toplam yanlış sayınız"+Yanlıs, Toast.LENGTH_LONG).show();
                Intent intent1 =new Intent(Main5Activity.this,anasayfa.class);
                startActivity(intent1); }

            }


    }

}
