package easy;

public class IsSubsequence {

    public static void main(String[] args) {

        System.out.println(isSubsequence("abcp", "dfgafdghbsdrtc"));

    }


    public static boolean isSubsequence(String s, String t){

        int i = 0;
        int k = 0;

        while (i < s.length() && k < t.length()){
            if (s.charAt(i) == t.charAt(k)){
                i++;
            }
            k++;
        }

        return i == s.length();


    }

}
