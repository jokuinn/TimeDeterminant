package com.epam.date.determinant;

import com.epam.date.determinant.data.ConsoleDataAcquirer;
import com.epam.date.determinant.data.DataAcquirer;
import com.epam.date.determinant.logic.Calculator;
import com.epam.date.determinant.view.*;

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
        VariantOfResultPrinterFactory firstVariantOfResultPrinterFactory = new FirstVariantOfResultPrinterFactory();
        ResultPrinter firstVariantResultPrinter = firstVariantOfResultPrinterFactory.createVariant();
        firstVariantResultPrinter.print(hours, minutes, seconds);

        VariantOfResultPrinterFactory secondVariantOfResultPrinterFactory = new SecondVariantOfResultPrinterFactory();
        ResultPrinter secondVariantResultPrinter = secondVariantOfResultPrinterFactory.createVariant();
        secondVariantResultPrinter.print(hours, minutes, seconds);



    }

}
