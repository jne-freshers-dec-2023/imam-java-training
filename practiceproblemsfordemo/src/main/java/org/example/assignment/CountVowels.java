package org.example.assignment;//Java Program to count vowel in given string using collections.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountVowels {
    public List<Character> getCharListFromString(String sampleString) {
        char[] sampleArray = sampleString.toLowerCase().toCharArray();
        List<Character> sampleList = new ArrayList<>();
        for (char i : sampleArray) {
            sampleList.add(i);
        }
        return sampleList;
    }

    public int getVowelsCount(String string) {
        int count = 0;
        List<Character> charactersList = this.getCharListFromString(string);
        count += Collections.frequency(charactersList, 'a');
        count += Collections.frequency(charactersList, 'e');
        count += Collections.frequency(charactersList, 'i');
        count += Collections.frequency(charactersList, 'o');
        count += Collections.frequency(charactersList, 'u');
        return count;
    }
}