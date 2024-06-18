package easy;

public class DeleteNNodesAfterMNodes {

    public ListNode skipNNodesAfterMNodes(ListNode head, int m, int n){

        ListNode dummyNode = new ListNode();
        ListNode current = head;

        while (current != null){

            for (int i = 0; i < m && current != null; i++) {
                dummyNode.next = current;
                dummyNode = current;
                current = current.next;
            }
            if (current == null) return head;

            for (int i = 0; i < n && current != null; i++) {
                dummyNode.next = current;
                current = current.next;
            }

        }
        return head;

    }

}
