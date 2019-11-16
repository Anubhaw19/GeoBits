package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class fourth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);  TextView txt=(TextView)findViewById(R.id.tx4);
        txt.setText("BIOTILE\n\n"+"FORM         : Usually irregular foliated,scaly,tabular crystal rare\n\n"+"COLOUR       : Black,brown to dark green,may be yellow\n\n"+"LUSTRE       : Pearly to viterous,transparent to translucent splendent \n\n"+"STREAK       : Uncoloured \n\n"+"CLEAVAGE  : Perfect(001) one set basal\n\n"+
                "FRACTURE   : Even,can be split into thin sheet \n\n"+"HARDNESS : 3 \n\n"+"SPECIFIC GRAVITY : Light \n\n");
        ImageView I4=(ImageView)findViewById(R.id.img4);
        I4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fourth.this,A4.class);
                startActivity(intent);
            }
        });
    }
}
