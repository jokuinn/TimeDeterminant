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
        VariantOfResultPrinterFactory variantOfResultPrinterFactory = chooseVariantOfResultPrinter(2);
        ResultPrinter variantResultPrinter = variantOfResultPrinterFactory.createVariant();
        variantResultPrinter.print(hours, minutes, seconds);



    }

    static VariantOfResultPrinterFactory chooseVariantOfResultPrinter(int choose){
        if (choose == 1) {
            return new FirstVariantOfResultPrinterFactory();
        }
        else if (choose == 2) {
            return new SecondVariantOfResultPrinterFactory();
        }
        else {
            throw new RuntimeException(choose + " - It's uncorrect choose");
        }
    }
}
