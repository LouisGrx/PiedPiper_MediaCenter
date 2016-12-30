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

public class MusicsDisplayActivity extends Activity {
    public ListView listMedia;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medias_display);
        listMedia = (ListView)findViewById(R.id.list_media);

        Media myMedia = new Media(this);

        List<MusicRow> musicRowList= new ArrayList<MusicRow>();

        musicRowList.addAll(myMedia.getMusics());

        MusicAdapter musicAdapter = new MusicAdapter(this, musicRowList);
        listMedia.setAdapter(musicAdapter);

    }
}
