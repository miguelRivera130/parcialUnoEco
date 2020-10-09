package com.example.clienteparcialuno.model;

public class Nombre {

    private String type = "Nombre";
    private String name;
    private String ip;

    public Nombre(String name, String ip) {
        this.name = name;
        this.ip = ip;
    }

    public Nombre() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() { return ip; }

    public void setIp(String ip) { this.ip = ip; }
}
