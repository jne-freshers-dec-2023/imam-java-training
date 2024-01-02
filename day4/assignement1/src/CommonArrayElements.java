// Java Program to find common elements provided in 2 array.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CommonArrayElements {
    public Set<Integer> getSetFromArray(int[] sampleArray) {
        Set<Integer> sampleSet = new HashSet<>();
        for (int i : sampleArray) {
            sampleSet.add(i);
        }
        return sampleSet;
    }

    public Set<Integer> getElements(Set<Integer> sampleSetOne, Set<Integer> sampleSetTwo) {
        Set<Integer> commonElements = new HashSet<>();
        Iterator<Integer> iterator = sampleSetOne.iterator();
        Integer num;
        while (iterator.hasNext()) {
            num = iterator.next();
            if (sampleSetTwo.contains(num)) {
                commonElements.add(num);
            }
        }
        return commonElements;
    }

    public Set<Integer> getCommonArrayElements(int[] arrayOne, int[] arrayTwo) {
        Set<Integer> setOne = getSetFromArray(arrayOne);
        Set<Integer> setTwo = getSetFromArray(arrayTwo);
        if (setOne.size() < setTwo.size()) {
            return this.getElements(setOne, setTwo);
        } else {
            return this.getElements(setTwo, setOne);
        }
    }
}