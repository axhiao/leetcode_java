package leetcode75;


import java.util.List;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class DeleteMiddleNode2095 {

    public ListNode deleteMiddle(ListNode head) {
        // only single head node
        if (head == null || head.next == null)
            return null;

        ListNode ptr = new ListNode(-1, head);
        ListNode ptr2 = new ListNode(-1, head);

        while(ptr2.next != null && ptr2.next.next != null) {
            ptr2 = ptr2.next.next;
            ptr = ptr.next;
        }
        // delete the node after ptr
        ptr.next = ptr.next.next;
        return head;

    }
    public static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val);
            System.out.print(" ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
//        ListNode n6 = new ListNode(6, null);
//        ListNode n5 = new ListNode(2, n6);
//        ListNode n4 = new ListNode(1, n5);
//        ListNode n3 = new ListNode(4, null);
//        ListNode n2 = new ListNode(3, n3);
        ListNode n1 = new ListNode(1, null);
        ListNode n0 = new ListNode(2, n1);
        printList(n0);
        System.out.println();

        DeleteMiddleNode2095 solution = new DeleteMiddleNode2095();
        ListNode n = solution.deleteMiddle(n0);

        printList(n);
        System.out.println();


    }
}
