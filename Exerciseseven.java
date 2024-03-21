/*read n lines of input until reach EOF, then number and print all n lines of content.*/


import java.util.Scanner;

public class Exerciseseven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lineNumber = 1;

        while (in.hasNext()){
            String line = in.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        in.close();
    }
}
