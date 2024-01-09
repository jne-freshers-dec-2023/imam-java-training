package org.example.assignment;//Java program to join two ArrayList into one single ArrayList.

import java.util.ArrayList;
import java.util.List;

public class CombineArrayList {
    //Method for joining two Lists
    public List<String> getCombinedArrayList(List<String> listOne, List<String> listTwo) {
        List<String> resultList = new ArrayList<>();
        resultList.addAll(listOne);
        resultList.addAll(listTwo);
        return resultList;
    }
}