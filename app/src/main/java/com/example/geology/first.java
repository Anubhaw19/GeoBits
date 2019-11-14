package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        TextView txt=(TextView)findViewById(R.id.tx1);
        txt.setText("APATITE\n\n"+"FORM         : Prismatic crystalline or Tabular massive granular\n\n"+"COLOUR       : Colourless\n\n"+"LUSTRE       : Viterous to Sub-resinous \n\n"+"STREAK       : Coloureless\n\n"+"CLEAVAGE   : Poor cleavage based\n\n"+
                "FRACTURE   : Conchoidal uneven,brittle\n\n"+"HARDNESS  : 5 \n\n"+"SPECIFIC GRAVITY : Medium \n\n");

    }
}
