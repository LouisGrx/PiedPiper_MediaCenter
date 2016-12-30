package com.example.margaux.test04menulattral;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by margaux on 24/12/2016.
 */

public class Media {

    private static final String TAG = Media.class.getSimpleName();

    List<FilmRow> films = new ArrayList<FilmRow>() ;
    List<MusicRow> musics = new ArrayList<MusicRow>() ;
    List<SerieRow> series = new ArrayList<SerieRow>();

    Media(Context context){
        Log.d(TAG, "Media() début ");

        series.add(
                new SerieRow(
                        "Sherlock",
                        getPoster(context, R.drawable.sherlock),
                        "Mark Gatiss, Steven Moffat",
                        "2010",
                        new ArrayList<String>(Arrays.asList(
                                "Benedict Cumberbatch",
                                "Martin Freeman",
                                "Una Stubbs",
                                "Louise Brealy",
                                "Andrew Scott"
                        )),
                        new ArrayList<String>(Arrays.asList(
                                "Mystery",
                                "Drama",
                                "Crime"
                        )),
                        "4",
                        "In this modernized version of the Conan Doyle characters, using his detective plots, Sherlock Holmes lives in early 21st century London and acts more cocky towards Scotland Yard's detective inspector Lestrade because he's actually less confident. Doctor Watson is now a fairly young veteran of the Afghan war, less adoring and more active.",
                        "JP5Dr63TbSU"
                )
        );

        series.add(
                new SerieRow(
                        "Westworld",
                        getPoster(context, R.drawable.westworld),
                        "Lisa Joy, Jonhatan Nolan",
                        "2016",
                        new ArrayList<String>(Arrays.asList(
                                "Evan Rachel Wood",
                                "Jeffrey Wright",
                                "Ed Harris",
                                "Thandie Newton"
                        )),
                        new ArrayList<String>(Arrays.asList(
                                "Drama",
                                "Mystery",
                                "Sci-Fi"
                        )),
                        "1",
                        "A Western-themed futuristic theme park, populated with artificial intelligence, allows high-paying guests to live out their fantasies with no consequences or retaliation from the android hosts, until now.",
                        "IuS5huqOND4"
                )
        );
        films.add(
            new FilmRow(
                    "The Imitation Game",
                    getPoster(context, R.drawable.imitation_game),
                    "2014",
                    "Morten Tyldum",
                    new ArrayList<String>(Arrays.asList(
                        "Benedict Cumberbatch"
                        ,"Keira Knightley"
                        ,"Matthew Goode"
                        ,"Mark Strong"
                        ,"Rory Kinnear"
                        ,"Charles Dance"
                        ,"Allen Leech"
                        ,"Matthew Beard")),
                    new ArrayList<String>(Arrays.asList(
                            "Drame"
                            ,"Biopic")),
                    "1940 : Alan Turing, mathématicien, cryptologue, est chargé par le gouvernement Britannique de percer le secret de la célèbre machine de cryptage allemande Enigma, réputée inviolable."
                    , "S5CjKEFb-sM"
            )
        );
        films.add(
            new FilmRow(
                    "V pour Vendetta",
                    getPoster(context,R.drawable.v_pour_vendetta),
                    "2006",
                    "James McTeigue",
                    new ArrayList<String>(Arrays.asList(
                        "Natalie Portman"
                        ,"Hugo Weaving"
                        ,"Stephen Rea"
                        ,"Stephen Fry"
                        ,"Sinéad Cusack"
                        ,"Rupert Graves"
                        ,"Roger Allam"
                        ,"John Hurt")),
                    new ArrayList<String>(Arrays.asList(
                        "Science fiction"
                        ,"Fantastique "
                        ,"Thriller "
                        ,"Action")),
                    "Londres, au 21ème siècle...\n" +
                        "Evey Hammond ne veut rien oublier de l'homme qui lui sauva la vie et lui permit de dominer ses peurs les plus lointaines. Mais il fut un temps où elle n'aspirait qu'à l'anonymat pour échapper à une police secrète omnipotente. Comme tous ses concitoyens, trop vite soumis, elle acceptait que son pays ait perdu son âme et se soit donné en masse au tyran Sutler et à ses partisans.\n" +
                        "Une nuit, alors que deux \"gardiens de l'ordre\" s'apprêtaient à la violer dans une rue déserte, Evey vit surgir son libérateur. Et rien ne fut plus comme avant.\n" +
                        "Son apprentissage commença quelques semaines plus tard sous la tutelle de \"V\".\n" +
                        "Evey ne connaîtrait jamais son nom et son passé, ne verrait jamais son visage atrocement brûlé et défiguré, mais elle deviendrait à la fois son unique disciple, sa seule amie et le seul amour d'une vie sans amour..."
                    ,"qxyUl9M_7vc"
            )
        );
        Log.d(TAG, "Media() films ajoutés ");

        /*MUSIQUES*/
        musics.add(
                new MusicRow(
                        "Grandpa's Groove"
                        ,getPoster(context,R.drawable.grandpa_s_groove)
                        ,"2016"
                        ,"Parov Stelar"
                        ,new ArrayList<String>(Arrays.asList(
                            "AronChupa"))
                        ,new ArrayList<String>(Arrays.asList(
                            "Dance"))
                        ,"znrEGeYsq9s"
                ));
        musics.add(
                new MusicRow(
                        "La Gozadera"
                        ,getPoster(context,R.drawable.la_gozadera)
                        ,"2016"
                        ,"Gente de Zona"
                        ,new ArrayList<String>(Arrays.asList(
                        "Marc Anthony"))
                        ,new ArrayList<String>(Arrays.asList(
                        "Reggaeton"
                        ,"Salsa"))
                        ,"VMp55KH_3wo"
                ));

    }

    private Drawable getPoster(Context context, int id){
        return ContextCompat.getDrawable(context,id);
    }


    public List<FilmRow> getFilms(){
        Log.d(TAG, "getFilms() début ");

        return films;
    }

    public List<MusicRow> getMusics(){
        Log.d(TAG, "getMusics() début ");

        return musics;
    }

    public List<SerieRow> getSeries(){
        Log.d(TAG, "getSeries() start");

        return series;
    }

    public static Spanned fromMyHtml(String html){
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(html,Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        Log.d(TAG, "transfo de :"+html+" en :"+result);
        return result;
    }

    public static String setToDotList(List<String> list){
        String myString="";
        for (String s:list) {
            myString+="<br/>&#x9• "+s;
        }
        return myString;
    }
    public static String setToLinearList(List<String> list){
        String myString="<br/>   ";
        for (String s:list) {
            myString+=s+", ";
        }
        return myString.substring(0, myString.length()-2);//enlève la dernière virgule
    }
}
