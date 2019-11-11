package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        TextView txt=(TextView)findViewById(R.id.tx3);
        txt.setText("BERYL\n\n"+"FORM          : Crystal large,prismatic crystal\n\n"+"COLOUR      : Bluish green,colourless,yellow\n\n"+"LUSTER       : Vitreous transparent to translucent \n\n"+"STREAK       : Colourless \n\n"+"CLEAVAGE   : Poor basal cleavage imperfect \n\n"+
                "FRACTURE   : Conchoidal,brittle\n\n"+"HARDNESS  : 8 \n\n"+"SPECIFIC GRAVITY : Low \n\n");
    }
}

