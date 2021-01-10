package se.lexicon.AhmadAbdou;

import org.junit.Assert;
import org.junit.Test;

public class VendingMachineImplTest {
    VendingMachinelmpl vending = new VendingMachinelmpl();

    @Test
    public void testAddMoney_false() {
        int money = -50;
        Assert.assertFalse(vending.addMoney(-50));

    }

    @Test
    public void testReturnChange() {
        int money = 50;
        vending.setPrice(30);
        int expected = 20;
        int actual = money - vending.getPrice();


        Assert.assertEquals(expected, actual);


    }
}
