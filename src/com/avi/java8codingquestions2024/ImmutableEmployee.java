package com.avi.java8codingquestions2024;

public class ImmutableEmployee {


    public final class Employee
    {
        final String pancardNumber;
        public Employee(String pancardNumber)
        {
            this.pancardNumber=pancardNumber;
        }
        public String getPancardNumber(){
            return pancardNumber;
        }
    }

        public void main(String ar[])
        {
            Employee e = new Employee("ABC123");
            String s1 = e.getPancardNumber();
            System.out.println("Pancard Number: " + s1);
        }


    //The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
    //  The class is final so we cannot create the subclass.
    //There is no setter methods i.e. we have no option to change the value of the instance variable.

}
