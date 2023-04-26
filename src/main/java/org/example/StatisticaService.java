package org.example;

public class StatisticaService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;

        }
        return sum;
    }

    public long midSales(long[] sales) {
        long mid = 0;
        for (long sale : sales) {
            mid = (mid + sale) / 12;
        }
        return mid;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
//      int maxSales = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth])
                maxMonth = i;
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth])
                minMonth = i;
        }
        return minMonth + 1;
    }

    public int calcMonthMinMid(long[] sales) {
        int calcMinMid = 0;
        long midd = 0;
        for (long sale : sales) {
            midd = (midd + sale) / 12;
            if (sale < midd) {
                calcMinMid++;
            }
        }
        return calcMinMid;

    }

    public int calcMonthMaxMid(long[] sales) {
        int calcMaxMid = 0;
        long midd = 0;
        for (long sale : sales) {
            midd = (midd + sale) / 12;
            if (sale > midd) {
                calcMaxMid++;
            }
        }
        return calcMaxMid;

    }


}


