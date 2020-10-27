package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BonusServiceTest {

    @Test
    public void showRemainIfAmountZero() {
        BonusService service = new BonusService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void showRemainIfAmountUnderLimit() {
        BonusService service = new BonusService();
        int amount = 300;
        int actual = service.remain(amount);
        int expected = 700;
        assertEquals(actual, expected);
    }

    @Test
    public void showRemainIfAmountAfterLimit() {
        BonusService service = new BonusService();
        int amount = 1300;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void showRemainIfAmountEqualBoundary() {
        BonusService service = new BonusService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}