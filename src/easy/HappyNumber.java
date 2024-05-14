package easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    static boolean isHappy(int number){

        Set<Integer> set = new HashSet<>();
        while(number != 0){
            if (number == 1) return true;
            number = squareOfDigits(number);
            if (set.contains(number)) return false;
            set.add(number);
        }
        return false;

    }

    static int squareOfDigits(int number){

        int answer = 0;

        while(number != 0){
            int temp = number;
            int digit = temp % 10;
            answer += Math.pow(digit, 2);
            number /= 10;
        }

        return answer;
    }

}
