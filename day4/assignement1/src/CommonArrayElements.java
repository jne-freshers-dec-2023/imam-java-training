import java.util.*;

// Java Program to find common elements provided in 2 array.
public class CommonArrayElements {

    public Set<Integer> getcommonArrayElements(int[] arrayOne, int[] arrayTwo) {

        Set<Integer> setOne = new HashSet<>();
        for (int i:arrayOne){
            setOne.add(i);
        }

        Set<Integer> setTwo = new HashSet<>();
        for (int j:arrayTwo){
            setTwo.add(j);
        }

        System.out.println(setOne);
        System.out.println(setTwo);
        Set<Integer> commonElements = new HashSet<>();
        if (setOne.size() < setTwo.size()) {
            Iterator<Integer> iterator = setOne.iterator();
            Integer num;
            while (iterator.hasNext()) {
                num = iterator.next();
                if (setTwo.contains(num)) {
                    commonElements.add(num);
                }

            }
        } else {
            Iterator<Integer> iterator = setTwo.iterator();
            Integer num;
            while (iterator.hasNext()) {
                num = iterator.next();
                if (setOne.contains(num)) {
                    commonElements.add(num);
                }

            }
        }

        return commonElements;

    }



}
