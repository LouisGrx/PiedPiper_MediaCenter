package com.example.margaux.test04menulattral;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SeriesDisplayActivity extends AppCompatActivity {
    public ListView listMedia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medias_display);

        listMedia = (ListView) findViewById(R.id.list_media);
        Media myMedia = new Media(this);

        List<SerieRow> serieRowList= new ArrayList<SerieRow>();

        serieRowList.addAll(myMedia.getSeries());

        serieAdapter serieAdapter = new serieAdapter(this, serieRowList);
        listMedia.setAdapter(serieAdapter);
    }
}
