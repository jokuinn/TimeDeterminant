package com.epam.date.determinant.view;

public class FirstVariantConsoleResultPrint implements ResultPrinter {

    @Override
    public void print(int number1, int number2, int number3) {
        System.out.println("Hours: " + number1 + "\n" + "Minutes: " + number2 + "\n" + "Seconds: " + number3 + "\n");
    }

}
