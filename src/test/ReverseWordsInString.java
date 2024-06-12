package test;

public class ReverseWordsInString {
    public static void main(String[] args) {

        String str = "the    sky is blue";
        System.out.println(reverseWords(str));
        System.out.println(reverseWordsWithoutRegex(str));

    }

    public static String reverseWords(String str){

        String[] array = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]).append(" ");
        }
        return result.toString().trim();
    }

    public static String reverseWordsWithoutRegex(String str){
        String[] array = str.trim().split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            if (!array[i].isEmpty()){
                res.append(array[i]).append(" ");
            }
        }
        return res.toString().trim();
    }

}
