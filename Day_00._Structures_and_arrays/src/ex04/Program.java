package ex04;

import java.util.Scanner;



public class Program {


    public static int cnt_digis(int n)
    {
        int res = 0;
        while (n > 0)
        {
            res ++;
            n /= 10;
        }
        return res;
    }

    public static int insert(char[]arr, int pos, char c)
    {
        if (pos == arr.length)
            return arr.length-1;
        char tmp = arr[pos];
        arr[pos] = c;
        if (tmp == 0)
            return pos;
       return insert(arr, pos + 1, tmp);
    }

    public static char [] top(int [] table, int size)
    {
        char[]res = new char[size];
        int lowest = 0;

        for (int i = 0; i < table.length ; i++) {
            if (table[i] != 0 && table[i] >= lowest)
            {
                for (int j = 0; j < res.length; j++) {
                    if(res[j] == 0 || table[i] > table[res[j]]) {
                        insert(res, j, (char) i);
                        lowest = table[res[size-1]];
//                        System.out.println(lowest + " | " + (char)i);
                        break;
                    }
                }
            }
        }
        return res;
    }

    public static String n_chars(char c, int n)
    {
        if (n == 1)
            return ("" + c);
        else return c + n_chars(c, n - 1);
    }

    public static int floor(double n)
    {
        if (n == 0)
            return 0;
        if (n < 1)
            return 1;
        return ((int)n);
    }

    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        int [] tableFreq = new int[65536];
        char [] top;

        str = s.next();
        for (int i = 0; i < str.length(); i++)
          tableFreq[str.charAt(i)] += 1;
        top = top(tableFreq, 10);

        int max = 0, min = 999;
        for (int i = 0; i <top.length && top[i] != 0; i++) {
            if(tableFreq[top[i]] < min)
                min = tableFreq[top[i]];
            if(tableFreq[top[i]] > max)
                max = tableFreq[top[i]];
        }

        double step;
        int f, f_step;
        for (int i = top.length; i >= 0 ; i--) {
            for (int j = 0;  j < top.length && top[j]!= 0; j++) {
                f = tableFreq[top[j]];
                step = (((f - min) * 10.0) / (max - min));
                f_step = floor(step);
                if(f_step < i)
                    break;
                else if(f_step > i)
                    System.out.print("   #" );
                else
                    System.out.print(n_chars(' ', 4 - cnt_digis(f)) + f);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < top.length && top[i]!= 0; i++)
            System.out.print("   " + top[i]);
        System.out.println("");

    }
}
