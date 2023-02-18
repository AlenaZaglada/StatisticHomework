package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void TestSumSales() {

        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.sumSales(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void TestAverageSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.averageSales(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void TestMonthMaxSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.monthMaxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void TestMonthMinSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int actual = service.monthMinSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);



    }

    @Test
    public void monthSalesLessAverage() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.monthSalesLessAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void monthSalesMoreAverage() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        long actual = service.monthSalesMoreAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }







    }



