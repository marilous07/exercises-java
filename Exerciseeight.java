//

import java.util.Scanner;


public class Exerciseeight {
    static int breadth;
    static int height;

    // Static initialization block
    static {
        Scanner in = new Scanner(System.in);
        breadth = in.nextInt();
        height = in.nextInt();
        in.close();
    }

    public static void main(String[] args) {
        if (breadth > 0 && height > 0) {
            System.out.println(breadth * height);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        
    }
}
