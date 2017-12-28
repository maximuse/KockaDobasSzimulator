package hu.nyirszikszi.kockadobasszimulator;

import java.util.Random;

public class KockaDobasSzimulator {
    private int dobasokSzama;

    public KockaDobasSzimulator(int dobasok) {
        this.dobasokSzama = dobasok;
    }

    public int getDobasok() {
        return dobasokSzama;
    }

    public void setDobasok(int dobasok) {
        this.dobasokSzama = dobasok;
    }

    public String dobasok() {
        int min = 1;
        int max = 6;
        String eredmeny = "";
        Random rand = new Random();

        for(int i=0; i<dobasokSzama; i++) {
            eredmeny += rand.nextInt((max - min) + 1) + min + " ";
        }

        return eredmeny;
    }
}