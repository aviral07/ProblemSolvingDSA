package ComparablevsComparator;
import java.util.*;

public class Student implements Comparable<Student>{

    int id;
    String name;

    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


//Interview Question if we dont override toStringmethod whenever we print objects it shows hashcode in console but if we need to get an

    //When you print an object, by default the Java compiler invokes the toString() method on the object. So by overriding the toString() method, we can provide meaningful output.
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {
        return this.id-s.id;
    }

    public static Comparator<Student> nameComparator=new Comparator<Student>() {
        @Override
        public int compare(Student s1,Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    };
}
