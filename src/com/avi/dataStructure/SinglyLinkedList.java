public class SinglyLinkedList{
    private ListNode head;
    //Create a node for  linked list
    private static class ListNode{
        private int  data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
   public void display(){
        ListNode current=head;
        while(current !=null){
            System.out.print(current.data + " --> ");
            current=current.next;
        }
        System.out.println("null");
   }

   public int returnLength(){

        if(head == null){
            return 0;
        }
        int count =0;
        ListNode current=head;
        while(current != null){
            count++;
            current=current.next;   //moving to next node
        }
        return count;
   }

   public void addNewNodeAtBeginning(int value){
       ListNode newNode =new ListNode(value);
       newNode.next=head;
       head=newNode;
   }
   public void addNewNodeAtEnd(int value){
        ListNode newNode=new ListNode(value);

        if(head == null){

            head=newNode;
            return;
        }
        ListNode current=head;
        while(current.next != null){  // because the end node next pointer is always null
            current=current.next;
        }
        current.next=newNode;
   }

   public void addNewNodeAtPosition(int value,int pos){
        ListNode newNode=new ListNode(value);
        if(pos == 1){
           newNode.next=head;
           head=newNode;
            return;
        }
        else{
            ListNode previous =head;
            int count =1;
            while(count < pos-1){
                previous= previous.next;
                count ++;
            }
            ListNode current =previous.next;
            newNode=current;
            previous.next =newNode;
        }



    }
    //Initialize head and tail for the doubly linked list
    public static void main(String[] args) {
    SinglyLinkedList sll=new SinglyLinkedList();
    sll.head=null;
    ListNode first=new ListNode(10);
    ListNode second =new ListNode(2);
    ListNode third =new ListNode(8);
    ListNode fourth =new ListNode(14);

    sll.head=first;

    first.next=second;
    second.next=third;
    third.next=fourth;
    //sll.addNewNodeAtBeginning(9);
    //sll.addNewNodeAtEnd(10);
    sll.addNewNodeAtPosition(3,3);
    sll.display();
   System.out.println("length of the linked list is "+sll.returnLength());
    }


}