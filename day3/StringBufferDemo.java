public class StringBufferDemo {
        
    public static void main(String[] args) {
        StringBuffer myName = new StringBuffer("Shaikh ");
        myName.append("Imam");
        System.out.println("Appended String: " + myName);
        int length = myName.length();
        myName.insert(0, "*");
        myName.insert(length+1, "*");
        System.out.println("name after insertion: " + myName);
        myName.delete(7, myName.length());
        System.out.println("name after deletion: " + myName);
        myName.reverse();
        System.out.println("Reversed name: " + myName);
        myName.reverse();
        myName.setLength(5);
        System.out.println("name after setting length: " + myName);
        int capacity = myName.capacity();
        length = myName.length();
        System.out.println("Capacity: " + capacity);
        System.out.println("Length: " + length);
        myName.append(true).append(42).append(3.14).append('A');
        System.out.println("String after appending various data types: " + myName);
        String resultString = myName.toString();
        System.out.println("Converted to String: " + resultString);
        myName.delete(0, myName.length());
        System.out.println("Cleared StringBuffer: " + myName);
        boolean isEmpty = myName.length() == 0;
        System.out.println("Is StringBuffer empty? " + isEmpty);
    }
}
