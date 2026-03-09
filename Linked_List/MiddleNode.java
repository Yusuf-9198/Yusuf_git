package Linked_List;

public class MiddleNode {
    public Node middleNode(Node head) {
        Node temp =head;
        int count =0;
        while(temp.next != null){
            temp= temp.next;
            count++;
        }
        int n= count;
        if(n%2==0){
            int i=0;
            Node temp1 =head;
            while(i != (n/2) ){
                temp1 = temp1.next;
                i++;
            }
            return temp;
        }else{
            int i=0;
            Node temp1 =head;
            while(i != (n+1/2) ){
                temp1 = temp1.next;
                i++;
            }
            return temp;

        }
    }
    public static void main(String[] args) {
        
    }
}
