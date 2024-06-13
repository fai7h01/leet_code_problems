package test;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));


    }

    static int climbStairs(int n){
        Map<Integer,Integer> memo = new HashMap<>();
        return climbStairs(n,memo);
    }

    static int climbStairs(int n, Map<Integer,Integer> memo){

        if (n == 0 || n == 1) return 1;
        if (!memo.containsKey(n)){
            memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));
        }
        return memo.get(n);
    }

}

