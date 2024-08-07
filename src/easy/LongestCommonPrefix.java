package easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"aaa","aa","aaa"}));

    }

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int index = 0;

        while(index < s1.length() && index < s2.length()){
            if (s1.charAt(index) == s2.charAt(index)){
                index++;
            }else{
                break;
            }
        }

        return s1.substring(0, index);
    }

}
