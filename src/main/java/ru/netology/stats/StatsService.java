package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sumAllSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumAllSales += sales[i];
        }
        System.out.println("Ссумма всех продаж " + sumAllSales);
        return sumAllSales;
    }

    public int averageMonthSales(int[] sales) {
        int countAverageMonthSales = 0;

        for (int i = 0; i < sales.length; i++) {
            countAverageMonthSales += sales[i];
        }
        countAverageMonthSales = countAverageMonthSales / sales.length;
        System.out.println("Средняя сумма продаж в месяц " + countAverageMonthSales);
        return countAverageMonthSales;
    }

    public int maxMonthSales(int[] sales) {
        int countMaxMonthSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[countMaxMonthSales]) {
                countMaxMonthSales = i;
            }
        }
        System.out.println("Месяц в котором был пик продаж " + (countMaxMonthSales + 1));
        return countMaxMonthSales + 1;
    }

    public int minMonthSales(int[] sales) {
        int countMinMonthSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[countMinMonthSales]) {
                countMinMonthSales = i;
            }
        }
        System.out.println("Месяц в котором был минимум продаж " + (countMinMonthSales + 1));
        return countMinMonthSales + 1;
    }

    public int monthsSalesLessAverage(int[] sales) {
        int countMonthsSales = 0;
        int averageMonthSales = averageMonthSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageMonthSales) {
                countMonthsSales++;
            }
        }
        System.out.println("Месяцы с продажами ниже среднего " + countMonthsSales);
        return countMonthsSales;
    }

    public int monthsSalesMoreAverage(int[] sales) {
        int countMonthsSales = 0;
        int averageMonthsSales = averageMonthSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= averageMonthsSales) {
                countMonthsSales++;
            }
        }
        System.out.println("Месяцы с продажами выше среднего " + countMonthsSales);
        return countMonthsSales;
    }
}
