package easy;

public class RomanToInteger {

    public static void main(String[] args) {


    }


    public int romanToInt(String s){

        int answer = 0;
        int number = 0;
        int prev = 0;

        for (int k = s.length() - 1; k >= 0; k--) {

            switch (s.charAt(k)){
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev){
                answer -= number;
            }else {
                answer += number;
            }
            prev = number;
        }
        return answer;

    }

}
