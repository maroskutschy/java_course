package com.ness;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSLots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSLots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSLots = ramSLots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public  void loadProgramme(String programName) {
        System.out.println("Programme " + programName + " is loading");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRamSLots() {
        return ramSLots;
    }

    public void setRamSLots(int ramSLots) {
        this.ramSLots = ramSLots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
