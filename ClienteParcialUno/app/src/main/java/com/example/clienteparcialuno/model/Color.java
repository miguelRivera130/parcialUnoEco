package com.example.clienteparcialuno.model;

public class Color {

    private String type = "Color";
    private String Colors;
    private String ip;

    public Color(String colors, String ip) {
        this.Colors = colors;
        this.ip = ip;
    }

    public Color(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColors() {
        return Colors;
    }

    public void setColors(String colors) {
        Colors = colors;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
