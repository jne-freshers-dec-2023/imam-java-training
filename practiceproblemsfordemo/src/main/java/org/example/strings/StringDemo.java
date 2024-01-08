package org.example.strings;

import java.util.HashMap;
import java.util.Map;

public class StringDemo {
    public void processEmpData() {
        // Extract Employee data from the String
        // "id:101,name:imam,address:nanded,age:30"
        String employeeDataString = " id : 101 , name : imam , address : nanded , age : 30 ";
        System.out.println("Extracting Employee Data from = " + employeeDataString);
        if (employeeDataString.contains(",")) {
            Map<String, String> employeeData = new HashMap<>();
            String[] pairs = employeeDataString.split(",");
            for (String pair : pairs) {
                if (pair.contains(":")) {

                    String[] keyAndValue = pair.split(":");
                    employeeData.put(keyAndValue[0].trim(), keyAndValue[1].trim());
                } else {
                    System.out.println("Not a Pair " + pair);
                }
            }
            System.out.println(employeeData);
        } else {
            System.out.println("Raw Data " + employeeDataString);
        }
    }

    public static void main(String[] args) {
        StringDemo stringDemo = new StringDemo();
        stringDemo.processEmpData();

        String s1 = "Imam";
        String s2 = new String("Imam");
        System.out.println("Compairing with equals() " + s1.equals(s2));
        System.out.println("Comapairing with == " + (s1 == s2));
        System.out.println("Simply printing s1 = " + s1 + " Simply Printing s2 = " + s2);
        System.out.println("printing s1 hashcode= " + s1.hashCode() + " Printing s2 hashcode = " + new String("Imam").hashCode());
    }
}
