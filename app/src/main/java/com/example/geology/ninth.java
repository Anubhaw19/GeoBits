package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ninth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        TextView txt=(TextView)findViewById(R.id.tx9);
        txt.setText("HEMATITE\n\n"+"FORM          : Rarely rhombohedral crystal,massive micaceous radiating reniform\n\n"+"COLOUR      : Dark brown to steel grey to black\n\n"+"LUSTRE       : Metallic to earthy dull translucent \n\n"+"STREAK       : Indian brown,red brown,cherry red \n\n"+"CLEAVAGE   : Parting with nearly cubic angles,cleavage absent\n\n"+
                "FRACTURE   :Uneven Sub-Conchoidal \n\n"+"HARDNESS  : 5 \n\n"+"SPECIFIC GRAVITY : High \n\n");
    }
}
