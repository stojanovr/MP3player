package com.example.mp3player;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity
        extends AppCompatActivity {

    // Instantiating the MediaPlayer class
    MediaPlayer music;

    @Override
    protected void onCreate(
            Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adding the music file to our
        // newly created object music
        music = MediaPlayer.create(
                this, R.raw.sound);
    }

    // Playing the song
    public void play(View v) {
        music.start();
    }

    // Pausing the song
    public void pause(View v) {
        music.pause();
    }

    // Restarting the song
    public void restart(View v) {
        music.pause();
        music.seekTo(0);
        music.start();
    }

    // Stopping the song
    public void stop(View v) {
        music.stop();
        music
                = MediaPlayer.create(
                this, R.raw.sound);
    }
}