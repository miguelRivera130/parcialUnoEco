package com.example.clienteparcialuno.model;

public class Movimiento {

    private String type = "Movimiento";
    private String movement;
    private String ip;

    public Movimiento(String movement, String ip) {
        this.movement = movement;
        this.ip = ip;
    }

    public Movimiento(){ }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getIp() { return ip; }

    public void setIp(String ip) { this.ip = ip; }
}
