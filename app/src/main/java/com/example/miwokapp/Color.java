package com.example.miwokapp;

public class Color {

    private String miwokColor;

    private String defaultColor;

    public Color(String miwokColor, String defaultColor) {
        this.miwokColor = miwokColor;
        this.defaultColor = defaultColor;
    }

    public String getMiwokColor() { return miwokColor; }

    public String getDefaultColor() { return  defaultColor; }
}
