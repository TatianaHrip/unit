package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn0IfAmount2000() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2000;

        int actual = CashbackHackService.calculateCashback (amount);
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn100IfAmount1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;

        int actual = CashbackHackService.calculateCashback (amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1IfAmount899() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 899;

        int actual = CashbackHackService.calculateCashback  (amount);
        int expected = 1;
        assertEquals(actual, expected);

    }

}
