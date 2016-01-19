package com.vishnu.youtubeplayer;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    public static final String GOOGLE_API_KEY = "AIzaSyA8zCox4Qe_PSzVZUzP1qycZrhzz4zL3DA";
    public static final String YOUTUBE_VIDEO_ID = "y6Sxv-sUYtM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlayerView);
        youTubePlayerView.initialize(GOOGLE_API_KEY, this);


    }



    @Override
    public void onInitializationSuccess
            (YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {

        youTubePlayer.setPlayerStateChangeListener(new YouTubePlayer.PlayerStateChangeListener() {
            @Override
            public void onLoading() {

            }

            @Override
            public void onLoaded(String s) {

            }

            @Override
            public void onAdStarted() {

            }

            @Override
            public void onVideoStarted() {

            }

            @Override
            public void onVideoEnded() {

            }

            @Override
            public void onError(YouTubePlayer.ErrorReason errorReason) {

            }
        });

        youTubePlayer.setPlaybackEventListener(new YouTubePlayer.PlaybackEventListener() {
            @Override
            public void onPlaying() {

            }

            @Override
            public void onPaused() {

            }

            @Override
            public void onStopped() {

            }

            @Override
            public void onBuffering(boolean b) {

            }

            @Override
            public void onSeekTo(int i) {

            }
        });

        if (!wasRestored)
        {
            youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID);
        }

    }

    @Override
    public void onInitializationFailure
            (YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

        Toast.makeText(this, "Cannot initialise", Toast.LENGTH_LONG).show();

    }
}
