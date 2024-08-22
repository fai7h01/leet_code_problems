package interview_prep;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] words = {"fly", "flight", "fight"};

    }

    public static String longestCommonPrefix(String[] words){
        Arrays.sort(words);
        String s1 = words[0];
        String s2 = words[words.length - 1];
        int index = 0;
        while(index < s1.length() && index < s2.length()){
            if(s1.charAt(index) == s2.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        return s1.substring(0, index);
    }


}
