package ex03;

import java.util.Scanner;

public class Program {
    public static void exit()
    {
        System.out.println("IllegalArgument");
        System.exit(-1);
    }

    public static void print_n_chars(char c, int n)
    {
        if (n == 0)
            return;
        System.out.print(c);
        print_n_chars(c, n - 1);
    }

    public static long pow(int base, int exp)
    {
        if (exp == 0)
            return  1;
        if (exp == 1)
            return base;
        else
            return pow(base, exp - 1) * base;
    }

    public static long add_digit(long old, int pos, int digit)
    {
        return old + digit * pow(10, pos-1);
    }

    public static long one_week(int num, String res, Scanner s, long mins)
    {

        int min = 9;
        int n, w;
        String str;

        if(!s.hasNext())
            exit();
        str = s.next();
        if(str.equals("42")) {
            System.out.print(res);
            return mins;
        }
        else if (!str.equals("Week"))
            exit();

        w =  s.nextInt();
        num = num == 0 ? w - 1 : num;
        if(w < num + 1 || w < 1 || w > 18)
            exit();

        for (int i = 0; i < 5; i++) {
            if(!s.hasNextInt())
                exit();
            n = s.nextInt();
            if (n <0 || n > 9)
                exit();
            if (n < min)
                min = n;
        }

        mins = add_digit(mins, w, min);

       return one_week(w, res, s, mins);
    }

    public static void print_week(long mins, int pos)
    {
        if(mins == 0)
            return;
        long min = mins % 10;
        if(min != 0)
        {
            System.out.print("Week " + (pos) + (pos <= 9 ? "  " : " "));
            print_n_chars('=', (int)min);
            System.out.print(">\n");
        }
        print_week(mins/10, pos + 1);
    }

    public static void main(String[] args) {

        long mins = one_week(0, "", new Scanner(System.in), 0);

        print_week(mins, 1);
    }
}
