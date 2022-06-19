package me.lifeoncode;

public class Printer {
    private int tonerLevel;
    private int numberOfPages;
    private boolean isDuplex;

    public Printer(boolean isDuplex) {
        this.tonerLevel = 100;
        this.numberOfPages = 0;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int amount) {
        if (tonerLevel + amount > 100) {
            System.out.println("toner full");
        } else {
            this.tonerLevel = this.tonerLevel + amount;
            System.out.println("toner level increased");
        }
    }

    public void printPage(int pages) {
        if (isDuplex) {
            System.out.println("Printing "+pages+" double sided pages...");
        } else {
            System.out.println("Printing "+pages+" pages...");
        }
        numberOfPages = numberOfPages + pages;
        tonerLevel = tonerLevel - 10;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void getStatus() {
        String printerType = "normal printer";
        if (isDuplex) { printerType = "duplex printer"; }
        System.out.printf("\nToner Level: %s\nPages Printed: %s\nType: %s\n\n",
                getTonerLevel(), getNumberOfPages(), printerType);
    }
}
