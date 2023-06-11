import java.util.*;

public class QueueandStackExample {

    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<Integer>();

        q.offer(1);
        q.offer(2);
    //FIFO
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
//LIFO
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);

        while(!s.empty()){

            System.out.println(s.peek());
            s.pop();
        }


        Deque<Integer> dq=new ArrayDeque<>();
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerLast(2);


        //Also can use a stack

    }

}
