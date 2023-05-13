package ru.netology.stats;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumSales() {
        StatsService service = new StatsService();

        service.sumSales(months);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();

        service.averageMonthSales(months);

    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();

        service.maxMonthSales(months);
    }

    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();

        service.minMonthSales(months);
    }

    @Test
    public void mothsSalesLessAverage() {
        StatsService service = new StatsService();

        service.monthsSalesLessAverage(months);
    }

    @Test
    public void monthsSalesMoreAverage() {
        StatsService service = new StatsService();

        service.monthsSalesMoreAverage(months);
    }

}
