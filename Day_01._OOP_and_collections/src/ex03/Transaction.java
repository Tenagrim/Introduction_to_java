package ex03;

enum Transfer_category
{
    DEBIT,
    CREDIT
}

public class Transaction {
    private String              identifier;
    private User                recipient;
    private User                sender;
    private long                amount;
    private Transfer_category category;

    private Transaction(){}

    public String getIdentifier() {
        return identifier;
    }

    public User getRecipient() {
        return recipient;
    }

    public User getSender() {
        return sender;
    }

    public long getAmount() {
        return amount;
    }

    public Transfer_category getCategory() {
        return category;
    }

    public Transaction(User sender, User recipient, long amount, Transfer_category category, String identifier) {
        this.identifier = identifier;
        this.recipient = recipient;
        this.sender = sender;
        this.amount = (amount < 0) ? - amount : amount;
        this.category = category;
    }

    @Override
    public String toString() {
        return sender.getName() +
                " -> " +
                recipient.getName() +
                ", " +
                (category == Transfer_category.CREDIT ? "+" : "-") +
                amount +
                ", " +
                (category == Transfer_category.CREDIT ? "INCOME, " : "OUTCOME, ") +
                identifier;
    }
}
