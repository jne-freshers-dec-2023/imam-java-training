//Java Program for custom exception handling 

//Methods and classes are written in way to just get understatnding of usage of each Exception key word
import java.util.Scanner;

class JavaExceptionDemo {

    public void checkEvenNumber(int inputNumber) {

        if (inputNumber % 2 == 0) {
            System.out.println(inputNumber + " is Even Number Number");
        } else {
            throw new EvenOddException(inputNumber + " is Not a Even Number");
        }

    }

    public void getInput(Scanner scanner) throws EvenOddException {
        System.out.println("Enter a Number = ");
        int inputNumber = scanner.nextInt();
        checkEvenNumber(inputNumber);
    }

    public static void main(String[] args) {
        System.out.println("============Start=============");

        Scanner scanner = new Scanner(System.in);
        JavaExceptionDemo javaExceptionDemo = new JavaExceptionDemo();
        try {

            javaExceptionDemo.getInput(scanner);

        } catch (EvenOddException evenOddException) {

            // evenOddException.printStackTrace();
            System.err.println("Wrong Input");
        } finally {
            scanner.close();
            System.out.println("Scanner Object is closed");
        }

    }
}