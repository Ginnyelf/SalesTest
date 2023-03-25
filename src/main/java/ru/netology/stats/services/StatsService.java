package ru.netology.stats.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int sum(long[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales += sales[i];
        }
        return sumSales;
    }

    public int average(long[] sales) {
        int averageSum = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSum += sales[i];
        }
        int averageSalesMonth;
        averageSalesMonth = averageSum / sales.length;
        return averageSalesMonth;
    }

    public int minAverage(long[] sales) {
        int min = average(sales);
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < min) {
                minMonth += 1;
            }
        }
        return minMonth;
    }

    public int maxAverage(long[] sales) {
        int max = average(sales);
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > max) {
                maxMonth += 1;
            }
        }
        return maxMonth;
    }
}

