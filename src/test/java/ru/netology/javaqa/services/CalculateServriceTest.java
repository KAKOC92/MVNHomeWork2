package ru.netology.javaqa.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateServriceTest {

    @Test
    public void calculateService1() {
        CalculateServrice calculate = new CalculateServrice();

        int actucal = calculate.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(actucal, expected);

    }

    @Test
    public void calculateService2() {
        CalculateServrice calculate = new CalculateServrice();

        int actucal = calculate.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(actucal, expected);

    }

}