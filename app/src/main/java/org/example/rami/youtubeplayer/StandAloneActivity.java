package org.example.rami.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

/**
 * Created by Rami on 3/6/2017.
 */

public class StandAloneActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        Button playVideo = (Button) findViewById(R.id.btnPlayVideo);
        Button playPlayList = (Button) findViewById(R.id.btnPlayList);

        playVideo.setOnClickListener(this);
        playPlayList.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()){
            case R.id.btnPlayVideo:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEIO_ID, 0, true, true);
                break;

            case R.id.btnPlayList:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST, 0, 0, true, true);
                break;

            default:

        }

        if(intent != null){
            startActivity(intent);
        }
    }
}