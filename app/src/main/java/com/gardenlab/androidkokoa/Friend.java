package com.gardenlab.androidkokoa;

import android.media.Image;
import android.widget.ImageView;

public class Friend {
    private String name;
    private String profileImg;
    private String profileMsg;

    Friend() {
        this.name = "Kim Jeong won";
        this.profileImg = "defaultImg";
        this.profileMsg = "Too Hard";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getProfileMsg() {
        return profileMsg;
    }

    public void setProfileMsg(String profileMsg) {
        this.profileMsg = profileMsg;
    }
}
