package com.colors.ugur.colors;

public class Color {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getTextColor(){
        return "color:" + this.value;
    }
}
