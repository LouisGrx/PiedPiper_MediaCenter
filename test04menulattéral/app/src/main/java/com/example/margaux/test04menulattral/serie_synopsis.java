package com.example.margaux.test04menulattral;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class serie_synopsis extends AppCompatActivity {

    private TextView ID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie_synopsis);

        ID = (TextView)findViewById(R.id.text_synopsis_serie);
        Intent intent2 = getIntent();
        Bundle b = intent2.getExtras();

        if(b!=null){
            String synopsis_serie = (String) b.get("seriesynopsis");
            ID.setText(synopsis_serie);
        }

    }
}
