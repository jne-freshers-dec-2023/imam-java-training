import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class DemoForSet {

    public void sampleHashsetMethod() {

        Set<String> setOfDrinks = new HashSet<>();
        setOfDrinks.add("Tea");
        setOfDrinks.add("Coffee");
        setOfDrinks.add("Softdrinks");
        setOfDrinks.add("Coffee");
        System.out.println("setOfDrinks: " + setOfDrinks);
        setOfDrinks.remove("Softdrinks");
        System.out.println("setOfDrinks after removal: " + setOfDrinks);
        System.out.println("Contains 'coffee': " + setOfDrinks.contains("coffee"));
        System.out.println("Iterating through the HashSet using Iterator:");
        Iterator<String> iterator = setOfDrinks.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Iterating through the setOfDrinks using for-each loop:");
        for (String drink : setOfDrinks) {
            System.out.println(drink);
        }
        System.out.println("Size of the setOfDrinks: " + setOfDrinks.size());
        setOfDrinks.clear();
        System.out.println("setOfDrinks after clearing all elements: " + setOfDrinks);

    }

    public void sampleLinkedHashSetMethod() {
        Set<String> fruitsSet = new LinkedHashSet<>();
        fruitsSet.add("Apple");
        fruitsSet.add("Banana");
        fruitsSet.add("Orange");
        fruitsSet.add("Apple");
        System.out.println("LinkedHashSet: " + fruitsSet);
        fruitsSet.remove("Banana");
        System.out.println("LinkedHashSet after removal: " + fruitsSet);
        System.out.println("Contains 'Orange': " + fruitsSet.contains("Orange"));
        System.out.println("Iterating through the LinkedHashSet using Iterator:");
        Iterator<String> iterator = fruitsSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Iterating through the LinkedHashSet using for-each loop:");
        for (String fruit : fruitsSet) {
            System.out.println(fruit);
        }
        System.out.println("Size of the LinkedHashSet: " + fruitsSet.size());
        fruitsSet.clear();
        System.out.println("LinkedHashSet after clearing all elements: " + fruitsSet);

    }

    public void sampleTreeSetMethod(){

        Set<String> colorSet = new TreeSet<>();
        colorSet.add("Red");
        colorSet.add("Green");
        colorSet.add("Blue");
        colorSet.add("Black");
        System.out.println("colorSet: " + colorSet);
        colorSet.remove("Red");
        System.out.println("colorSet after removal: " + colorSet);
        System.out.println("Contains 5: " + colorSet.contains("Green"));
        System.out.println("Iterating through the colorSet using Iterator:");
        Iterator<String> iterator = colorSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Iterating through the TreeSet using for-each loop:");
        for (String color : colorSet) {
            System.out.println(color);
        }
        System.out.println("Size of the TreeSet: " + colorSet.size());
        colorSet.clear();
        System.out.println("TreeSet after clearing all elements: " + colorSet);
    
    }

    public static void main(String[] args) {

        DemoForSet demoForSet = new DemoForSet();

        System.out.println("=============HashSet================");
        demoForSet.sampleHashsetMethod();
        System.out.println("=============LinkedHashSet================");
        demoForSet.sampleLinkedHashSetMethod();
        System.out.println("=============HashSet================");
        demoForSet.sampleTreeSetMethod();
    }
}