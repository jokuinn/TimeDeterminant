package com.epam.date.determinant.view;

public class SecondVariantConsoleResultPrint implements ResultPrinter {

    @Override
    public void print(int number1, int number2, int number3) {
        System.out.println(number1 + "h. " + number2 + "m. " + number3 + "s.");
    }
}
