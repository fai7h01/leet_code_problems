package medium;

import easy.ListNode;

public class RemoveDuplicatesFromSortedList2 {

    public static void main(String[] args) {

    }

    public static ListNode deleteDuplicates(ListNode head){

        if (head == null || head.next == null) return head;

        ListNode dummyNode = new ListNode();
        dummyNode.next = head;

        ListNode currnet = dummyNode;

        while (currnet.next != null && currnet.next.next != null){

            if (currnet.next.val == currnet.next.next.val){
                int duplicate  = currnet.next.val;

                while(currnet.next != null && currnet.next.val == duplicate){
                    currnet.next = currnet.next.next;
                }

            }else{
                currnet = currnet.next;
            }

        }
        return dummyNode.next;


    }


}
