package ex01;

import java.util.Scanner;

public class Program {


    public static double sqrt(double number)
    {
        double root = number / 3.0;
        while (root * root - number > 0.1) {
            root = (root + number / root) / 2.0;
        }
        return root;
    }

    public static void main(String[] args) {
        int n = new Scanner( System.in).nextInt();
        boolean res = true;
        int i = 2;

        if (n <= 1)
        {
            System.out.println("Illegal Argument");
            System.exit(-1);
        }

        for (; i <= sqrt(n); i++) {
            if (n % i == 0) {
                res = false;
                break;
            }
        }
        System.out.println(res + " " + (i - 1));
    }
}
