import java.util.*;
import java.util.stream.Collectors;

public class Java8InterviewQuestion2024 {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(1,"Aviral",28,"M","FRMS",2021,150000.00,"Professional","Pune"));
        empList.add(new Employee(1,"Anuvi",23,"F","Card",2019,80000.00,"SeniorAss","Noida"));
        empList.add(new Employee(1,"Amit",34,"M","FRMS",2020,120000.00,"Specialist","Pune"));
        empList.add(new Employee(1,"Heena",27,"F","Card",2017,90000.00,"Professional","Pune"));
        empList.add(new Employee(1,"Anuvi",28,"M","FRMS",2011,95000.00,"Professional","Noida"));

        //Group the employees by department
        Map<String,List<Employee>> empByDept;
        empByDept=empList.stream().collect(Collectors.groupingBy((Employee::getDepartment)));
        //System.out.println(empByDept);
     // maximu  age of employees
        OptionalInt max=empList.stream().mapToInt(Employee::getAge).max();

        //Average age of male and female employees
        Map<String,Double> averageOFMaleandFemalwe=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
    }
}
