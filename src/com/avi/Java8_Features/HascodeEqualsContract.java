public class HascodeEqualsContract {

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setId(1);
        e1.setName("Aviral");

        Employee e2 =new Employee();
        e2.setId(7);
        e2.setName("Megha");

        System.out.println("Shallow Comparison"+"  "+(e1 == e2));
        System.out.println("Shallow Comparison"+"  "+(e1.equals(e2)));
    }

}
