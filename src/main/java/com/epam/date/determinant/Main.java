package com.epam.date.determinant;

import com.epam.date.determinant.data.ConsoleDataAcquirer;
import com.epam.date.determinant.data.DataAcquirer;
import com.epam.date.determinant.logic.Calculator;
import com.epam.date.determinant.view.ConsoleResultPrint;
import com.epam.date.determinant.view.ResultPrinter;

public class Main {
    public static void main(String[] args) {
        //получить число
        DataAcquirer acquirer = new ConsoleDataAcquirer();
        int number = acquirer.getSeconds();

        // посчитать
        Calculator calculator = new Calculator();
        int hours = calculator.getHours(number);
        int minutes = calculator.getMinutes(number, hours);
        int seconds = calculator.getSeconds(number, hours, minutes);

        // вывести
        ResultPrinter printer = new ConsoleResultPrint();
        printer.printHours(hours);
        printer.printMinutes(minutes);
        printer.printSeconds(seconds);
    }
}
