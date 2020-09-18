package com.epam.date.determinant.logic;

public class Calculator {

    public int getHours(int number) {
        return number / 3600;
    }

    public int getMinutes(int number, int number1) {
        return (number - (number1 * 3600)) / 60;
    }
    public int getSeconds(int number, int number1, int number2) {
        return (number - ((number1 * 3600) + number2 * 60) - 1);
    }

}
