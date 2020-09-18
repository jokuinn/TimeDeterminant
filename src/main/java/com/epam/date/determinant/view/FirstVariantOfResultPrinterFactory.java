package com.epam.date.determinant.view;

public class FirstVariantOfResultPrinterFactory implements VariantOfResultPrinterFactory {
    @Override
    public ResultPrinter createVariant() {
        return new FirstVariantConsoleResultPrint();
    }
}
