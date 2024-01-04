import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Employee {
    public int empId;
    public String empName;
    public double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}

class Student {
    public int stdId;
    public String stdName;
    public double marks;

    Student(int stdId, String stdName, double marks) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.marks = marks;
    }
}

public class DemoForMap {

    public void sampleHashMapMethod() {

        Employee emp101 = new Employee(101, "Imam", 50.5);
        Employee emp202 = new Employee(202, "Kedar", 65.5);
        Employee emp303 = new Employee(303, "Arkam", 75.5);
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(101, emp101);
        employeeMap.put(202, emp202);
        employeeMap.put(303, emp303);
        System.out.println("Employee Map = " + employeeMap);
        Employee sampleEmployee = employeeMap.get(101);
        System.out.println("ID= " + sampleEmployee.empId + " Name= " + sampleEmployee.empName + " Salary = "
                + sampleEmployee.salary);
        System.out.println("employeeMap contains key 202 = " + employeeMap.containsKey(202));
        System.out.println("employeeMap contains value emp303 = " + employeeMap.containsValue(emp303));

        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println("EmpIDKey: " + entry.getKey());
            Employee emp = entry.getValue();
            System.out.println("ID= " + emp.empId + " Name= " + emp.empName + " Salary = " + emp.salary);

        }

        System.out.println("employeeMap Size = " + employeeMap.size());
        System.out.println("Checking employeeMap is empty = " + employeeMap.isEmpty());

        employeeMap.remove(202);
        System.out.println("employeeMap after removing 202 key= " + employeeMap);
        employeeMap.clear();
        System.out.println("Checking employeeMap is empty after clear = " + employeeMap);

    }

    public void sampleLinkedHashMapMethod() {

        Student std1 = new Student(1, "Imam", 70.5);
        Student std2 = new Student(2, "Kedar", 65.5);
        Student std3 = new Student(3, "Arkam", 75.5);
        Map<Integer, Student> studentMap = new LinkedHashMap<>();

        System.out.println("studentMap Size = " + studentMap.size());
        studentMap.put(1, std1);
        studentMap.put(2, std2);
        studentMap.put(3, std3);
        System.out.println("Student Map = " + studentMap);
        System.out.println("studentMap Size = " + studentMap.size());
        Student sampleStudent = studentMap.get(1);
        System.out.println("ID= " + sampleStudent.stdId + " Name= " + sampleStudent.stdName + " Marks = "
                + sampleStudent.marks);
        System.out.println("studentMap contains key 3 = " + studentMap.containsKey(3));
        System.out.println("studentMap contains value std2 = " + studentMap.containsValue(std2));

        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("stdIDKey: " + entry.getKey());
            Student std = entry.getValue();
            System.out.println("ID= " + std.stdId + " Name= " + std.stdName + " Salary = " + std.marks);

        }

        System.out.println("studentMap Size = " + studentMap.size());
        System.out.println("Checking studentMap is empty = " + studentMap.isEmpty());

        studentMap.remove(2);
        System.out.println("studentMap after removing 2 key= " + studentMap);
        System.out.println("studentMap Size = " + studentMap.size());
        studentMap.clear();
        System.out.println("Checking studentMap is empty after clear = " + studentMap);

    }

    public void sampleTreeMapMethod(){
        Map<String, String> dataMap=new TreeMap<>();
        System.out.println("dataMap Size = " + dataMap.size());
        dataMap.put("Name", "Imam");
        dataMap.put("Address", "Nanded");
        dataMap.put("salary","50k");
        System.out.println("dataMap Size = " + dataMap.size());
        System.out.println("dataMap Contains key 'Name' = "+dataMap.containsKey("Name"));
        System.out.println("dataMap contains value 'Nanded' = "+dataMap.containsValue("Nanded"));
        for(Map.Entry<String,String> data:dataMap.entrySet()){

            System.out.println("Key = "+data.getKey()+" Value = "+data.getValue());
        }

        System.out.println("All values from dataMap = "+dataMap.values());

    }

    public static void main(String[] args) {
        DemoForMap demoForMap = new DemoForMap();
        System.out.println("================HashMap=================");
        demoForMap.sampleHashMapMethod();
        System.out.println("================LinkedHashMap=================");
        demoForMap.sampleLinkedHashMapMethod();
        System.out.println("================TreeMap=================");
        demoForMap.sampleTreeMapMethod();
    }
}