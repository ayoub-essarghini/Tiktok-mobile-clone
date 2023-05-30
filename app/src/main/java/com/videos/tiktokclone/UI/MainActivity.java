package com.videos.tiktokclone.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.VideoView;

import com.videos.tiktokclone.Adapters.VideoAdapter;
import com.videos.tiktokclone.R;
import com.videos.tiktokclone.models.Video;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private List<Video> videoList;
    private VideoView videoView;

    private VideoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoList = new ArrayList<>();
        viewPager2 = findViewById(R.id.view_pager);

        videoList.add(new Video("android.resource://"+getPackageName()+"/"+R.raw.video1,"AYoub Es","description for test 1"));
        videoList.add(new Video("android.resource://"+getPackageName()+"/"+R.raw.video2,"test2","description for test 2"));
        videoList.add(new Video("android.resource://"+getPackageName()+"/"+R.raw.video3,"fati fleur","description for test 3"));

        adapter = new VideoAdapter(videoList);
        viewPager2.setAdapter(adapter);
    }
}