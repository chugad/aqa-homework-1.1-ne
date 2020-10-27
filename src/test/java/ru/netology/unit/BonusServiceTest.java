package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class BonusServiceTest {

    @Test
    public void showRemainIfAmountZero() {
        BonusService service = new BonusService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void showRemainIfAmountUnderLimit() {
        BonusService service = new BonusService();
        int amount = 300;
        int actual = service.remain(amount);
        int expected = 700;
        assertEquals(expected, actual);
    }

    @Test
    public void showRemainIfAmountAfterLimit() {
        BonusService service = new BonusService();
        int amount = 1300;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void showRemainIfAmountEqualBoundary() {
        BonusService service = new BonusService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}