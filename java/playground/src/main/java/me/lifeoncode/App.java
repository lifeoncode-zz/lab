package me.lifeoncode;

public class App {

    public static void main( String[] args ) {
        Bank jake = new Bank("Jake Tran", "jake@jaketran.io", "0728234256");
        Bank mike = new Bank("Mike Reeves", "micheal@redhat.com", "0834456789");
        System.out.println("Jake: "+jake.getAccount());
        System.out.println("Mike: "+mike.getAccount());
        System.out.println("\n");
        Vip one = new Vip();
        Vip two = new Vip("james", "james@email.com");
        Vip three = new Vip("jasmine", "jasmine@site.io", 450_000.0);

        System.out.println(three.getCredLimit());
    }

}

