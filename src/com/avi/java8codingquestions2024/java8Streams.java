package com.avi.java8codingquestions2024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


class Person{

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}

public class java8Streams {
    //longest string in a list of strings using Java streams
    List<String> strings = Arrays
            .asList("apple", "banana", "cherry", "date", "grapefruit");
    Optional<String> longestString=strings.stream().max(Comparator.comparingInt(String::length));


   // average age of a list of Person objects using Java streams:
   List<Person> persons = Arrays.asList(
           new Person("Alice", 25),
           new Person("Bob", 30),
           new Person("Charlie", 35)
   );
    double averageAge = persons.stream()
            .mapToInt(Person::getAge)
            .average()
            .orElse(0);
}
