/*
For this problem, we have  types of queries you can perform on a List:
Insert y at index x:
Insert
x y
Delete the element at index x:
Delete
x
Given a list L of N integers, perform Q queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.
*/
package org.example.hackerrank.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        for (int i = 0; i < N; i++) {
            L.add(Integer.parseInt(scanner.next()));
        }
        int Q = Integer.parseInt(scanner.next());
        for (int j = 0; j < Q; j++) {
            String s = scanner.next();
            if (s.equals("Insert")) {
                int index = Integer.parseInt(scanner.next());
                int value = Integer.parseInt(scanner.next());
                L.add(index, value);
            } else if (s.equals("Delete")) {
                int index = Integer.parseInt(scanner.next());
                L.remove(index);
            }
        }
        Iterator<Integer> itr = L.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}