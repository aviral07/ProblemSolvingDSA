import java.util.Objects;

public class Employee {


    private int id;
    private String name;
    private int age;
    private String gender;

    private String department;

    private int yearOfJoining;

    private double salary;
    private String designation;
    private String loc;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary, String designation, String loc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.designation = designation;
        this.loc = loc;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                ", designation='" + designation + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    /* @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id && name.equals(employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }   */
    public boolean equals(Object o){

        if( o == null  || getClass() != o.getClass()) {  // object of same class
            return false;
        }

        if(this == o){   // e1 == e2 means object reference is same

            return true;
        }
   Employee e=(Employee) o;
        return (this.getId() == e.getId());
    }



}
