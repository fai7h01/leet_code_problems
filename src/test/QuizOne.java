package test;

import easy.ListNode;

public class QuizOne {

    static boolean isPalindrome(ListNode head){

        if (head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversed = reverse(slow.next);

        while (reversed != null){
            if (head.val != reversed.val) return false;
            head = head.next;
            reversed = reversed.next;
        }

        return true;
    }

    static ListNode removeNthFromEnd(ListNode head, int n){

        ListNode p1 = head, p2= head;
        ListNode prev = null, tail;

        for (int i = 0; i < n -1; i++) {
            p2 = p2.next;
        }

        while (p2.next != null){
            prev = p1;
            p1 = p1.next;
            p2 = p2.next;
        }
        tail = p2;
        if (p1 == head){
            head = head.next;
            head.next = null;
        } else if (p1 == tail) {
            tail = prev.next;
            prev.next = null;
        }else{
            prev.next = p1.next;
            p1.next = null;
        }

        return head;
    }

    static ListNode detectCycle(ListNode head){

        if (head == null || head.next != null) return head;

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                slow = head;
                while(slow != fast){ // to detect where cycle begins
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    private int getLength(ListNode head){
        ListNode current = head;
        int count = 0;
        while (current != null){
            current = current.next;
            count++;
        }
        return count;
    }

    static ListNode mergeTwoSorted(ListNode head1, ListNode head2){

        ListNode dummyNode = new ListNode();
        ListNode prev = dummyNode;

        while(head1 != null && head2 != null){
            if (head1.val <= head2.val){
                prev.next = head1;
                head1 = head1.next;
            }else{
                prev.next = head2;
                head2 = head2.next;
            }
            prev = prev.next;
        }
        if (head1 == null) prev.next = head2;
        else prev.next = head1;
        return dummyNode.next;
    }

    static ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode;
        while(current != null){
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    static ListNode reverseBetween(ListNode head, int left, int right){

        if (head == null || head.next == null) return head;

        ListNode dummyNode = new ListNode();
        dummyNode.next = head;

        ListNode prev = dummyNode;
        ListNode current = head;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
            current = current.next;
        }

        ListNode sublistHead = current;

        ListNode prevNode = current;
        ListNode nextNode;
        for (int i = 0; i < right - left; i++) {
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        prev.next = prevNode;
        sublistHead.next = current;

        return dummyNode.next;
    }



}
