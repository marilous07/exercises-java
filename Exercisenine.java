//This Java program reads an integer n, converts it to a string s, and then checks if the string s matches the string representation of the integer n. If they match, it prints "Good job"; otherwise, it prints "Wrong answer"

import java.util.Scanner;

public class Exercisenine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = Integer.toString(n);

        
        if (s.equals(Integer.toString(n))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        in.close();
        }
}
