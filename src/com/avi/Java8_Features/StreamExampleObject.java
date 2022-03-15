import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExampleObject {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(1,"Aviral",28,"M","FRMS",2021,100000.00,"Professional","Pune"));
        empList.add(new Employee(1,"Anuvi",23,"F","Card",2019,80000.00,"SeniorAss","Noida"));
        empList.add(new Employee(1,"Amit",34,"M","FRMS",2020,120000.00,"Specialist","Pune"));
        empList.add(new Employee(1,"Heena",27,"F","Card",2017,90000.00,"Professional","Pune"));
        empList.add(new Employee(1,"Aviral",28,"M","FRMS",2011,95000.00,"Professional","Noida"));
        //empList.add(new Employee(1,"Aviral",28,"M","FRMS",2021,100000.00,"Professional","Pune"));
       // empList.add(new Employee(1,"Aviral",28,"M","FRMS",2021,100000.00,"Professional","Pune"));

    //Fetch the employees names whose age are greater than 25 and designations are professional
       // List<Employee> tempList= empList.stream().filter(e -> e.getAge()>25 && "Professional".equalsIgnoreCase(e.getDesignation())).collect(Collectors.toList());
       // List<Employee> tempList= empList.stream().filter(e -> "Pune".equalsIgnoreCase(e.getLoc())).collect(Collectors.toList());
       // Stream<Employee> tempList= empList.stream().filter(e -> "Pune".equalsIgnoreCase(e.getLoc())).sorted();
       // tempList.stream().forEach(e -> System.out.println(e.getName()));
        Set<String> uniquenames=new HashSet<>();
        Set<Employee>  duplicateNames= empList.stream().filter(e->!uniquenames.add(e.getName())).collect(Collectors.toSet());
        duplicateNames.stream().forEach(e->System.out.println(e.getName()));
        //sorted(i2,i1) ->i2.compareTo(i1))
      //  tempList.forEach(e -> System.out.println(e));
    }
}
