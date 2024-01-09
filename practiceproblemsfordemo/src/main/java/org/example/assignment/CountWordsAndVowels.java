package org.example.assignment;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CountWordsAndVowels {

    public static void countVowels(List<Character> charList){
        int count=0;
        for(char c:charList){
            if (c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u'){
                count++;
            }
        }
        System.out.println("Number of vowels = "+count);

    }
    public static void processString(String sampleString){
        List<Character> charList=new ArrayList<>();
        for(char ch:sampleString.toLowerCase().toCharArray()){
            charList.add(ch);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(sampleString);
        countVowels(charList);
        System.out.println("Number of words = "+stringTokenizer.countTokens());
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your String");
        String sampleString=scanner.nextLine();
        processString(sampleString);
    }
}
