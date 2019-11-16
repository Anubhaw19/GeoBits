package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class eleventh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);
        TextView txt=(TextView)findViewById(R.id.tx11);
        txt.setText("MICROCLINE\n\n"+"FORM          : Cleavage masses or irregular grains rarely massive cryptocrystalline\n\n"+"COLOUR       : Colourless \n\n"+"LUSTRE        : Viterous pearly transparent or opaque\n\n"+"STREAK       : Colourless \n\n"+"CLEAVAGE   : Two cleavage direction at nearly right angle(001)(010)\n\n"+
                "FRACTURE   : Sub-Conchoidal,uneven  \n\n"+"HARDNESS  : 6 \n\n"+"SPECIFIC GRAVITY : Light \n\n");
        ImageView I11=(ImageView)findViewById(R.id.img11);
        I11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(eleventh.this,A11.class);
                startActivity(intent);
            }
        });
    }
}
