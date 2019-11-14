package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class fifteen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen);
        TextView txt=(TextView)findViewById(R.id.tx15);
        txt.setText("QUARTZ\n\n"+"FORM          : Massive granular,horizontally striated prism with pyramids\n\n"+"COLOUR      : Colourless,Smoky white\n\n"+"LUSTRE       : Viterous greasy \n\n"+"STREAK       : Uncoloured \n\n"+"CLEAVAGE   : Absent \n\n"+
                "FRACTURE   : Conchoidal \n\n"+"HARDNESS  : 7 \n\n"+"SPECIFIC GRAVITY : Light \n\n");
    }
}
