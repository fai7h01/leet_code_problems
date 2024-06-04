package medium;

import easy.ListNode;

public class DeleteMiddleNodeOfLL {

    public static ListNode removeMiddle(ListNode head){
        if (head.next == null) return null;
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode prev = null;
        while (p2 != null && p2.next != null){
            prev = p1;
            p1 = p1.next;
            p2 = p2.next.next;
        }
        prev.next = p1.next;
        p1.next = null;
        return head;
    }

}
