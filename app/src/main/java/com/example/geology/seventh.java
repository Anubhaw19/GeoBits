package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class seventh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        TextView txt=(TextView)findViewById(R.id.tx7);
        txt.setText("GALENA\n\n"+"FORM          : Massive Granular\n\n"+"COLOUR      : Blue black to lead grey\n\n"+"LUSTRE       : Metallic bright \n\n"+"STREAK       : Grey black \n\n"+"CLEAVAGE   : Cleavage perfect cubic(100),three set parallel to face of cube \n\n"+
                "FRACTURE   : Sub-Conchoidal,brittle\n\n"+"HARDNESS  : 2-3 \n\n"+"SPECIFIC GRAVITY : High\n\n");
    }
}
