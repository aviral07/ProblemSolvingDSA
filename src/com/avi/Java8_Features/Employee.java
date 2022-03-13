import java.util.Objects;

public class Employee {


    int id;
    String name;

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
