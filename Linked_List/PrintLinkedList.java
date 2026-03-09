package Linked_List;

public class PrintLinkedList {
    // method 01 : recursivly 
    public static void display(Node head){
        if(head ==null) {
            System.out.println("null");
            return ;
         }

        System.out.print(head.val + "->");
        display(head.next);
    }




    // Method 02 : simplly
    public static void main(String[] args) {
        Node  a = new Node(23);
        Node  b = new Node(24);
        Node  c = new Node(25);
        Node  d = new Node(26);
        a.next=b;
        b.next=c;
        c.next=d;
        Node temp = a;

        for (int i = 0; temp != null; i++) {
            System.out.print(temp.val+"->");
            temp = temp.next;
            
        }
        System.out.println("Null");
    display(a);
    }
    
}
