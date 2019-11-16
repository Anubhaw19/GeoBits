package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class thirteenth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteenth);
        TextView txt=(TextView)findViewById(R.id.tx13);
        txt.setText("OLIVIL\n\n"+"FORM          : Massive Granular in imbedded grains\n\n"+"COLOUR      : Olive-green\n\n"+"LUSTRE       : Viterous,transparent to translucent \n\n"+"STREAK       : Colourless to greenish white \n\n"+"CLEAVAGE   : Absent \n\n"+
                "FRACTURE   : Conchoidal\n\n"+"HARDNESS  : 7 \n\n"+"SPECIFIC GRAVITY : Medium \n\n");
        ImageView I13=(ImageView)findViewById(R.id.img13);
        I13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(thirteenth.this,A13.class);
                startActivity(intent);
            }
        });
    }
}
