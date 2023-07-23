package ru.netology.stats;

public class StatsService {

    public int AllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int MidSales(int[] sales) {
        int MidSum = AllSales(sales) / sales.length;
        return MidSum;
    }

    public int MaxSales(int[] sales) {
        int maxMonth = 0;
        int Month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
            maxMonth = Month;
            }
            Month = Month + 1;
        }
            return maxMonth + 1;
    }

    public int MinSales(int[] sales) {
        int minMonth = 0;
        int Month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = Month;
            }
            Month = Month + 1;
        }
        return minMonth + 1;
    }


}
