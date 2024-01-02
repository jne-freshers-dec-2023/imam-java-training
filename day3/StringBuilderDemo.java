public class StringBuilderDemo {
    
    public static void main(String[] args) {
        StringBuilder company = new StringBuilder("Thinkitive ");
        company.append("Technologies");
        System.out.println("Appended String: " + company);
        int length = company.length();
        company.insert(23, " Pvt Ltd.");
        System.out.println("String after insertion: " + company);
        company.delete(23, company.length());
        System.out.println("String after deletion: " + company);
        company.reverse();
        System.out.println("Reversed String: " + company);
        company.setLength(5);
        System.out.println("String after setting length: " + company);
        int capacity = company.capacity();
        length = company.length();
        System.out.println("Capacity: " + capacity);
        System.out.println("Length: " + length);
        company.append(true).append(42).append(3.14).append('A');
        System.out.println("String after appending various data types: " + company);
        String resultString = company.toString();
        System.out.println("Converted to String: " + resultString);
        company.delete(0, company.length());
        System.out.println("Cleared StringBuilder: " + company);
        boolean isEmpty = company.length() == 0;
        System.out.println("Is StringBuilder empty? " + isEmpty);
    }
}
