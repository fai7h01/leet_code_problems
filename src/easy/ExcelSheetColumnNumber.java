package easy;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {

        System.out.println(columnNumber("AA"));

    }

    private static int columnNumber(String column){
        int count = 0;
        for (int i = 0; i < column.toCharArray().length; i++) {
            count*=26;
            count+=column.charAt(i) - 'A' + 1;
        }
        return count;
    }
}
