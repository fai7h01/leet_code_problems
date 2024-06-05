package linkedList;

import easy.ListNode;

public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {

        ListNode head = new ListNode(20);
        ListNode node2 = new ListNode(10);
        ListNode node3 = new ListNode(40);
        ListNode node4 = new ListNode(30);
        ListNode node5 = new ListNode(50);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        MySinglyLinkedList list = new MySinglyLinkedList();
        list.addNode(head);

        list.print();

        removeNthNodeFromLast(head, 3);

        list.print();



    }


    public static ListNode removeNthNodeFromLast(ListNode head, int n){

        ListNode p1 = head;
        ListNode p2 = head;
        ListNode prev = null, tail = null;

        for (int i = 0; i < n - 1 ; i++) {
            p2 = p2.next;
        }

        while(p2.next != null){
            prev = p1;
            p1 = p1.next;
            p2 = p2.next;
        }
        tail = p2;
        if (p1 == head){
            head = p1.next;
            p1.next = null;
        }else if (p1 == tail){
            tail = prev;
            prev.next = null;
        }else{
            prev.next = p1.next;
            p1.next = null;
        }
        return head;
    }

}
