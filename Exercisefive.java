/*
We use the integers a,b and n to create the following series:

 * We have q queries in the form of a,b and n. For each query, print the series corresponding to the given a,b and n values as a single line of n space-separated integers.
 * 
 */

import java.util.Scanner;

public class Exercisefive {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int powerOfTwo = 1; // since 2^0 is 1

            for (int j = 0; j < n; j++) {
                a += powerOfTwo * b;
                System.out.print(a + " ");
                powerOfTwo = powerOfTwo << 1;
            }
            System.out.println();
        }

        in.close();
        
    
}}
