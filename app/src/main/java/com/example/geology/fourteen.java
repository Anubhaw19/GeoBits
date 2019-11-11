package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class fourteen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen);
        TextView txt=(TextView)findViewById(R.id.tx14);
        txt.setText("ORTHOCLASE\n\n"+"FORM         : Cleavage masses or irregular grains,rarely massive crypto crystalline\n\n"+"COLOUR       : Colourless,white,flesh coloured\n\n"+"LUSTER       : Viterous to pearly transparent or opaque \n\n"+"STREAK       : Colourless or White \n\n"+"CLEAVAGE  : Two cleavage direction at or nearly right angle \n\n"+
                "FRACTURE   : Sub-Conchoidal,uneven,brittle \n\n"+"HARDNESS : 6 \n\n"+"SPECIFIC GRAVITY : Light \n\n");
    }
}
