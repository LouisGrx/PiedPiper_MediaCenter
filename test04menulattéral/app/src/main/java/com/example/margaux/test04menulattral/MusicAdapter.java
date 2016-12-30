package com.example.margaux.test04menulattral;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.List;

/**
 * Created by margaux on 23/12/2016.
 */

public class MusicAdapter extends BaseAdapter {

    private Context myContext;
    private List<MusicRow> myListMusicRow;

    public MusicAdapter(Context context, List<MusicRow> list){
        myContext=context;
        myListMusicRow=list;
    }
    @Override
    public int getCount() {
        return myListMusicRow.size();
    }

    @Override
    public Object getItem(int position) {
        return myListMusicRow.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)  {
        final MusicRow entry = myListMusicRow.get(position);
        if(convertView==null){
            LayoutInflater inflater = LayoutInflater.from(myContext);
            convertView = inflater.inflate(R.layout.music_row,null);
        }

        TextView music_name = (TextView)convertView.findViewById(R.id.music_name);
        music_name.setText(Media.fromMyHtml(entry.getName()));

        ImageView music_poster = (ImageView)convertView.findViewById(R.id.music_poster);
        music_poster.setImageDrawable(entry.getPoster());

        TextView music_year = (TextView)convertView.findViewById(R.id.music_year);
        music_year.setText(Media.fromMyHtml("<b>Année : </b>"+entry.getYear()));

        TextView music_mainArtist = (TextView)convertView.findViewById(R.id.music_mainArtist);
        music_mainArtist.setText(Media.fromMyHtml("<b>Artiste Principal : </b>"+entry.getMain_artist()));

        TextView music_artists = (TextView)convertView.findViewById(R.id.music_artists);
        music_artists.setText(Media.fromMyHtml("<b>Artistes secondaires : </b>"+Media.setToDotList(entry.getArtists())));

        TextView music_type = (TextView)convertView.findViewById(R.id.music_type);
        music_type.setText(Media.fromMyHtml("<b>Genre : </b>"+Media.setToLinearList(entry.getTypes())));

        Button music_clip = (Button)convertView.findViewById(R.id.music_clip);
        music_clip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(myContext, VideoViewer.class);
                String videoID = entry.getClip();
                intent.putExtra("myVideoID",videoID);
                myContext.startActivity(intent);
            }
        });



        return convertView;
    }

}
