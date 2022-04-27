package me.lifeoncode;

class Panda {
    private static String name;

    public Panda(String name) {
        Panda.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}


public class App {

    public static void main( String[] args ) {
        Panda po = new Panda("Po");
        Panda shifu = new Panda("Shifu");
        po.printName();
        shifu.printName();
    }

}

