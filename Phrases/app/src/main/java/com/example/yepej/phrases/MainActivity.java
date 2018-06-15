package com.example.yepej.phrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Plays phrase depending on button pressed
    public void playPhrase(View control)
    {
        if (player == null || !player.isPlaying())
        {
            String buttonPressed = getResources().getResourceEntryName(control.getId());

            if (buttonPressed.equalsIgnoreCase("hello")) {
                player = MediaPlayer.create(this, R.raw.hello);
            } else if (buttonPressed.equalsIgnoreCase("welcome")) {
                player = MediaPlayer.create(this, R.raw.welcome);
            } else if (buttonPressed.equalsIgnoreCase("speak")) {
                player = MediaPlayer.create(this, R.raw.doyouspeakenglish);
            } else if (buttonPressed.equalsIgnoreCase("evening")) {
                player = MediaPlayer.create(this, R.raw.goodevening);
            } else if (buttonPressed.equalsIgnoreCase("hay")) {
                player = MediaPlayer.create(this, R.raw.howareyou);
            } else if (buttonPressed.equalsIgnoreCase("live")) {
                player = MediaPlayer.create(this, R.raw.ilivein);
            } else if (buttonPressed.equalsIgnoreCase("name")) {
                player = MediaPlayer.create(this, R.raw.mynameis);
            } else {
                player = MediaPlayer.create(this, R.raw.please);
            }

            player.start();
        }

    }
}
