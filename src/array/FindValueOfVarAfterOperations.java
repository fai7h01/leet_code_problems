package array;

public class FindValueOfVarAfterOperations {

    public static void main(String[] args) {

        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }


    static int finalValueAfterOperations(String[] operations) {

        int x = 0;

        for (String operation : operations) {
            if (operation.charAt(1) == '+'){
                x++;
            } else if (operation.charAt(1) == '-') {
                x--;
            }
        }
        return x;
    }

}
