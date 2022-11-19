package com.example.afinal;

import java.io.Serializable;

public class Tech1 implements Serializable {
    private String techname;
    private String techspecial;
    private int techimage;
    private String techlocation;

    public Tech1(String techname, String techspecial, int techimage, String techlocation) {
        this.techname = techname;
        this.techspecial = techspecial;
        this.techimage = techimage;
        this.techlocation = techlocation;
    }

    public String getTechname() {
        return techname;
    }

    public void setTechname(String techname) {
        this.techname = techname;
    }

    public String getTechspecial() {
        return techspecial;
    }

    public void setTechspecial(String techspecial) {
        this.techspecial = techspecial;
    }

    public int getTechimage() {
        return techimage;
    }

    public void setTechimage(int techimage) {
        this.techimage = techimage;
    }

    public String getTechlocation() {
        return techlocation;
    }

    public void setTechlocation(String techlocation) {
        this.techlocation = techlocation;
    }
}
