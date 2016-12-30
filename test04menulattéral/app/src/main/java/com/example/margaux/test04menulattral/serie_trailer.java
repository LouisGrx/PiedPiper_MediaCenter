package com.example.margaux.test04menulattral;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class serie_trailer  extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    public String youtube_id;
    private TextView trailer_serie_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie_trailer);

        final String API_KEY = getResources().getString(R.string.API_KEY);
        Intent intent2 = getIntent();
        Bundle b = intent2.getExtras();
        youtube_id = b.getString("YOUTUBE_ID");
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.serie_youtube_player);
        youTubePlayerView.initialize(API_KEY, this);

        trailer_serie_name = (TextView)findViewById(R.id.trailer_serie_name);
        trailer_serie_name.setText("Trailer");

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean b) {

        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);
/** Start buffering **/
        if (!b) {
            player.cueVideo(youtube_id);
        }
    }

    @Override public void onInitializationFailure(Provider provider, YouTubeInitializationResult result) {
            Toast.makeText(this, "Failured to Initialize!", Toast.LENGTH_LONG).show();}

    private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {
        @Override
        public void onBuffering(boolean arg0) {
        }
        @Override
        public void onPaused() {
        }
        @Override
        public void onPlaying() {
        }
        @Override
        public void onSeekTo(int arg0) {
        }
        @Override
        public void onStopped() {
        }
    };

    private PlayerStateChangeListener playerStateChangeListener = new PlayerStateChangeListener() {
        @Override
        public void onAdStarted() {
        }
        @Override
        public void onError(ErrorReason arg0) {
        }
        @Override
        public void onLoaded(String arg0) {
        }
        @Override
        public void onLoading() {
        }
        @Override
        public void onVideoEnded() {
        }
        @Override
        public void onVideoStarted() {
        }
    };
}
