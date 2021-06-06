package ex00;

public class User {

    private int     identifier;
    private String  name;
    private double  balance;

    private User(){}

    public User(String name, int identifier) {
        this.identifier = identifier;
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
