package easy;

import java.util.Arrays;

public class LengthOfLastWord {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("Hello World"));

    }

    private static int lengthOfLastWord(String s){

        s = s.trim();

        int index = s.lastIndexOf(" ");

        return s.length() - index - 1;

    }

}
