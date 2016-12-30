package com.example.margaux.test04menulattral;

import android.graphics.drawable.Drawable;

import java.util.List;

/**
 * Created by JNEB on 27/12/16.
 */

class SerieRow {
    String name;
    Drawable poster;
    String creator;
    String year;
    List<String> actors;
    List<String> genres;
    String nbr_seasons;
    String synopsis;
    String serie_trailer;

    public SerieRow(String name, Drawable poster, String creator, String year, List<String> actors, List<String> genres, String nbr_season, String synopsis, String serie_trailer) {
        this.name = name;
        this.poster = poster;
        this.creator = creator;
        this.year = year;
        this.actors = actors;
        this.genres = genres;
        this.nbr_seasons = nbr_season;
        this.synopsis = synopsis;
        this.serie_trailer = serie_trailer;
    }

    public Drawable getPoster() {
        return poster;
    }

    public void setPoster(Drawable poster) {
        this.poster = poster;
    }

    /*getters & setters*/
    public String getName() {
        return name;
    }

    public void setNbr_seasons(String nbr_seasons){ this.nbr_seasons = nbr_seasons; }

    public void setSynopsis(String synopsis) {this.synopsis = synopsis;}

    public void setSerie_trailer(String serie_trailer) {this.serie_trailer=serie_trailer;}

    public String getSerie_trailer() {return serie_trailer;}

    public String getSynopsis() {return synopsis; }

    public String getNbr_seasons(){return nbr_seasons ;}

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setCreator(String creator) {this.creator = creator;}

    public String getCreator() {return this.creator;}

    public void setYear(String year) {
        this.year = year;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public List<String> getGenres() {
        return genres;
    }
}




