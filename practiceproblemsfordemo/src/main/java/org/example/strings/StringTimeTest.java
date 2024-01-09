//Basic demo for procesing string with String class, StringBuffer class and StringBuilder class
package org.example.strings;

public class StringTimeTest {
    public static void showStringTimeTest() {
        //String
        long startTimeString = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        String sampleString = "Thinkitive";
        for (long i = 0; i < 1000000; i++) {
            sampleString.concat("Technologies");
        }
        System.out.println("Time for 1000000 String concat =  " + (System.currentTimeMillis() - startTimeString) + "ms");
        System.out.println(System.currentTimeMillis());

        //StringBuffer
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer sampleStringBuffer = new StringBuffer("Thinkitive");
        for (long i = 0; i < 1000000; i++) {
            sampleStringBuffer.append("Technologies");
        }
        System.out.println("Time for 1000000 StringBuffer append = " + (System.currentTimeMillis() - startTimeStringBuffer) + "ms");
        System.out.println(System.currentTimeMillis());

        //StringBuilder
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder sampleStringBuilder = new StringBuilder("Thinkitive");
        for (long i = 0; i < 1000000; i++) {
            sampleStringBuilder.append("Technologies");
        }
        System.out.println("Time for 1000000 StringBuilder append = " + (System.currentTimeMillis() - startTimeStringBuilder) + "ms");
    }

    public static void main(String[] args) {
        showStringTimeTest();
    }
}