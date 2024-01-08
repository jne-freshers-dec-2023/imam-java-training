//Basic understanding of how pass by reference works

package org.example;
public class PassBy {
    public void passByReference(int sampleNumber, String sampleString, PassBy passBy) {

        System.out.println("=================================Inside PassByReference()===================================");
        System.out.println("sample number");
        System.out.println("Printing sampleNumber directly = " + sampleNumber);
        System.out.println("Printing sampleNumber identityHashCode = " + System.identityHashCode(sampleNumber));
        System.out.println("sample String");
        System.out.println("Printing sampleString directly = " + sampleString);
        System.out.println("Printing sampleString Hashcode = " + sampleString.hashCode());//Same Hashcode we can see
        System.out.println("Printing sampleString identityHashCode = " + System.identityHashCode(sampleString));
        System.out.println("Pass By Object");
        System.out.println("Printing passBy Directly = " + passBy);//Here we can see same reference as in the main method
        System.out.println("Printing passBy Hashcode = " + passBy.hashCode());//also same hashcode
        System.out.println("Printing passBy identityHashcode = " + System.identityHashCode(passBy));
    }

    public static void main(String[] args) {
        int sampleNumber = 10;
        String sampleString = "Imam";
        PassBy passBy = new PassBy();

        System.out.println("================================Inside main()===============================================");
        System.out.println("sample number");
        System.out.println("Printing sampleNumber directly = " + sampleNumber);
        System.out.println("Printing sampleNumber identityHashCode = " + System.identityHashCode(sampleNumber));
        System.out.println("sample String");
        System.out.println("Printing sampleString directly = " + sampleString);
        System.out.println("Printing sampleString Hashcode = " + sampleString.hashCode());
        System.out.println("Printing sampleString identityHashCode = " + System.identityHashCode(sampleString));
        System.out.println("Pass By Object");
        System.out.println("Printing passBy Directly = " + passBy);
        System.out.println("Printing passBy Hashcode = " + passBy.hashCode());
        System.out.println("Printing passBy identityHashcode = " + System.identityHashCode(passBy));
        passBy.passByReference(sampleNumber, sampleString, passBy);
    }
}
