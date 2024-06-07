package medium;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {

        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));

    }

    static List<List<String>> groupAnagrams(String[] strs){

        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = Arrays.stream(strs)
                .collect(Collectors.groupingBy(
                        str -> {
                            char[] charArray = str.toCharArray();
                            Arrays.sort(charArray);
                            return new String(charArray);
                        }
                ));

        System.out.println(map);

        return new ArrayList<>(map.values());
    }
}
