public class DemoForString {

    public static void main(String[] args) {

        // Creating strings
        String sampleString1 = "Thinkitive ";
        String sampleString2 = "Technologies";
        String company;

        // Concatenation
        company = sampleString1 + sampleString2;
        System.out.println("Concatenated String: " + company);

        //Compare two Strings
        System.out.println("Compairing "+sampleString1+" with "+sampleString2+" = "+sampleString1.compareTo(sampleString2));

        //contains a char sequence or not
        System.out.println("Checking "+company+" contains "+sampleString2+" or not = "+company.contains(sampleString2));

        byte[] companyArry=company.getBytes();
        System.out.print("Byte array from the string "+company+" = ");
        for(byte b:companyArry){
            System.out.print(b);
        }

        System.out.println();
        System.out.println("Created String from byte array = "+new String(companyArry));

        // Length of the string
        int length = company.length();
        System.out.println("Length of the String: " + length);

        // Character at a specific index
        char charAtIndex = company.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        // Substring
        String substring = company.substring(0, 5);
        System.out.println("Substring (0, 5): " + substring);

        // Uppercase and lowercase
        String upperCaseString = company.toUpperCase();
        String lowerCaseString = company.toLowerCase();
        System.out.println("Uppercase: " + upperCaseString);
        System.out.println("Lowercase: " + lowerCaseString);

        // Check if a string starts or ends with a specific prefix/suffix
        boolean startsWithThink = company.startsWith("Think");
        boolean endsWithLogies = company.endsWith("logies");
        System.out.println("Starts with 'Think': " + startsWithThink);
        System.out.println("Ends with 'logies': " + endsWithLogies);

        // Index of a specific substring
        int indexOfLogies = company.indexOf("logies");
        System.out.println("Index of 'logies': " + indexOfLogies);

        // Replace characters in a string
        String replacedString = company.replace('s', '5');
        System.out.println("String after replacing 's' with '5': " + replacedString);

        // Splitting a string into an array
        String[] words = company.split(" ");
        System.out.println("Words in the String are : ");
        for (String word : words) {
            System.out.println(word);
        }

        // Removing leading and trailing whitespaces
        String stringWithSpaces = "  Shaikh Imam  ";
        System.out.println("String before trimming: '" + stringWithSpaces + "'");
        String trimmedString = stringWithSpaces.trim();
        System.out.println("String after trimming: '" + trimmedString + "'");

        // Comparing strings
        String sampleString3 = "Thinkitive Technologies";
        boolean areEqual = company.equals(sampleString3);
        System.out.println("Are the strings equal? " + areEqual);

        // Comparing strings (case-insensitive)
        boolean areEqualIgnoreCase = company.equalsIgnoreCase(sampleString3);
        System.out.println("Are the strings equal (ignore case)? " + areEqualIgnoreCase);
    }
}
