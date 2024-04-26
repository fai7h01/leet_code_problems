package easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaramb"));

    }

    //solution 1:
    public static boolean isAnagram(String s, String t){
        Map<Character,Integer> map = new HashMap<>();

        for (char each : s.toCharArray()) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }

        for (char each : t.toCharArray()) {
            map.put(each, map.getOrDefault(each, 0) -1);
        }

        System.out.println(map);
        for (Integer value : map.values()) {
            if (value != 0){
                return false;
            }
        }

        return true;
    }



    //solution 2:
    public static boolean isAnagram2(String s, String t){
        return getFrequencyMap(s).equals(getFrequencyMap(t));
    }

    public static Map<Character,Integer> getFrequencyMap(String str){
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) +1);
        }

        return map;
    }

}
