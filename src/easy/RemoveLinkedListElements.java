package easy;

public class RemoveLinkedListElements {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(7);
        ListNode node2 = new ListNode(7);
        ListNode node3 = new ListNode(7);
        ListNode node4 = new ListNode(7);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

    }

    // 1 2 6 3 4 5 6

    static ListNode removeElements(ListNode head, int val){

       if (head == null) return null;
       ListNode node = new ListNode(0);
       node.next = head;
       ListNode current = node;

       while (current.next != null){
           if (current.next.val == val){
               current.next = current.next.next;
           }else{
               current = current.next;
           }
       }
       return node.next;
    }


}



class ListNode{

    int val;
    ListNode next;

    public ListNode(){};

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}