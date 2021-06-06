package ex03;

public interface TransactionsList {
    boolean             add(Transaction u);
    Transaction         get(int index);
    Transaction         get_by_id(String uid);
    void                remove_by_id(String uid);
    int                 size();
    boolean             empty();
    Transaction[]       toArray();

}
