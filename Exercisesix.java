//Given an input integer, you must determine which primitive data types are capable of properly storing that input.
import java.util.Scanner;

public class Exercisesix {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String a = "byte, short, int and long.";
        String b = "short, int and long.";
        String c = "int and long.";
        String d = "long.";
            try {
                int T = Integer.parseInt(in.nextLine());
                
                if (T<100){
                    System.out.println("The "+T+" can be fitted in "+a);
                }
                else if (T>=100){
                    System.out.println("The "+T+" can be fitted in "+a);
                }
                else if(T>=10000){
                    System.out.println("The "+T+" can be fitted in "+b);
                }
                else if(T>=100000){
                    System.out.println("The "+T+" can be fitted in "+c);
                }
                else if(T>=1000000){
                    System.out.println("The "+T+" can be fitted in "+d);
                }

            } catch (Exception e) {
                    System.out.println("User input was not a number.");
            }
            

        in.close();
    }
}