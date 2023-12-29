import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //Task One
        System.out.println("Task One: Write a program to join two ArrayList into one single ArrayList");
        CombineArrayList combineArrayList = new CombineArrayList();
        List<String> nameList1 = new ArrayList<>();
        List<String> nameList2 = new ArrayList<>();
        nameList1.add("Thinkitive");
        nameList1.add("Thinkitive");
        nameList1.add("Thinkitive");
        nameList2.add("Technologies");
        nameList2.add("Technologies");
        nameList2.add("Technologies");
        List<String> joinedList = combineArrayList.getCombinedArrayList(nameList1, nameList2);
        System.out.println("Result for Joining " + nameList1 + " with " + nameList2 + " is :");
        System.out.println(joinedList);

        //Task Two
        System.out.println("Task two WAP to find common elements provided in 2 array.");
        CommonArrayElements commonArrayElements = new CommonArrayElements();
        int[] arrayOne = {2, 1, 4, 5, 7, 8, 9,2,4,6,3,10,9,2,0};
        int[] arrayTwo = {6, 3, 0, 5, 3, 2,5,6,3,7,8};
        System.out.println("First Array :");
        for (int num : arrayOne) {
            System.out.print(num);
        }
        System.out.println("\nSecond Array :");
        for (int num : arrayTwo) {
            System.out.print(num);
        }
        System.out.println();
        Set<Integer> commonElements = commonArrayElements.getcommonArrayElements(arrayOne, arrayTwo);
        System.out.println(commonElements);

        //Task Three
        System.out.println("Task three WAP to check balanced bracket.");
        String sampleStringOne = "[company:(Thinkitive Tecnologies)]";
        String sampleStringTwo = "[company:(Thinkitive Tecnologies])";
        BalancedBracket balancedBracket = new BalancedBracket();
        System.out.println("Verification of String '" + sampleStringOne + "' for Balanced Bracket is : " + balancedBracket.getBracketVarified(sampleStringOne));
        System.out.println("Verification of String '" + sampleStringTwo + "' for Balanced Bracket is : " + balancedBracket.getBracketVarified(sampleStringTwo));


        //Task Four
        System.out.println("Task four Choose and implement correct data structure to reverse a String");

        //Task Five
        System.out.println("Task Five WAP to count vowel in given string using collections. ");
        String company = "Thinkitive Tecnologies";
        CountVowels countVowels = new CountVowels();
        int count = countVowels.getVowelsCount(company);
        System.out.println("Vowels count in " + company + " is = " + count);

        //Task Six
        System.out.println("Task Six Matrix Multiplication");
        MatrixMultiplication matrixMultiplication = new MatrixMultiplication();
        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] secondMatrix = {{7, 8}, {9, 10}, {11, 12}};
        int[][] result = matrixMultiplication.multiplyMatrices(firstMatrix, secondMatrix);
        System.out.println("First Matrix :");
        matrixMultiplication.displayMatrix(firstMatrix);
        System.out.println("\nSecond Matrix");
        matrixMultiplication.displayMatrix(secondMatrix);
        System.out.println("\nResult of Matrix Multiplication:");
        matrixMultiplication.displayMatrix(result);
    }
}