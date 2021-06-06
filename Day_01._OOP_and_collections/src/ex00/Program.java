package ex00;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        User u1 = new User("Mike", 1);
        User u2 = new User("John", 2);

        Transaction t1 = new Transaction(u2, u1, 500, Transfer_category.CREDIT, UUID.randomUUID().toString());
        Transaction t2 = new Transaction(u1, u2, 500, Transfer_category.DEBIT, UUID.randomUUID().toString());

        System.out.println(u1);
        System.out.println(u2);
        System.out.println("================");
        System.out.println(t1);
        System.out.println(t2);

    }
}
