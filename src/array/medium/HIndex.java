package array.medium;

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {

        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(hIndex(citations));

    }


    static int hIndex(int[] citations) {

        int[] frequency = new int[1001];
        int max = Integer.MIN_VALUE;

        for (int each : citations) {
            frequency[each]++;
            max = Math.max(each,max);
        }

        int countCitations = 0;
        int i = max;
        for (; i >= 0; i--){
            countCitations+=frequency[i];
            if (countCitations >= i) break;
        }
        return i;

    }

}
