package easy;

public class ConvertBinaryNumberInLL {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        System.out.println(getDecimalValue(n1));
    }

    public static int getDecimalValue(ListNode head){

        int decimal = 0;
        int power = 0;
        ListNode current = reverse(head);
        while (current != null){
            decimal += current.val * Math.pow(2, power);
            current = current.next;
            power++;
        }
        return decimal;

    }


    public static ListNode reverse(ListNode head){
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
