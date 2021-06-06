package ex02;


public class Program {

    public static void main(String[] args) {
        User u1 = new User("Mike");
        User u2 = new User("John");
        UsersList list = new UsersArrayList();

        System.out.println("size: "+ list.size());
        list.add(u1);
        list.add(u2);
        System.out.println("size: "+ list.size());

        System.out.println(list.get_by_id(0));
        System.out.println(list.get_by_id(1));

        list.add(new User("AAAAAAAA"));
        list.add(new User("B*BBBBBB_B"));
        list.add(new User("BB*BBBB_BB"));
        list.add(new User("BBBB*B_BBB"));
        list.add(new User("BBBBB_B*BB"));
        list.add(new User("BBBB_BBBB*"));
        list.add(new User("BBB_BBBB*B"));
        list.add(new User("BB_BBBB*BB"));
        list.add(new User("B_BBBB*BBB"));
        list.add(new User("_BBBB*BBBB"));
        list.add(new User("B_BB*BBBBB"));
        list.add(new User("BB*_BBBBBB"));
        list.add(new User("B*BBB_BBBB"));
        list.add(new User("*BBBBBB_BB"));
        list.add(new User("B*BBBBBBB_"));
        list.add(new User("BB*BBBBB_B"));
        list.add(new User("BBBB*BB_BB"));
        list.add(new User("BBBBBB_*BB"));
        list.add(new User("BBBBB_BBB*"));


        System.out.println("==============");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        try {
            System.out.println("==============");
            System.out.println(list.get_by_id(10));
            System.out.println(list.get_by_id(15));
            System.out.println(list.get_by_id(4));
            System.out.println(list.get_by_id(10000));
        }catch (RuntimeException e)
        {
            System.out.println(e);
        }
    }



}
