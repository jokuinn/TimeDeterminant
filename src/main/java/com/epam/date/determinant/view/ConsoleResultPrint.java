package com.epam.date.determinant.view;

public class ConsoleResultPrint implements ResultPrinter {

    public void printHours(int number) {

        System.out.println("Hours: " + number);
    }

    public void printMinutes(int number) {
        System.out.println("Minutes: " + number);
    }

    public void printSeconds(int number) {
        System.out.println("Seconds: " + number);
    }
}
