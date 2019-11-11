package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class twelveth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelveth);
        TextView txt=(TextView)findViewById(R.id.tx12);
        txt.setText("MOSCOVITE\n\n"+"FORM          : Prismatic crystal,foliated,scaly,tabular,thin laminae\n\n"+"COLOUR      : Colourless,brown when thick,green,red\n\n"+"LUSTER       : Viterous to silky or pearly,transparent\n\n"+"STREAK       : Colourless or white \n\n"+"CLEAVAGE   : Parallel,one set,elastic flexible \n\n"+
                "FRACTURE   : Even,mostly in thin flakes\n\n"+"HARDNESS  : 2 \n\n"+"SPECIFIC GRAVITY : Light \n\n");
    }
}
