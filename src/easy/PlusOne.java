package easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));

    }

    private static int[] plusOne(int[] digits){

        String str = Arrays.stream(digits).mapToObj(String::valueOf)
                .reduce("",(s1,s2) -> s1 + s2);

        String plusOne = String.valueOf(new BigInteger(str).add(BigInteger.ONE));

        return Arrays.stream(plusOne.split("")).mapToInt(Integer::parseInt).toArray();



    }

}
