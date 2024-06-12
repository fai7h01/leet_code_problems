package test;

import easy.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LLCycle {

    public static ListNode detectCycle(ListNode head){

        Set<ListNode> set = new HashSet<>();
        ListNode current = head;
        while(current != null){
            if (set.contains(current)) return current;
            set.add(current);
            current = current.next;
        }
        return null;

    }

    public static ListNode detectCycleTwoPointer(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;

    }

}
