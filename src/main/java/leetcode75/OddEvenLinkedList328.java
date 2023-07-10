package leetcode75;

public class OddEvenLinkedList328 {

    public static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val);
            System.out.print(" ");
            head = head.next;
        }
    }

    public ListNode oddEvenList(ListNode head) {

        int ptr = 1;
        ListNode p=null, q=null, phead=null, qhead=null;
        while (head != null) {
            if ((ptr & 1) == 1) { // odd
                if (ptr == 1) {
                    phead = head;
                } else {
                  p.next = head;
                }
                p = head;
            } else { // even
                if (ptr == 2) {
                    qhead = head;
                } else {
                    q.next = head;
                }
                q = head;
            }
            head = head.next;
            ptr++;
        }

        if (q != null)
            q.next = null;

        if (p != null)
            p.next = qhead;

        return phead;
    }

    public static void main(String[] args) {
        ListNode n6 = new ListNode(7, null);
        ListNode n5 = new ListNode(6, n6);
        ListNode n4 = new ListNode(5, n5);
        ListNode n3 = new ListNode(4, n4);
        ListNode n2 = new ListNode(3, n3);
        ListNode n1 = new ListNode(2, n2);
        ListNode n0 = new ListNode(1, n1);
        printList(n0);
        System.out.println();

        OddEvenLinkedList328 solution = new OddEvenLinkedList328();

        ListNode n = solution.oddEvenList(n0);
        printList(n);
        System.out.println();



    }
}




