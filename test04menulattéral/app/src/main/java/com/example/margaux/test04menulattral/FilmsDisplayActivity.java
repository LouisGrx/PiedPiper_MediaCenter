package com.example.margaux.test04menulattral;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by margaux on 23/12/2016.
 */

public class FilmsDisplayActivity extends Activity{
    public ListView listMedia;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medias_display);
        listMedia = (ListView)findViewById(R.id.list_media);

        Media myMedia = new Media(this);

        List<FilmRow> filmRowList= new ArrayList<FilmRow>();

        filmRowList.addAll(myMedia.getFilms());

        FilmAdapter filmAdapter = new FilmAdapter(this, filmRowList);
        listMedia.setAdapter(filmAdapter);
    }
}
