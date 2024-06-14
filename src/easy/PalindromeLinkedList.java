package easy;

public class PalindromeLinkedList {
    public static void main(String[] args) {

    }


    public static boolean isPalindrome(ListNode head){

        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reverse = reverse(slow.next);
        while(reverse != null){
            if (head.val != reverse.val) return false;
            head = head.next;
            reverse = reverse.next;
        }
        return true;


    }


    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;

    }

}
