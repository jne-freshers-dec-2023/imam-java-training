/*
Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.
Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays.
The method should be able to accept both integer arrays or string arrays.
*/
package org.example.hackerrank.generics;

class Printer {
    public <T> void printArray(T[] sampleArray) {
        for (T element : sampleArray) {
            System.out.println(element);
        }
    }
}

public class Solution1 {
    public static void main(String args[]) {
        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
    }
}