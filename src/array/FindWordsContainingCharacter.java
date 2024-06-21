package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {

        String[] words = {"leet","code"};
        char x = 'e';

        System.out.println(findWordsContaining(words,x));
        System.out.println(findWordsContaining2(words,x));

    }

    static List<Integer> findWordsContaining(String[] words, char x){

        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))){
                indices.add(i);
            }
        }

        return indices;

    }

    static List<Integer> findWordsContaining2(String[] words, char x){

        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1){
                indices.add(i);
            }
        }
        return indices;
    }

}
