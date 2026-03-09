package Linked_List;

public class LT237 { // deleting Node with a given Node ;
    void deletingNode(Node d){
        d.val= d.next.val;
        d.next = d.next.next;
    }
    
}
