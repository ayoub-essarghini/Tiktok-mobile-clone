package com.videos.tiktokclone.models;

public class Video {



    private String videoUrl,userName,desc;

    public Video(String videoUrl, String userName, String desc) {
        this.videoUrl = videoUrl;
        this.userName = userName;
        this.desc = desc;

    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
