package com.yazilim.yazlabiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class anasayfa extends AppCompatActivity {
    Button Ac1,Ac2,Ac3;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);
        textView=findViewById(R.id.textView5);
        new CountDownTimer(10000,1000){


            @Override
            public void onTick(long millisUntilFinished) {
            textView.setText("Sayımız :"+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
            textView.setText("Saayım işlemi bitti");
            }
        }.start();
    }


    public void ucharf (View view) {
        Intent intent1 =new Intent(anasayfa.this,MainActivity.class);
        startActivity(intent1);
    }
    public void dortharf (View view) {
        Intent intent1 =new Intent(anasayfa.this,Main3Activity.class);
        startActivity(intent1);
    }
    public void besharf (View view) {
        Intent intent1 =new Intent(anasayfa.this,Main9Activity.class);
        startActivity(intent1);
    }
}
