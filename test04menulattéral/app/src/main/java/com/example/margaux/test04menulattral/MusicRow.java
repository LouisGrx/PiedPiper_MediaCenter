package com.example.margaux.test04menulattral;

import android.graphics.drawable.Drawable;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubePlayerView;

import java.util.List;

/**
 * Created by margaux on 24/12/2016.
 */

public class MusicRow {
    String name;
    Drawable poster;
    String year;
    String main_artist;
    List<String> artists;
    List<String> types;
    String clip;

    public MusicRow(String name, Drawable poster, String year, String main_artist, List<String> artists, List<String> types, String clip) {
        this.name = name;
        this.poster = poster;
        this.year = year;
        this.main_artist = main_artist;
        this.artists = artists;
        this.types = types;
        this.clip = clip;
    }

    public Drawable getPoster() {
        return poster;
    }

    public void setPoster(Drawable poster) {
        this.poster = poster;
    }

    public String getClip() {
        return clip;
    }

    public void setClip(String clip) {
        this.clip = clip;
    }

    /*getters & setters*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMain_artist() {
        return main_artist;
    }

    public void setMain_artist(String main_artist) {
        this.main_artist = main_artist;
    }

    public List<String> getArtists() {
        return artists;
    }

    public void setArtists(List<String> artists) {
        this.artists = artists;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }
}
