import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamsExample {

    public static void main(String[] args) {
        List<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(30);
        al.add(7);
        al.add(40);

        //List<Integer> newal=new ArrayList<Integer>();
       // newal= al.stream().filter(x -> x>15).collect(Collectors.toList());
      al.stream().map(i->i*i).forEach(x -> System.out.println(x));
       // newal.stream().forEach(System.out::println);

       /* for(Integer i:newal){
            System.out.println(i);
        }*/



    }



}
