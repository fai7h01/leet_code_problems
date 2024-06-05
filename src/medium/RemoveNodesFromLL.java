package medium;

import easy.ListNode;
import linkedList.MySinglyLinkedList;

import java.util.Stack;

public class RemoveNodesFromLL {
    public static void main(String[] args) {

        ListNode head = new ListNode(5);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(13);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(8);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        MySinglyLinkedList list = new MySinglyLinkedList();
        list.addNode(head);

        list.print();
        removeNodes(head);
        list.print();


    }


    public static ListNode removeNodes(ListNode head){

       if (head == null) return null;

       Stack<ListNode> stack = new Stack<>();
       ListNode current = head;
       while(current != null){
           while(!stack.isEmpty() && stack.peek().val < current.val){
               stack.pop();
           }
           stack.push(current);
           current = current.next;
       }

       ListNode next = null;
       while(!stack.empty()){
           current = stack.pop();
           current.next = next;
           next = current;
       }
       return current;

    }

}
