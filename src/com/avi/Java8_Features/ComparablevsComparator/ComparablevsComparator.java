package ComparablevsComparator;

import java.util.*;

public class ComparablevsComparator {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();

       studentList.add(new Student(1,"Aviral",28));
        studentList.add(new Student(2,"Anuvi",26));

        studentList.add(new Student(7,"dffd",35));
        studentList.add(new Student(3,"Andfdsuvi",39));
        Collections.sort(studentList);
      //  System.out.println(studentList);
        Collections.sort(studentList,Student.nameComparator);
        //System.out.println(studentList);
        //When you print an object, by default the Java compiler invokes the toString() method on the object. So by overriding the toString() method, we can provide meaningful output.
        Collections.sort(studentList,new StudentAgeComparator());
        System.out.println(studentList);



    }
}
