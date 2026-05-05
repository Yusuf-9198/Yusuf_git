/*
Given the head of a linked list, rotate the list to the right by k places.
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
*/
/*61. Rotate List
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class RotatedListLeet61{
     public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode rotateRight(ListNode head, int k) {
        int n = 1;
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            n++;  
        };
        temp = null;
        if(k % n == 0) return head;
        int t = k%n;
        for (int i = 0; i < t; i++) {
            temp = head;
            for (int j = 0; j < n-2; j++) {
                temp = temp.next;
            }
            ListNode temp2 = temp.next;
            temp.next = null;
            temp2.next = head;
            head = temp2;

        }
        return head;
  
    }
}

