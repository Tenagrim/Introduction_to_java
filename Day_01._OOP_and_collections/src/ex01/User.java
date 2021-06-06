package ex01;

public class User {
    private final int     identifier;
    private String  name;
    private double  balance;

    private User(){identifier = 0;}

    public User(String name) {
        this.identifier = UserIdsGenerator.getInstance().generateId();
        this.name = name;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return name + " ID: " + identifier + " balance: " + balance;
    }
}
