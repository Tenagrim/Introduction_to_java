package ex00;

public class Program {

    public static void main(String[] args) {

        int n = 479598;
        int res = (n % 10) +
                (n / 10 % 10) +
                (n / 100 % 10) +
                (n / 1000 % 10) +
                (n / 10000 % 10) +
                (n / 100000 % 10) +
                (n / 1000000 % 10) +
                (n / 10000000 % 10) +
                (n / 100000000 % 10) +
                (n / 1000000000 % 10);
                System.out.println(res);
    }
}
