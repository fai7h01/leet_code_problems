package linkedList;

import easy.ListNode;

public class MergeTwoSortedList {

    public ListNode merge(ListNode list1, ListNode list2){

        ListNode dummyNode = new ListNode();
        ListNode prev = dummyNode;

        while(list1 != null && list2 != null){
            if (list1.val <= list2.val){
                prev.next = list1;
                list1 = list1.next;
            }else{
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        if (list1 == null){
            prev.next = list2;
        }else{
            prev.next = list1;
        }
        return dummyNode.next;

    }

}
