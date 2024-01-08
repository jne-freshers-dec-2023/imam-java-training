package org.example.assignment;// Java Program to reverse a String using Collection.
import java.util.Stack;

public class ReverseString {
    public String getStringReversed(String sampleString) {
        Stack<Character> characterStack = new Stack<>();
        for (char ch : sampleString.toCharArray()) {
            characterStack.push(ch);
        }
        StringBuilder reversedString = new StringBuilder();
        while (!characterStack.empty()) {
            reversedString.append(characterStack.pop());
        }
        return reversedString.toString();
    }
}
