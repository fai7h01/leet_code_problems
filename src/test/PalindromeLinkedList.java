package test;

import easy.ListNode;
import linkedList.MySinglyLinkedList;

public class PalindromeLinkedList {
    public static void main(String[] args) {

        MySinglyLinkedList list = new MySinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(100);



        System.out.println(isPalindrome(list.head));
    }

    public static boolean isPalindrome(ListNode head){

        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reversedHalf = reverse(slow.next);
        while(reversedHalf != null){
            if (head.val != reversedHalf.val) return false;
            head = head.next;
            reversedHalf = reversedHalf.next;
        }
        return true;


    }

    static ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode current = head;
        while(current!=null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;

    }

}
