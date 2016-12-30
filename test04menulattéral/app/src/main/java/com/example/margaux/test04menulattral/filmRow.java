package com.example.margaux.test04menulattral;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.widget.Button;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by margaux on 23/12/2016.
 */

class FilmRow {
    String name;
    Drawable poster;
    String year;
    String producer;
    List<String> types;
    List<String> actors;
    String synopsis;
    String trailer;

        /*Constructor*/
    public FilmRow(String name, Drawable poster, String year, String producer, List<String> types, List<String> actors, String synopsis, String trailer) {
        this.name = name;
        this.poster = poster;
        this.year = year;
        this.producer = producer;
        this.types = types;
        this.actors = actors;
        this.synopsis = synopsis;
        this.trailer = trailer;
    }



/*Getters & Setters*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getPoster() {
        return poster;
    }

    public void setPoster(Drawable poster) {
        this.poster = poster;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
