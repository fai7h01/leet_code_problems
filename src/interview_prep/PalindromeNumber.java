package interview_prep;

public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(isPalindrome(11));

    }


    public static boolean isPalindrome(int num){

       if (num < 0) return false;

       int reversed = 0;
       int temp = num;

       while (temp != 0){
           int digit = temp % 10;
           reversed = reversed * 10 + digit;
           temp /= 10;
       }
       return reversed == num;

    }
}
