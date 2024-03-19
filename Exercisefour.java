import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Exercisefour {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
    }
}
