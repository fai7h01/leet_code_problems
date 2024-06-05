package medium;

import easy.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode current = head;
        while(current != null){
            if(set.contains(current)) return current;
            set.add(current);
            current = current.next;
        }
        return null;
    }
}
