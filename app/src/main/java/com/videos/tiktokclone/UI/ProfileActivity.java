package com.videos.tiktokclone.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.videos.tiktokclone.R;

public class ProfileActivity extends AppCompatActivity {

    TextView profile_name, following_text, followers_text, bio;
    RecyclerView recyclerView;
    ImageView profile_img, back_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        recyclerView = findViewById(R.id.recycler_view);

        profile_name = findViewById(R.id.user_name_profile);
        followers_text = findViewById(R.id.text_followers);
        following_text = findViewById(R.id.text_following);
        bio = findViewById(R.id.bio);
        profile_img = findViewById(R.id.img_profile);
        back_arrow = findViewById(R.id.back_arrow);
    }
}