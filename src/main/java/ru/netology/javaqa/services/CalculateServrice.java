package ru.netology.javaqa.services;

public class CalculateServrice {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; //денег не счету
        int mounthCounter = 0; //счётчик месяцев
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                mounthCounter++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return mounthCounter;
    }
}
