package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class eighth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);
        TextView txt=(TextView)findViewById(R.id.tx8);
        txt.setText("GYPSUM\n\n"+"FORM         : Prismatic crystal,fibrous massive laminated plated\n\n"+"COLOUR       : white ,colourless,grey with shades brown red\n\n"+"LUSTRE       : Vitreous pearly,sillcy,shining,manpaxent,translucent\n\n"+"STREAK       : usually white \n\n"+"CLEAVAGE  : perfect,in four direction \n\n"+
                "FRACTURE   : Conchoidal to sub-concohidal,non-elastic flexible\n\n"+"HARDNESS : 2 \n\n"+"SPECIFIC GRAVITY : Light \n\n");
    }
}
