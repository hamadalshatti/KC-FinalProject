package com.example.afinal;

import java.io.Serializable;

public class Music1 implements Serializable {
private String musicname;
private String musicspecial;
private int musicimage;
private String musiclocation;

    public Music1(String musicname, String musicspecial, int musicimage, String musiclocation) {
        this.musicname = musicname;
        this.musicspecial = musicspecial;
        this.musicimage = musicimage;
        this.musiclocation = musiclocation;
    }

    public String getMusicname() {
        return musicname;
    }

    public void setMusicname(String musicname) {
        this.musicname = musicname;
    }

    public String getMusicspecial() {
        return musicspecial;
    }

    public void setMusicspecial(String musicspecial) {
        this.musicspecial = musicspecial;
    }

    public int getMusicimage() {
        return musicimage;
    }

    public void setMusicimage(int musicimage) {
        this.musicimage = musicimage;
    }

    public String getMusiclocation() {
        return musiclocation;
    }

    public void setMusiclocation(String musiclocation) {
        this.musiclocation = musiclocation;
    }
}
