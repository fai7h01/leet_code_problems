package medium;


import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }


    public static String reverseWords(String s){

        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();

    }

}
