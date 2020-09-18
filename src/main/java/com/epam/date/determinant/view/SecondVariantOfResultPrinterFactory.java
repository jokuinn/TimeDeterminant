package com.epam.date.determinant.view;

public class SecondVariantOfResultPrinterFactory implements VariantOfResultPrinterFactory {
    @Override
    public ResultPrinter createVariant() {
        return new SecondVariantConsoleResultPrint();
    }

}
