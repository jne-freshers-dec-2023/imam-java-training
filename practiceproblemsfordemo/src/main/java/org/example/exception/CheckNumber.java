package org.example.exception;

import java.util.Scanner;

class CheckNumber {

    public void checkEvenNumber(int inputNumber) {

        if (inputNumber % 2 == 0) {
            System.out.println(inputNumber + " is Even Number Number");
        } else {
            throw new EvenOddException(inputNumber + " is Not a Even Number");
        }

    }

    public void getInput(Scanner scanner) throws EvenOddException {
        System.out.println("Enter a Number = ");
        int inputNumber = scanner.nextInt();
        checkEvenNumber(inputNumber);
    }
}