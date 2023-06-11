import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {

        List<Integer> lk =new ArrayList<>();
        lk.add(1);
        lk.add(2);
        lk.add(3);

        ListIterator<Integer>  li =lk.listIterator();

        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.previous());
    }
}
