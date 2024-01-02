// Java program to check balanced bracket

import java.util.Stack;

public class BalancedBracket {
    public boolean isBracketBalanced(String sampleString) {
        Stack<Character> sampleStack = new Stack<>();
        for (char c : sampleString.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                sampleStack.push(c);
            } else if (c == ')' && !sampleStack.isEmpty() && sampleStack.peek() == '(') {
                sampleStack.pop();
            } else if (c == ']' && !sampleStack.isEmpty() && sampleStack.peek() == '[') {
                sampleStack.pop();
            } else if (c == '}' && !sampleStack.isEmpty() && sampleStack.peek() == '{') {
                sampleStack.pop();
            }
        }
        return sampleStack.isEmpty(); // Stack should be empty for balanced brackets
    }
}