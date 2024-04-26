package easy;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine){

        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabetCounter = new int[26];

        for (char c : magazine.toCharArray()) {
            alphabetCounter[c-'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (alphabetCounter[c-'a'] == 0) return false;
            alphabetCounter[c-'a']--;
        }
        return true;
    }

}
//Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//Each letter in magazine can only be used once in ransomNote.