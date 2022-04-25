package me.lifeoncode;

import junit.framework.TestCase;
import org.junit.Test;

public class BankTest extends TestCase {
    @Test
    public void testAccountForUnknown() {
        Bank bank = new Bank();
        assertEquals("000111", bank.getAccount());
    }

    @Test
    public void testDesosit() {
        Bank jake = new Bank("jake", "jake@jaketran.io", "0725568897");
        assertEquals(0.0, jake.getBalance());
        jake.deposit(40);
        jake.deposit(60);
        assertEquals(100.0, jake.getBalance());
    }

    @Test
    public void testWithdraw() {
        Bank chloe = new Bank("chloe", "chloe@email.com", "0845569874");
        chloe.withdraw(10);
        assertEquals(0.0, chloe.getBalance());
        chloe.deposit(45);
        chloe.withdraw(25);
        assertEquals(20.0, chloe.getBalance());
    }
}