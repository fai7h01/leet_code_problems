package easy;

public class RemoveNthElementFromLL {

    public ListNode removeNthElement(ListNode head, int n){

        ListNode p1 = head;
        ListNode p2 = head;
        ListNode prev = null;
        ListNode tail;

        for (int i = 0; i < n - 1; i++) {
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
        } else if (p1 == tail) {
            tail = prev;
            prev.next = null;
        }else{
            prev.next = p1.next;
            p1.next = null;
        }
        return head;

    }

}
