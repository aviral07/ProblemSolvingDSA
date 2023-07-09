import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
       set1.add(4);
        set1.add(1);
        //System.out.println(set1);


        Set<Integer> set2 = new HashSet<>();

        set2.add(2);
        set2.add(3);
        set2.add(4);
      /*  set2.add(1);
        set2.add(2);*/

        //set1.retainAll(set2);  //all common element of set 1 is retained basically intersection
      //  set1.addAll(set2); // union of two sets
        set1.removeAll(set2);//all common elements can be removed set difference
        System.out.println(set1);
       // System.out.println(set2);

       /* for(Integer i:set1){
            System.out.println(i);

        }*/
    }
}
