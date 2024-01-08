/*
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.
*/

package org.example.hackerrank.stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution1{
    public static boolean find(String sampleString) {
        Stack<Character> charStack = new Stack<>();
        for (char c : sampleString.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                charStack.push(c);
            } else if (c == ')' && !charStack.isEmpty() && charStack.peek() == '(') {
                charStack.pop();
            } else if (c == '}' && !charStack.isEmpty() && charStack.peek() == '{') {
                charStack.pop();
            } else if (c == ']' && !charStack.isEmpty() && charStack.peek() == '[') {
                charStack.pop();
            } else {
                return false;
            }
        }
        return charStack.isEmpty();
    }

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.isEmpty()) {
                System.out.println("true");
            } else {
                System.out.println(find(input));
            }
        }
    }
}