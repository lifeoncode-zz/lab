package me.lifeoncode;

public class App {

    public static void main( String[] args ) {
        Bank jake = new Bank("Jake Tran", "jake@jaketran.io", "0728234256");
        Bank mike = new Bank("Mike Reeves", "micheal@redhat.com", "0834456789");
        jake.deposit(420);
        System.out.println(jake.getBalance());
        jake.withdraw(421);
        System.out.println(jake.getBalance());
    }

}

