package test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {

        String str = "the    sky is blue";
        System.out.println(reverseWords(str));

    }

    public static String reverseWords(String str){

        String[] array = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]).append(" ");
        }
        return result.toString().trim();
    }

}
