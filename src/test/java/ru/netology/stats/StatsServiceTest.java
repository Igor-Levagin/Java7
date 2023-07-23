package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {


    @Test
    public void shouldFindAllSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAllSales = 180;
        int ActualAllSales = service.AllSales(sales);

        Assertions.assertEquals(expectedAllSales, ActualAllSales);
    }

    @Test
    public void shouldFindMidSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMidSales = 15;
        int ActualMidSales = service.MidSales(sales);

        Assertions.assertEquals(expectedMidSales, ActualMidSales);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int ActualMaxMonth = service.MaxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, ActualMaxMonth);
    }

    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int ActualMinMonth = service.MinSales(sales);

        Assertions.assertEquals(expectedMinMonth, ActualMinMonth);
    }

}


