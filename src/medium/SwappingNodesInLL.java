package medium;

import easy.ListNode;

public class SwappingNodesInLL {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode l = head;
        ListNode r = head;

        for (int i = 0; i < k - 1; i++){
            r = r.next;
        }
        ListNode r2 = r;

        while (r.next != null){
            r = r.next;
            l = l.next;
        }
        int temp = r2.val;
        r2.val = l.val;
        l.val = temp;

        return head;

    }
}
