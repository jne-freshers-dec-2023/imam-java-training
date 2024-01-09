/*
You are given n lines. In each line there are zero or more integers.
You need to answer a few queries where you need to tell the number located in Yth position of Xth line.
*/
package org.example.hackerrank.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        List<List<Integer>> nLines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> dList = new ArrayList<>();
            d = scanner.nextInt();
            if (d == 0) {
                nLines.add(dList);
            } else {
                for (int j = 0; j < d; j++) {
                    dList.add(scanner.nextInt());
                }
                nLines.add(dList);
            }
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x <= nLines.size()) {
                List<Integer> list = nLines.get(x - 1);
                if (y <= list.size()) {
                    System.out.println(list.get(y - 1));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}