package com.example.raulrcg.videoview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView videoView = (VideoView) findViewById(R.id.video);

        String url = "rtsp://r4---sn-q4flrn7r.googlevideo.com/Cj0LENy73wIaNAlohW8rOGIZkBMYDSANFC3arQlaMOCoAUIASARgnNz__7Woi_9ZigELTG1qanpZU3pyaEEM/208E278B0A6BBB743246A943F539707EB8880C0A.834762C83446B256E54709136726F1361D10909E/yt6/1/video.3gp";
        videoView.setVideoURI(Uri.parse(url));

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();

    }
}
