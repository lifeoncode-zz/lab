package me.lifeoncode;

public class Motherboard {
    private String model;
    private String  manufacturer;
    private int ramSlots;
    private int cardSlots;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public void loadProgram(String programName) {
        System.out.printf("Loading %s...\n", programName);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }
}
