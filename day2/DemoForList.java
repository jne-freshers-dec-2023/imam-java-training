
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoForList {

    public void sampleArrayListMethod() {

        // Working with ArrayList
        List<String> empNameList = new ArrayList<>();
        empNameList.add("Imam");
        empNameList.add("Kedar");
        empNameList.add("Jayesh");
        empNameList.add("Arkam");
        empNameList.add(2, "Renuka");
        System.out.println("Employee Name List: " + empNameList);
        System.out.println("Employee Name at index 2: " + empNameList.get(2));
        empNameList.set(0, "Rohit");
        System.out.println("Modified Employee Name List: " + empNameList);
        System.out.println("Contains 'Arkam': " + empNameList.contains("Arkam"));
        empNameList.remove("Jayesh");
        System.out.println("Employee Name List after removing 'Jayesh': " + empNameList);
        System.out.println("Iterating through the Employee Name List using for-each loop:");
        for (String name : empNameList) {
            System.out.println(name);
        }
        System.out.println("Iterating through the Employee Name List using Iterator:");
        Iterator<String> iterator = empNameList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Size of the Employee Name List: " + empNameList.size());
        System.out.println("Is Employee Name List empty? " + empNameList.isEmpty());
        empNameList.clear();
        System.out.println("Employee Name List after clearing all elements: " + empNameList);

    }

    public void sampleLinkedListMethod() {

        // Working with LinkedList
        List<String> cityNameList = new LinkedList<>();
        System.out.println("City Name List = " + cityNameList);
        cityNameList.add("Pune");
        cityNameList.add("Nanded");
        cityNameList.add("Mumbai");
        cityNameList.add(1, "Nagpur");
        System.out.println("City Name List = " + cityNameList);
        Iterator<String> iterator=cityNameList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("City Name List get 1st index = " + cityNameList.get(1));
        cityNameList.set(1, "Nashik");
        System.out.println("Is City Name List empty = " + cityNameList.isEmpty());
        System.out.println("Checking Nanded is in the List = " + cityNameList.contains("Nanded"));
        System.out.println(cityNameList.remove("Nagpur"));
        System.out.println("City Name List after remove Nagpur= " + cityNameList);
        System.out.println("City Name List size = " + cityNameList.size());
        cityNameList.clear();
        System.out.println("City Name List = " + cityNameList);

    }

    public static void main(String[] args) {

        DemoForList demoForList = new DemoForList();

        System.out.println("==================ArrayList=========================");
        demoForList.sampleArrayListMethod();
        System.out.println("==================LinkedList=========================");
        demoForList.sampleLinkedListMethod();

    }
}