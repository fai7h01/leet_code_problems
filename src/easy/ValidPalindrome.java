package easy;

public class ValidPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

    }


    public static boolean isPalindrome(String s){

        if (s.isEmpty()) return true;

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int end = s.length() - 1;

        System.out.println(s);

        while(start <= end){
            if (s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }



}

