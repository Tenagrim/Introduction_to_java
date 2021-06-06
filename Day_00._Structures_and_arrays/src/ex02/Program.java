package ex02;

import java.util.Scanner;

public class Program {

    public static int sum_digis(int n)
    {
        int res = 0;
        while (n > 0)
        {
            res += n % 10;
            n /= 10;
        }
        return res;
    }


    public static double sqrt(double number)
    {
        double root = number / 3.0;
        while (root * root - number > 0.1) {
            root = (root + number / root) / 2.0;
        }
        return root;
    }

    public static boolean is_prime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int query;
        int coffe = 0;

        do {
            if (!s.hasNextInt())
                break;
            query = s.nextInt();
            if (is_prime(sum_digis(query)))
                coffe++;
        } while (query != 42);
        System.out.println("Count of coffee-request – " + coffe);
    }
}
