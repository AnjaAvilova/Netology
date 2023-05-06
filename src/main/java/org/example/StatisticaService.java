package org.example;

public class StatisticaService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale; // сумма всех месяцев

        }
        return sum;
    }

    public long midSales(long[] sales) { // среднее за год
        long mid = 0;
        long sum = sumSales(sales);
        mid = sum / sales.length;
        return mid;
    }

    public long maxSalesMonth(long[] sales) {
        long max = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > max)
                max = sales[i];
        }
        return max;
    }

    public long maxSalesCount(long[] sales) { //поиск кол-ва месяцев с мах продажей
        long count = 0;
        long max = maxSalesMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == max) {
                count++;
            }
        }
        return count;
    }

    public long minSalesMonth(long[] sales) {
        long min = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < min)
                min = sales[i];
        }
        return min;
    }

    public long minSalesCount(long[] sales) { // кол-во месяцев с мin продажей
        long count = 0;
        long min = minSalesMonth(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == min) {
                count++;
            }
        }
        return count;
    }


    public long minMidCountSales(long[] sales) { //кол-во месяцев ниже среднего
        long minMid = 0;
        long mid = midSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < mid) {
                minMid++;
            }
        }
        return minMid;
    }


    public long maxMidCountSales(long[] sales) {// кол-во месяцев выше среднего
        long maxMid = 0;
        long mid = midSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > mid) {
                maxMid++;
            }
        }
        return maxMid;

    }


}


