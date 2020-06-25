package com.yazilim.yazlabiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.nio.charset.MalformedInputException;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String a;
    String[] ücharfliler = {"AKÜ", "KAZ", "ZİL", "LAZ"};
    String[] ücharfliler1 = {"PAS", "ALP", "PİS", "SOL"};
    Button as,as1,as2,as3,as4,as5,as6,as7,as8,ent;
    Button harf1,harf2,harf3,harf4,harf5,harf6,harf7,harf;
    String kelime="";
    int Sayac=0,i;
    int number;
    Long Süre;
    int Yanlıs;
    TextView textView,textView1;

  Random random= new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        as = findViewById(R.id.button11);
        as1 = findViewById(R.id.button12);
        as2 = findViewById(R.id.button13);
        as3 = findViewById(R.id.button14);
        as4 = findViewById(R.id.button15);
        as5 = findViewById(R.id.button16);
        as6 = findViewById(R.id.button17);
        as7 = findViewById(R.id.button18);
        as8 = findViewById(R.id.button19);
        harf =findViewById(R.id.button20);
        harf1 = findViewById(R.id.button21);
        harf2=findViewById(R.id.button22);
        harf3 = findViewById(R.id.button23);
        harf4 = findViewById(R.id.button24);
        harf5 = findViewById(R.id.button25);
        harf6 = findViewById(R.id.button26);
        harf7 = findViewById(R.id.button27);
        textView1 = findViewById(R.id.textView7);
        textView = findViewById(R.id.textView);
        number=random.nextInt(2)+1;
        if(number==2){
            harf.setText("O");
            harf1.setText("L");
            harf3.setText("P");
            harf4.setText("A");
            harf5.setText("İ");
            harf6.setText("S");
        }

            harf1.setOnClickListener(this);
            harf3.setOnClickListener(this);
            harf.setOnClickListener(this);
            harf4.setOnClickListener(this);
            harf6.setOnClickListener(this);
            harf5.setOnClickListener(this);
            harf7.setOnClickListener(this);
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
    public void onClick(View v){
        Button gelenBtn=(Button)v;
      if (number==1){
                if (gelenBtn.getId() == R.id.button20) {
                kelime = kelime + "Z";
                textView.setText(kelime);
            }
                if (gelenBtn.getId() == R.id.button21) {
                kelime = kelime + "İ";
                textView.setText(kelime);
            }
                if (gelenBtn.getId() == R.id.button23) {
                    kelime = kelime +"L";
                    textView.setText(kelime);
                }
                if (gelenBtn.getId() == R.id.button24) {
                kelime = kelime + "A";
                textView.setText(kelime);
            }
                if (gelenBtn.getId() == R.id.button25) {
                    kelime = kelime + "K";
                    textView.setText(kelime);
                }
                if (gelenBtn.getId() == R.id.button26) {
                    kelime = kelime + "Ü";
                    textView.setText(kelime);
                }
                a = kelime;
                if (gelenBtn.getId() == R.id.button27) {
                        if (a.contains(ücharfliler[0]) && (a.contains("AKÜ"))) {
                            as.setText("A");
                            as1.setText("K");
                            as2.setText("Ü");
                            Sayac = Sayac + 1;
                            kelime="";
                            textView.setText(kelime);
                        } else if (a.contains(ücharfliler[1]) && (a.contains("KAZ"))) {
                            as1.setText("K");
                            as3.setText("A");
                            as4.setText("Z");
                            Sayac = Sayac + 1;
                            kelime="";
                            textView.setText(kelime);

                        } else if (a.contains(ücharfliler[2]) && (a.contains("ZİL"))) {
                            as4.setText("Z");
                            as5.setText("İ");
                            as6.setText("L");
                            Sayac = Sayac + 1;
                            kelime="";
                            textView.setText(kelime);
                        } else if (a.contains(ücharfliler[3]) && (a.contains("LAZ"))) {
                            as6.setText("L");
                            as7.setText("A");
                            as8.setText("Z");
                            Sayac = Sayac + 1;
                            kelime="";
                            textView.setText(kelime);
                        } else{Yanlıs=Yanlıs+1;
                            kelime="";
                        textView.setText(kelime);
                            Toast.makeText(MainActivity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız"+Yanlıs, Toast.LENGTH_SHORT).show();
                    }
                }
                    if (Sayac == 4) {
                        Toast.makeText(MainActivity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_SHORT).show();
                        Toast.makeText(MainActivity.this, "Toplam yanlış sayınız"+Yanlıs, Toast.LENGTH_LONG).show();
                        Intent intent1 =new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(intent1);
                    }
                    }
        if (number==2){
                if (gelenBtn.getId() == R.id.button20) {
                    kelime = kelime + "O";
                    textView.setText(kelime);
                }
                if (gelenBtn.getId() == R.id.button21) {
                    kelime = kelime + "L";
                    textView.setText(kelime);
                }
                if (gelenBtn.getId() == R.id.button23) {
                    kelime = kelime +"P";
                    textView.setText(kelime);
                }
                if (gelenBtn.getId() == R.id.button24) {
                kelime = kelime + "A";
                textView.setText(kelime);
            }
                if (gelenBtn.getId() == R.id.button25) {
                    kelime = kelime + "İ";
                    textView.setText(kelime);
                }
                if (gelenBtn.getId() == R.id.button26) {
                    kelime = kelime + "S";
                    textView.setText(kelime);
                }


                a = kelime;
                if (gelenBtn.getId() == R.id.button27) {
                        if (a.contains(ücharfliler1[0]) && (a.contains("PAS"))) {
                            as.setText("P");
                            as1.setText("A");
                            as2.setText("S");
                            Sayac = Sayac + 1;
                            kelime="";
                            textView.setText(kelime);
                        } else if (a.contains(ücharfliler1[1]) && (a.contains("ALP"))) {
                            as1.setText("A");
                            as3.setText("L");
                            as4.setText("P");
                            Sayac = Sayac + 1;
                            kelime="";
                            textView.setText(kelime);

                        } else if (a.contains(ücharfliler1[2]) && (a.contains("PİS"))) {
                            as4.setText("P");
                            as5.setText("İ");
                            as6.setText("S");
                            Sayac = Sayac + 1;
                            kelime="";
                            textView.setText(kelime);
                        } else if (a.contains(ücharfliler1[3]) && (a.contains("SOL"))) {
                            as6.setText("S");
                            as7.setText("O");
                            as8.setText("L");
                            Sayac = Sayac + 1;
                            kelime="";
                            textView.setText(kelime);
                        } else{Yanlıs=Yanlıs+1;
                            kelime="";
                            textView.setText(kelime);
                            Toast.makeText(MainActivity.this, "Kelimeyi Bulamadınız.Yanlıs sayınız" +Yanlıs, Toast.LENGTH_SHORT).show();
                    }}
                }
                if (Sayac == 4) {
                    Toast.makeText(MainActivity.this, "Bu Bölümü Tamamladınız", Toast.LENGTH_LONG).show();
                    Toast.makeText(MainActivity.this, "Toplam yanlış sayınız"+Yanlıs, Toast.LENGTH_LONG).show();
                    Intent intent1 =new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent1);
                }
        }

        }





