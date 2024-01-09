package org.example.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void firstTask() {
        System.out.println("Task One: Write a program to join two ArrayList into one single ArrayList");
        CombineArrayList combineArrayList = new CombineArrayList();
        List<String> nameList1 = new ArrayList<>();
        List<String> nameList2 = new ArrayList<>();
        nameList1.add("Thinkitive");
        nameList1.add("Thinkitive");
        nameList1.add("Thinkitive");
        nameList2.add("Technologies");
        nameList2.add("Technologies");
        nameList2.add("Technologies");
        List<String> joinedList = combineArrayList.getCombinedArrayList(nameList1, nameList2);
        System.out.println("Result for Joining " + nameList1 + " with " + nameList2 + " is :");
        System.out.println(joinedList);
    }

    public static void secondTask() {
        System.out.println("Task Two: WAP to find common elements provided in 2 array.");
        CommonArrayElements commonArrayElements = new CommonArrayElements();
        int[] arrayOne = {2, 1, 4, 5, 7, 8, 9, 2, 4, 6, 3, 10, 9, 2, 0};
        int[] arrayTwo = {6, 3, 0, 5, 3, 2, 5, 6, 3, 7, 8};
        System.out.println("First Array :");
        for (int num : arrayOne) {
            System.out.print(num);
        }
        System.out.println("\nSecond Array :");
        for (int num : arrayTwo) {
            System.out.print(num);
        }
        System.out.println();
        Set<Integer> commonElements = commonArrayElements.getCommonArrayElements(arrayOne, arrayTwo);
        System.out.println(commonElements);
    }

    public static void thirdTask() {
        System.out.println("Task Three: WAP to check balanced bracket.");
        String sampleStringOne = "[company{}:(Thinkitive Tecnologies)]";
        String sampleStringTwo = "[company{}:(Thinkitive Tecnologies])";
        BalancedBracket balancedBracket = new BalancedBracket();
        System.out.println("Verification of String '" + sampleStringOne + "' for Balanced Bracket is : " + balancedBracket.isBracketBalanced(sampleStringOne));
        System.out.println("Verification of String '" + sampleStringTwo + "' for Balanced Bracket is : " + balancedBracket.isBracketBalanced(sampleStringTwo));
    }

    public static void fourthTask() {
        System.out.println("Task Four: Choose and implement correct data structure to reverse a String");
        String sampleString= "Thinkitive";
        System.out.println("Original String = "+sampleString);
        ReverseString reverseString=new ReverseString();
        String reversedString=reverseString.getStringReversed(sampleString);
        System.out.println("Reversed String = "+reversedString);
    }

    public static void fifthTask() {
        System.out.println("Task Five: WAP to count vowel in given string using collections. ");
        String company = "Thinkitive Tecnologies";
        CountVowels countVowels = new CountVowels();
        int count = countVowels.getVowelsCount(company);
        System.out.println("Vowels count in " + company + " is = " + count);
    }

    public static void sixthTask() {
        System.out.println("Task Six: WAP for Matrix Multiplication");
        MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] secondMatrix = {{7, 8}, {9, 10}, {11, 12}};
        int[][] result = matrixMultiplication.multiplyMatrices(firstMatrix, secondMatrix);
        System.out.println("First Matrix :");
        matrixMultiplication.displayMatrix(firstMatrix);
        System.out.println("\nSecond Matrix");
        matrixMultiplication.displayMatrix(secondMatrix);
        System.out.println("\nResult of Matrix Multiplication:");
        matrixMultiplication.displayMatrix(result);
    }

    public static void main(String[] args) {
        System.out.println("=============================================================================================");
        firstTask();
        System.out.println("=============================================================================================");
        secondTask();
        System.out.println("=============================================================================================");
        thirdTask();
        System.out.println("=============================================================================================");
        fourthTask();
        System.out.println("=============================================================================================");
        fifthTask();
        System.out.println("=============================================================================================");
        sixthTask();
    }
}