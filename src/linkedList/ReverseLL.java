package linkedList;

import easy.ListNode;

public class ReverseLL {
    public static void main(String[] args) {
        MySinglyLinkedList list = new MySinglyLinkedList();

    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

}
