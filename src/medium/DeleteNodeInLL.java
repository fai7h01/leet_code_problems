package medium;

import easy.ListNode;
import linkedList.MySinglyLinkedList;

public class DeleteNodeInLL {

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
        deleteNode(node3);
        list.print();
    }

    public static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
