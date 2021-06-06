package ex03;

import java.util.UUID;

public class Program {

    public static void main(String[] args) {

        User u1 = new User("Mike");
        User u2 = new User("John");

        Transaction t1 = new Transaction(u2, u1, 500, Transfer_category.CREDIT, UUID.randomUUID().toString());
        Transaction t2 = new Transaction(u1, u2, 500, Transfer_category.DEBIT, UUID.randomUUID().toString());

        TransactionsList list = new TransactionsLinkedList();

        list.add(t2);
        list.add(t1);


        list.add(new Transaction(new User("Sheldon"), new User("Shepard"), 10,Transfer_category.CREDIT, UUID.randomUUID().toString()));
        list.add(new Transaction(new User("Rohn"), new User("Mikey"), 10,Transfer_category.DEBIT, UUID.randomUUID().toString()));
        list.add(new Transaction(new User("Alice"), new User("Bob"), 200,Transfer_category.CREDIT, UUID.randomUUID().toString()));

        System.out.println("=============");
        System.out.println("Size: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove_by_id(list.get(2).getIdentifier());

        Transaction [] arr = list.toArray();
        System.out.println("=============");
        System.out.println("Size: " + arr.length);
        for (Transaction transaction : arr) {
            System.out.println(transaction);
        }

        System.out.println("=============");
        try {
            list.remove_by_id("123");
        }
        catch (RuntimeException e)
        {
            System.out.println(e);
        }
    }




}
