package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView txt=(TextView)findViewById(R.id.tx2);
        txt.setText("ASBESTOS\n\n"+"FORM          : Fibrous platy\n\n"+"COLOUR      : White to light green,variegated shades of green\n\n"+"LUSTRE       : Viterous,transparent to translucent greasy,silky\n\n"+"STREAK       : White \n\n"+"CLEAVAGE   : Perfect one set \n\n"+
                "FRACTURE   : Conchoidal \n\n"+"HARDNESS  : 2 \n\n"+"SPECIFIC GRAVITY : Light \n\n");
        ImageView I2=(ImageView)findViewById(R.id.img2);
        I2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(second.this,A2.class);
                startActivity(intent);
            }
        });
    }
}
