package Linked_List;


class Node{
    int val;
    Node next;
    Node(int val){
        this.val= val;

    }
}
public class LLBasics {
    public static void main(String[] args) {
        Node a =new Node(10);
        System.out.println(a);
        System.out.println(a.val);
        System.out.println(a.next );
        Node b =new Node(39);
        Node c =new Node(678);
        a.next =b; // 10 -> 39
        b.next =c; // 10 -> 39 ->678
        
    }
     
    
}
