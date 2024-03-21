//Given an input integer, you must determine which primitive data types are capable of properly storing that input.
import java.util.Scanner;

public class Exercisesix {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String a = "byte, short, int and long.";
        String b = "short, int and long.";
        String c = "int and long.";
        String d = "long.";

        int numInputs = in.nextInt();
        in.nextLine();

        for (int i = 0; i<numInputs; i++){
        String input = in.nextLine();
            try {
                long T = Long.parseLong(input);
                
                if (T>=Byte.MIN_VALUE && T<=Byte.MAX_VALUE){
                    System.out.println("The "+T+" can be fitted in "+a);
                }
                else if(T>=Short.MIN_VALUE && T<=Short.MAX_VALUE){
                    System.out.println("The "+T+" can be fitted in "+b);
                }
                else if(T>=Integer.MIN_VALUE && T<=Integer.MAX_VALUE){
                    System.out.println("The "+T+" can be fitted in "+c);
                }
                else if(T<=Long.MAX_VALUE){
                    System.out.println("The "+T+" can be fitted in "+d);
                }
                

            } catch (NumberFormatException e) {
                if (input.length() > Long.toString(Long.MAX_VALUE).length()) {
                System.out.println("T can't be fitted anywhere.");
            } else {
                System.out.println("User input was not a valid number.");
            }
            }
        }

        in.close();
    }
}