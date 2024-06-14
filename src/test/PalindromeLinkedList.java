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

        ListNode slow = head;
        ListNode fast = head;
        System.out.println("slow pointer: " + slow.val);
        System.out.println("fast pointer: " + fast.val);
        System.out.println("-------------------------------");
        while(fast.next != null){
            slow = slow.next;
            System.out.println("slow pointer: " + slow.val);
            fast = fast.next.next;
            System.out.println("fast pointer: " + fast.val);
            System.out.println("-------------------------------");
        }
        return false;



    }

    static ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;

    }

}
