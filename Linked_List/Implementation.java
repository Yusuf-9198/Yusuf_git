package Linked_List;

class SingllyLinkedList { // used as user define sturcture
    Node head;
    Node tail;
    int size = 0;

    void insertAtEnd(int val) { // Adding At end
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;

    }

    void insertAtHead(int val) { // Adding At Begining
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;

    }

    void InsertAtIndex(int ind, int val) { // Adding At Any Index
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;
        else if (ind == 0)
            insertAtHead(val);
        else if (ind == size)
            insertAtEnd(val);
        else if (ind > size) {
            System.err.println("Invalid Index ! ");

        } else {
            Node temp2 = head;
            for (int i = 1; i <= ind - 1; i++) {
                temp2 = temp2.next;
            }
            temp.next = temp2.next;
            temp2.next = temp;

        }
        size++;
    }

    int getElement(int ind) {
        if (head == null) {
            System.out.println("Empty linked list");
            return 0;
        } else if (ind == 0) {
            return head.val;
        } else if (ind == size - 1) {
            return tail.val;
        } else if (ind >= size || ind < 0) {
            System.out.println("Invalid index!");
            return -1;
        }
        int i = 0;
        Node temp = head;
        while (i != ind) {
            temp = temp.next; // move temp forward to next node correctly
            i++;
        }
        return temp.val;
    }

    void deleteAtHead() throws Error {
        if (head == null) {
            throw new Error("Alread Emapty !");

        }
        head = head.next;
        size--;

    }

    void deleteAtTail() throws Error {
        if (head == null) {
            throw new Error("Alread Emapty !");

        } else {
            int i = 0;
            Node temp = head;
            while (i != size - 2) {
                temp = temp.next;
                i++;
            }
            tail = temp;
            temp.next = null;
        }size--;
    }

    void deleteAtIndex(int ind) throws Error {
        if (head == null) {
            throw new Error("Alread Emapty !");
        } else if (ind == 0)
            deleteAtHead();
        else if (ind == size - 2)
            deleteAtTail();
        else {
            int i = 0;
            Node temp = head;
            while (i != ind - 1) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
            size--;
        }

    }

    void display() {
        Node temp = head;

        for (int i = 0; temp != null; i++) {
            System.out.print(temp.val + "->");
            temp = temp.next;

        }
    }

    void size() {
        System.out.println("lenght of linked list is " + size);
    }

}

public class Implementation {
    public static void main(String[] args) {
        SingllyLinkedList sll = new SingllyLinkedList();
        MiddleNode m = new MiddleNode();
        sll.size();
        sll.insertAtEnd(23);
        sll.insertAtEnd(24);
        sll.insertAtEnd(25);
        sll.insertAtEnd(283);
        sll.insertAtEnd(29);
        sll.insertAtHead(26);
        sll.InsertAtIndex(2, 27);
        System.out.println(sll.getElement(4));
        sll.deleteAtIndex(2);
        sll.deleteAtHead();
        sll.deleteAtTail();
        System.out.println(sll.size); 
        System.out.println(sll.tail.val);
        Node f=m.middleNode(sll.head);
        System.out.println(f.val);
        sll.display();
    }

}
