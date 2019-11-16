package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class fifteen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifteen);
        TextView txt=(TextView)findViewById(R.id.tx15);
        txt.setText("QUARTZ\n\n"+"FORM          : Massive granular,horizontally striated prism with pyramids\n\n"+"COLOUR      : Colourless,Smoky white\n\n"+"LUSTRE       : Viterous greasy \n\n"+"STREAK       : Uncoloured \n\n"+"CLEAVAGE   : Absent \n\n"+
                "FRACTURE   : Conchoidal \n\n"+"HARDNESS  : 7 \n\n"+"SPECIFIC GRAVITY : Light \n\n");
        ImageView I15=(ImageView)findViewById(R.id.img15);
        I15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fifteen.this,A15.class);
                startActivity(intent);
            }
        });
    }
}
