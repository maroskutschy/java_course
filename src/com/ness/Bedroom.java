package com.ness;

public class Bedroom {

    private String name;
    private Wall2 wall1;
    private Wall2 wall2;
    private Wall2 wall3;
    private Wall2 wall4;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall2 wall1, Wall2 wall2, Wall2 wall3, Wall2 wall4, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom class - make bed - making bed");
        bed.make();
    }
}
