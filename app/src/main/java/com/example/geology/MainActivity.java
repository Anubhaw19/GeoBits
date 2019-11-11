package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"designed by:ANUBHAW",Toast.LENGTH_LONG).show();
        TextView txt1=(TextView)findViewById(R.id.text1);
        TextView txt2=(TextView)findViewById(R.id.text2);
        TextView txt3=(TextView)findViewById(R.id.text3);
        TextView txt4=(TextView)findViewById(R.id.text4);
        TextView txt5=(TextView)findViewById(R.id.text5);
        TextView txt6=(TextView)findViewById(R.id.text6);
        TextView txt7=(TextView)findViewById(R.id.text7);
        TextView txt8=(TextView)findViewById(R.id.text8);
        TextView txt9=(TextView)findViewById(R.id.text9);
        TextView txt10=(TextView)findViewById(R.id.text10);
        TextView txt11=(TextView)findViewById(R.id.text11);
        TextView txt12=(TextView)findViewById(R.id.text12);
        TextView txt13=(TextView)findViewById(R.id.text13);
        TextView txt14=(TextView)findViewById(R.id.text14);
        TextView txt15=(TextView)findViewById(R.id.text15);
        //setting onCllickListener on each TextView
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,first.class);
                startActivity(intent); }
        });

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,second.class);
                startActivity(intent); }
        });
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,third.class);
                startActivity(intent); }
        });
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,fourth.class);
                startActivity(intent); }
        });
        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,fifth.class);
                startActivity(intent); }
        });
        txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,sixth.class);
                startActivity(intent); }
        });
        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,seventh.class);
                startActivity(intent); }
        });
        txt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,eighth.class);
                startActivity(intent); }
        });
        txt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ninth.class);
                startActivity(intent); }
        });
        txt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,tenth.class);
                startActivity(intent); }
        });
        txt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,eleventh.class);
                startActivity(intent); }
        });
        txt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,twelveth.class);
                startActivity(intent); }
        });
        txt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,thirteenth.class);
                startActivity(intent); }
        });
        txt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,fourteen.class);
                startActivity(intent); }
        });
        txt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,fifteen.class);
                startActivity(intent); }
        });
    }
}
