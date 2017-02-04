package gr.gandg.george.block04;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer jazzPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jazzPlayer = MediaPlayer.create(this, R.raw.summer_time);
        Switch switch_looping = (Switch)findViewById(R.id.switch_looping);
        switch_looping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                jazzPlayer.setLooping(isChecked);
            }
        });
    }

    public void playMusic(View v) {
        jazzPlayer.start();
    }

    public void pauseMusic(View v) {
        if (jazzPlayer.isPlaying())
            jazzPlayer.pause();
    }

}
