package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldReturn0IfAmount2000() {
        assertEquals(0, service.remain(2000));
    }

    @Test
    public void shouldReturn100IfAmount1100() {
        assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldReturn1IfAmount899() {
        assertEquals(1, service.remain(899));
    }
}