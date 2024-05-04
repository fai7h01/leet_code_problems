package easy;

public class Isomorphic {
    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg", "add"));


    }

    private static boolean isIsomorphic(String s, String t){

        int[] indexS = new int[200];
        int[] indexT = new int[200];

        int len = s.length();

        if (len != t.length()) return false;

        for (int i = 0; i < len; i++) {
            if (indexS[s.charAt(i)] != indexT[t.charAt(i)]){
                return false;
            }

            indexS[s.charAt(i)] = i + 1;
            indexT[t.charAt(i)] = i + 1;
        }

        return true;
    }


}
