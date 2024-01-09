package org.example.exception;
//Java Program for custom exception handling and understatnding of usage of try, catch, finally throw and throws

//In the code accepting integer input and provide respose if it is even else throwing excetion

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CheckNumber checkNumber = new CheckNumber();
        try {

            checkNumber.getInput(scanner);

        } catch (EvenOddException evenOddException) {
            evenOddException.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("Scanner Object is closed");
        }

    }
}
