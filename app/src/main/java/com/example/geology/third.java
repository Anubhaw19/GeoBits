package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView txt=(TextView)findViewById(R.id.tx3);
        txt.setText("BERYL\n\n"+"FORM          : Crystal large,prismatic crystal\n\n"+"COLOUR      : Bluish green,colourless,yellow\n\n"+"LUSTRE       : Vitreous transparent to translucent \n\n"+"STREAK       : Colourless \n\n"+"CLEAVAGE   : Poor basal cleavage imperfect \n\n"+
                "FRACTURE   : Conchoidal,brittle\n\n"+"HARDNESS  : 8 \n\n"+"SPECIFIC GRAVITY : Low \n\n");
        ImageView I3=(ImageView)findViewById(R.id.img3);
        I3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(third.this,A3.class);
                startActivity(intent);
            }
        });
    }
}

