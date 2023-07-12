package com.example.responsi_training;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class BurjoModel implements Serializable {
    public String color;
    public String nama;
    public String hp;
    public String status;
    public Drawable kfc;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Drawable getKfc() {
        return kfc;
    }

    public void setKfc(Drawable kfc) {
        this.kfc = kfc;
    }

    public BurjoModel(String color, String nama, String hp, String status, int kfc) {
        this.color = color;
        this.nama = nama;
        this.hp = hp;
        this.status = status;
        this.kfc = kfc;
    }
}
