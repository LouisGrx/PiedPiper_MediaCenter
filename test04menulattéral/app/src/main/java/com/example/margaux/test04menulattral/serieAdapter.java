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

import java.util.List;

/**
 * Created by JNEB on 28/12/16.
 */

public class serieAdapter extends BaseAdapter {
    private Context myContext;
    private List<SerieRow> myListSerieRow;

    public serieAdapter(Context context, List<SerieRow> list) {
        myContext = context;
        myListSerieRow = list;
    }

    @Override
    public int getCount() {
        return myListSerieRow.size();
    }

    @Override
    public Object getItem(int position) {
        return myListSerieRow.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final SerieRow entry = myListSerieRow.get(position);
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(myContext);
            convertView = inflater.inflate(R.layout.serie_row, null);
        }

        TextView serie_name = (TextView) convertView.findViewById(R.id.serie_name);
        serie_name.setText(Media.fromMyHtml(entry.getName()));

        ImageView serie_poster = (ImageView) convertView.findViewById(R.id.serie_poster);
        serie_poster.setImageDrawable(entry.getPoster());

        TextView creator = (TextView) convertView.findViewById(R.id.serie_creator);
        creator.setText(Media.fromMyHtml("<b> Createur : </b>" + entry.getCreator()));

        TextView serie_year = (TextView) convertView.findViewById(R.id.serie_year);
        serie_year.setText(Media.fromMyHtml("<b>Année : </b>" + entry.getYear()));

        TextView serie_actors = (TextView) convertView.findViewById(R.id.serie_actors);
        serie_actors.setText(Media.fromMyHtml("<b>Acteurs : </b>" + Media.setToDotList(entry.getActors())));

        TextView serie_type = (TextView) convertView.findViewById(R.id.serie_genre);
        serie_type.setText(Media.fromMyHtml("<b>Genre : </b>" + Media.setToLinearList(entry.getGenres())));

        TextView serie_nbr_seasons = (TextView) convertView.findViewById(R.id.nbr_season);
        serie_nbr_seasons.setText(Media.fromMyHtml("<b>Nombre de saison : </b>"+ entry.getNbr_seasons()));

        final Button serie_synopsis = (Button) convertView.findViewById(R.id.synopsis_button);
        serie_synopsis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(myContext, serie_synopsis.class);
                String serie_name_ID = entry.getSynopsis();
                intent.putExtra("seriesynopsis", serie_name_ID);
                myContext.startActivity(intent);
            }
        });

        final Button serie_trailer = (Button) convertView.findViewById(R.id.season_button);
        serie_trailer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intentbis = new Intent(myContext, serie_trailer.class);
                String serie_name_ID = entry.getSerie_trailer();
                intentbis.putExtra("YOUTUBE_ID", serie_name_ID);
                myContext.startActivity(intentbis);
            }
        });
        return convertView;
    }
}