package com.epam.date.determinant.data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {
    public int getSeconds() {
        System.out.println("Enter a seconds: ");
        try (Scanner in = new Scanner(System.in)) {
            return in.nextInt();
        }
        catch (InputMismatchException e){
            System.err.println("You need to enter a number!");
        }

        return 0;
    }
}
