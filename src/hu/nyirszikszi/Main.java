package hu.nyirszikszi;

import hu.nyirszikszi.kockadobasszimulator.KockaDobasSzimulator;

public class Main {
    public static void main(String[] args) {
        KockaDobasSzimulator d = new KockaDobasSzimulator(50);
        System.out.println(d.dobasok());
    }
}