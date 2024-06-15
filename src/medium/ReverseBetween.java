package medium;

import easy.ListNode;
import linkedList.MySinglyLinkedList;

public class ReverseBetween {
    public static void main(String[] args) {

        MySinglyLinkedList list = new MySinglyLinkedList();
        list.add(10); //1
        list.add(20); //2 x
        list.add(30); //3
        list.add(40); //4
        list.add(50); //5 x
        list.add(100); //6
        list.print();

       System.out.println(reverseBetween(list.head, 2, 5).val);

    }


    public static ListNode reverseBetween(ListNode head, int left, int right){

        if (head == null & head.next == null) return head;

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode current = head;
        ListNode prev = dummyNode;

        for (int i = 1; i < left; i++) {
            current = current.next;
            prev = prev.next;
        }
        System.out.println("after 1st for loop:");
        System.out.println("current: " + current.val);
        System.out.println("prev:" + (prev == null? prev : prev.val));

        System.out.println("----------------");
        ListNode subListHead = current;
        System.out.println("sublistHead: " + subListHead.val);
        ListNode prevNode = null;
        System.out.println("prevNode: " + (prevNode == null? prevNode : prevNode.val));

        System.out.println("loop start");
        for (int i = 1; i <= right - left + 1; i++) {
            ListNode nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        prev.next = prevNode;
        subListHead.next = current;
        System.out.println("loop end");
        System.out.println("current: " + current.val);
        System.out.println("prevNode: " + prevNode.val);
        System.out.println("prev : " + prev.val);
        return dummyNode.next;


    }

    public static ListNode reverseBetweenTest(ListNode head, int left, int right){

        if (head == null || head.next == null) return head;

        ListNode dummyNode = new ListNode();
        dummyNode.next = head;

        ListNode current = head;
        ListNode prev = dummyNode;

        for (int i = 1; i < left; i++) {
            current = current.next;
            prev = prev.next;
        }

        ListNode sublistHead = current;
        ListNode prevNode = null;

        for (int i = 1; i < right - left + 1; i++) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        prev.next = prevNode;
        sublistHead.next = current;
        return dummyNode.next;

    }

}
