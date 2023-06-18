import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class StreamExampleObject {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(1,"Aviral",28,"M","FRMS",2021,150000.00,"Professional","Pune"));
        empList.add(new Employee(1,"Anuvi",23,"F","Card",2019,80000.00,"SeniorAss","Noida"));
        empList.add(new Employee(1,"Amit",34,"M","FRMS",2020,120000.00,"Specialist","Pune"));
        empList.add(new Employee(1,"Heena",27,"F","Card",2017,90000.00,"Professional","Pune"));
        empList.add(new Employee(1,"Anuvi",28,"M","FRMS",2011,95000.00,"Professional","Noida"));

        //Important questions for Interviews

        //Q1Fetch the employees names whose age are greater than 25 and designations are professional
        List<Employee> empgreater25desprofessional=empList.stream().filter(e ->(e.getAge()>25 && "Professional".equalsIgnoreCase(e.getDesignation()))).collect(Collectors.toList());

        //Q2Fetch the employees names whose location is pune
         //empList.stream().filter(e ->e.getLoc().equalsIgnoreCase("Pune")).map(Employee::getName).forEach(System.out::println);

        //Q3Fetch the unique employees names in the emp list
         Set<String> uniquenames=new HashSet<>();
         empList.stream().filter(e->!uniquenames.add(e.getName())).map(Employee::getName).forEach(System.out::println);

        //Q4Fetch names of all the departments
        empList.stream().map(e->e.getDepartment()).distinct().forEach(System.out::println);

        //Q5Find Third highest salary of employee
        Optional<Double> salary=empList.stream().map(e->e.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst();

        //Q6 Find Highest paid employee
        Optional<Double> Highestpaidsalary=empList.stream().map(e->e.getSalary()).sorted(Comparator.reverseOrder()).findFirst();

        //Q7 Find Employee name who has 3rd highest salary
        Optional<Employee> emp = empList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst();
        System.out.println(emp.get().getName());

        //Q8Find String in this array of strings which starts with Ba(Asked in barclays Interview)

        //System.out.println(noOfMaleAndFemaleEmployees);
        List<String> listOfStringBag = Arrays.asList("Bags", "Ba", "Banner", "Baggage");

        List<String> listOfStringStartsWithBa = listOfStringBag.stream() .filter(s ->s.startsWith("Bag")) .collect(Collectors.toList());
        // System.out.println("list of String starts with  Ba: " + listOfStringStartsWithBa);

        //Q9 Remove duplicate character from a string(

        String orignalString = "aviralrrraa";

        String output = Arrays.asList(orignalString.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());

        System.out.println("Original String : " + orignalString);
        System.out.println("After removing the duplicates : " + output);


        //Q10 Convert List to Simple Map using Streams – toMap() Collector

        Map<Integer, String> map = empList.stream()
                .collect
                        (Collectors.toMap(Employee::getId, Employee::getName));

        //Q11 Convert List to Simple Map using Streams – toMap() Collector


        Map<Integer, Employee> map2 = empList.stream()
                .collect
                        (Collectors.toMap(Employee::getId, Function.identity()));

       // List<Employee> tempList= empList.stream().filter(e -> "Pune".equalsIgnoreCase(e.getLoc())).collect(Collectors.toList());
       // Stream<Employee> tempList= empList.stream().filter(e -> "Pune".equalsIgnoreCase(e.getLoc())).sorted();
       // tempList.stream().forEach(e -> System.out.println(e.getName()));
       // Set<String> uniquenames=new HashSet<>();
      //  Set<Employee>  duplicateNames= empList.stream().filter(e->!uniquenames.add(e.getName())).collect(Collectors.toSet());
      //  duplicateNames.stream().forEach(e->System.out.println(e.getName()));
        //sorted(i2,i1) ->i2.compareTo(i1))
      //  tempList.forEach(e -> System.out.println(e));
   //empList.stream().map(e ->e.getDepartment()).distinct().forEach(System.out::println);

       Map<String, Long> noOfMaleAndFemaleEmployees=
                empList.stream().collect(Collectors.groupingBy(e->e.getGender(), Collectors.counting()));

        //System.out.println(noOfMaleAndFemaleEmployees);
        List<String> listOfString = Arrays.asList("Java", "C", "C++", "Go", "JavaScript", "Python", "Scala");

        List<String> listOfStringStartsWithJ = listOfString.stream() .filter(s -> s.startsWith("J")) .collect(Collectors.toList());
      //  System.out.println("list of String starts with letter J: " + listOfStringStartsWithJ);
        Optional<Employee> highestPaidEmployeeWrapper=
                empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));


        Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
      //  System.out.println("Details Of Highest Paid Employee : "+highestPaidEmployee);
    // Optional<Double> salary=empList.stream().map(e->e.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst();
      // List<String> names = (List<String>) empList.stream().collect(Collectors.toList(Comparator.comparing(Employee::getName)));






    }
}
