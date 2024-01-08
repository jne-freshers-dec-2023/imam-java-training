/*You are given a phone book that consists of people's names and their phone number.
After that you will be given some person's name as query. For each query, print the phone number of that person.*/

package org.example.hackerrank.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution1 {

    public static void runsolution() {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> contacts = new HashMap<>();
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n >= 1 && n <= 100000) {
            for (int i = 0; i < n; i++) {
                String name = scanner.nextLine();
                int phone = scanner.nextInt();
                scanner.nextLine();
                contacts.put(name, phone);
            }
            int count = 1;
            while (scanner.hasNext() && count <= 100000) {
                String s = scanner.nextLine();
                if (contacts.containsKey(s)) {
                    System.out.println(s + "=" + contacts.get(s));
                } else {
                    System.out.println("Not found");
                }
                count++;
            }
        }
        scanner.close();
    }

    public static void main(String[] argh) {
        runsolution();
    }
}





