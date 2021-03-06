package com.example.geology;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class fifth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        TextView txt=(TextView)findViewById(R.id.tx5);
        txt.setText("Calcite\n\n"+"FORM         : Usually in crystals,rhombohedral granular aggregates\n\n"+"COLOUR       : Usually white or colorless,may be gray,blue,green,yellow\n\n"+"LUSTRE        : Viterous to earthy transparent to opaque \n\n"+"STREAK       : Colourless or white \n\n"+"CLEAVAGE   : Three sets,three directions not at right angle rhombohedral\n\n"+
                "FRACTURE   : Even \n\n"+"HARDNESS  : 3 \n\n"+"SPECIFIC  GRAVITY : Light \n\n");
        ImageView I5=(ImageView)findViewById(R.id.img5);
        I5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(fifth.this,A5.class);
                startActivity(intent);
            }
        });
    }
}
