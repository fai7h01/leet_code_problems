package linkedList;

import easy.ListNode;

public class MySinglyLinkedList {

    public ListNode head;
    public ListNode tail;
    public int size;


    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Empty");
            return;
        }
        ListNode current = head;
        while(current != null){
             if (current.next == null){
                 System.out.print(current.val + " => " + null);
             }else{
                 System.out.print(current.val + " => ");
             }
             current = current.next;
        }
        System.out.println();
    }

    public void add(int value){
         ListNode node = new ListNode(value);
         if (isEmpty()){
             head = tail = node;
         }else{
             tail.next = node;
             tail = node;
         }
         size++;
    }

    public void addNode(ListNode node){
        if (isEmpty()){
            head = tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }

}
