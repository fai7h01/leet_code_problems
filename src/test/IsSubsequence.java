package test;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubSequence("abc", "agfdbdgfc"));
    }

    private static boolean isSubSequence(String s, String t){

        int j = 0;
        int k = 0;

        while(j < s.length() && k < t.length()){
            if (s.charAt(j) == t.charAt(k)){
                j++;
            }
            k++;
        }
        return j == s.length();

    }

}
