
@FunctionalInterface
public interface FunctionalInterfaceExample {


    void singleAbstractMethod();  //only 1 abstract method but any number of default and static method


    default void printName1(){
        System.out.println("I am inside deafult mehtoid 1");
    }


}
