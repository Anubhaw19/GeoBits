package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class sixth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        TextView txt=(TextView)findViewById(R.id.tx6);
        txt.setText("FLUORITE\n\n"+"FORM          : Octahedral crystal,granular,columnar,masses\n\n"+"COLOUR      : White light green,brown\n\n"+"LUSTRE       : Viterous,transparent to translucent \n\n"+"STREAK       : Colourless \n\n"+"CLEAVAGE   : Perfect(111),four cleavage direction \n\n"+
                "FRACTURE   : Even to sub-conchoidal\n\n"+"HARDNESS  : 4 \n\n"+"SPECIFIC GRAVITY : Medium \n\n");
    }
}
