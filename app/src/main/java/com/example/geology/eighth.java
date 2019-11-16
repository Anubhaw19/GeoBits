package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class eighth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);
        TextView txt=(TextView)findViewById(R.id.tx8);
        txt.setText("GYPSUM\n\n"+"FORM         : Prismatic crystal,fibrous massive laminated plated\n\n"+"COLOUR       : white ,colourless,grey with shades brown red\n\n"+"LUSTRE       : Vitreous pearly,sillcy,shining,manpaxent,translucent\n\n"+"STREAK       : usually white \n\n"+"CLEAVAGE  : perfect,in four direction \n\n"+
                "FRACTURE   : Conchoidal to sub-concohidal,non-elastic flexible\n\n"+"HARDNESS : 2 \n\n"+"SPECIFIC GRAVITY : Light \n\n");
        ImageView I1=(ImageView)findViewById(R.id.img8);
        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(eighth.this,A8.class);
                startActivity(intent);
            }
        });
    }
}
