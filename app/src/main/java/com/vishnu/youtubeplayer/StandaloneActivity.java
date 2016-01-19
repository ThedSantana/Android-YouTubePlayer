/*
 * The MIT License (MIT)
 * Copyright (c) 2016 Vishnu Sosale
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.vishnu.youtubeplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends Activity {


    public static final String GOOGLE_API_KEY = "AIzaSyCKmgMxrGqt81lpdgrObSZLb8DJZFAE_DU`";
    public static final String YOUTUBE_VIDEO_ID = "y6Sxv-sUYtM";
    public static final String YOUTUBE_VIDEO_PLAY_LIST_ID = "PL55713C70BA91BD6E";
    final String TAG = getClass().getSimpleName();
    Button playVideoButton, playPlaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        playPlaylist = (Button) findViewById(R.id.playPlaylist);
        playVideoButton = (Button) findViewById(R.id.playVideoButton);

        playPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = YouTubeStandalonePlayer.createVideoIntent(StandaloneActivity.this, GOOGLE_API_KEY,
                        YOUTUBE_VIDEO_PLAY_LIST_ID);
                startActivity(i);
            }
        });

        playVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = YouTubeStandalonePlayer.createPlaylistIntent(StandaloneActivity.this, GOOGLE_API_KEY,
                        YOUTUBE_VIDEO_ID);
                startActivity(i);
            }
        });

    }
}
