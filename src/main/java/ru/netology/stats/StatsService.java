package ru.netology.stats;

import java.util.Arrays;

public class StatsService {


    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale:sales) {
            totalSale += sale;

        }

        return totalSale;

    }


    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;

    }

    public int monthMaxSales(long[] sales) {
        int monthMax = 0;
        long saleMax = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
            monthMax = i;
            saleMax = sales[i];
            }
        }

        return monthMax + 1;
    }


    public int monthMinSales(long[] sales) {
        int monthMin = 0;
        long saleMin = 20;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMin) {
                monthMin = i;
                saleMin = sales[i];
            }
        }

        return monthMin + 1;
    }

    public int monthSalesLessAverage(long[] sales) {
        long averageSales = averageSales(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                result++;

            }
        }
        return result;
    }

    public int monthSalesMoreAverage(long[] sales) {
        long averageSales = averageSales(sales);
        int result = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                result++;

            }
        }
        return result;
    }




}
