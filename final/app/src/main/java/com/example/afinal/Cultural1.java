package com.example.afinal;

import java.io.Serializable;

public class Cultural1 implements Serializable {
    private String culturalname;
    private String culturalspecial;
    private int culturalimage;
    private String culturallocitaion ;

    public Cultural1(String culturalname, String culturalspecial, int culturalimage, String culturallocitaion) {
        this.culturalname = culturalname;
        this.culturalspecial = culturalspecial;
        this.culturalimage = culturalimage;
        this.culturallocitaion = culturallocitaion;
    }

    public String getCulturalname() {
        return culturalname;
    }

    public void setCulturalname(String culturalname) {
        this.culturalname = culturalname;
    }

    public String getCulturalspecial() {
        return culturalspecial;
    }

    public void setCulturalspecial(String culturalspecial) {
        this.culturalspecial = culturalspecial;
    }

    public int getCulturalimage() {
        return culturalimage;
    }

    public void setCulturalimage(int culturalimage) {
        this.culturalimage = culturalimage;
    }

    public String getCulturallocitaion() {
        return culturallocitaion;
    }

    public void setCulturallocitaion(String culturallocitaion) {
        this.culturallocitaion = culturallocitaion;
    }
}
