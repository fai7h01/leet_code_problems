package readWriteFile;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class CalculateDistance {

    private static final String path = "src/week_33/file.txt";

    public static void main(String[] args) throws IOException {

        System.out.println(calculateDistance());

    }

    public static List<Integer> readCoordinatesFromFile() throws IOException {

        FileReader fileReader = new FileReader(path);
        StreamTokenizer streamTokenizer = new StreamTokenizer(fileReader);
        List<Integer> numbers = new ArrayList<>();

        int token = streamTokenizer.nextToken();
        while(token != StreamTokenizer.TT_EOF){
            if (token == StreamTokenizer.TT_NUMBER){
                numbers.add((int) streamTokenizer.nval);
            }
            token = streamTokenizer.nextToken();
        }

        System.out.println(numbers);
        fileReader.close();
        return numbers;
    }

    public static int calculateDistance() throws IOException {

        List<Integer> coordinates = readCoordinatesFromFile();

        int a = Math.abs(coordinates.get(0)) + Math.abs(coordinates.get(2));
        int b = Math.abs(coordinates.get(1)) + Math.abs(coordinates.get(3));

        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        return (int) c;
    }

}
