package test;

import easy.ListNode;

import java.util.HashSet;
import java.util.Set;

public class InterSectionOf2LL {

    public static ListNode findIntersection(ListNode head1, ListNode head2){

        Set<ListNode> set = new HashSet<>();

        while (head1 != null){
            set.add(head1);
            head1 = head1.next;
        }

        while (head2 != null){
            if (!set.add(head2)) return head2;
            head2 = head2.next;
        }
        return null;

    }

    public static ListNode findIntersectionOptimized(ListNode head1, ListNode head2){

        int size1 = getLength(head1); int size2 = getLength(head2);

        if (size1 > size2){
            int difference = size1 - size2;
            for (int i = 0; i < difference; i++) {
                head1 = head1.next;
            }
        }else{
            int difference = size2 - size1;
            for (int i = 0; i < difference; i++) {
                head2 = head2.next;
            }
        }

        while(head1 != null && head2 != null){
            if (head1 == head2) return head1;
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;


    }

    private static int getLength(ListNode head){
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

}
