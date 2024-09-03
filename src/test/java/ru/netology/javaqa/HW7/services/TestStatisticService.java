package ru.netology.javaqa.HW7.services;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestStatisticService {
    @Test
    void findMaxIfMaxIsFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfMaxNotFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 15, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 15;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
