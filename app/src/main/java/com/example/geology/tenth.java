package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class tenth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        TextView txt=(TextView)findViewById(R.id.tx10);
        txt.setText("KYANITE\n\n"+"FORM          : Long,tabular crystals,bladed aggregates\n\n"+"COLOUR      : Usually blue or bluish white,grey or green\n\n"+"LUSTRE       : Vitreous to pearly \n"+"STREAK       : Colourless \n"+"CLEAVAGE   : Perfect pinacoidal,one direction,two sets(100,010) \n\n"+
                "FRACTURE   : Uneven,brittle\n"+"HARDNESS  : 5,parallel to length of crystal & 7 at right angles \n\n"+"SPECIFIC GRAVITY : Medium \n");
        ImageView I10=(ImageView)findViewById(R.id.img10);
        I10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(tenth.this,A10.class);
                startActivity(intent);
            }
        });
    }
}
