package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class seventh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        TextView txt=(TextView)findViewById(R.id.tx7);
        txt.setText("GALENA\n\n"+"FORM          : Massive Granular\n\n"+"COLOUR      : Blue black to lead grey\n\n"+"LUSTRE       : Metallic bright \n\n"+"STREAK       : Grey black \n\n"+"CLEAVAGE   : Cleavage perfect cubic(100),three set parallel to face of cube \n\n"+
                "FRACTURE   : Sub-Conchoidal,brittle\n\n"+"HARDNESS  : 2-3 \n\n"+"SPECIFIC GRAVITY : High\n\n");
        ImageView I7=(ImageView)findViewById(R.id.img7);
        I7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(seventh.this,A7.class);
                startActivity(intent);
            }
        });
    }
}
