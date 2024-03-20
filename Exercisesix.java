//Given an input integer, you must determine which primitive data types are capable of properly storing that input.
import java.util.Scanner;

public class Exercisesix {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
            try {
                int T = Integer.parseInt(in.nextLine());
                System.out.println(T);
            } catch (Exception e) {
                    System.out.println("User input was not a number.");
            }
            

        in.close();
    }
}