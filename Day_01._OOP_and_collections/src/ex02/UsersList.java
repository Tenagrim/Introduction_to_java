package ex02;

public interface UsersList {
    boolean     add(User u);
    User        get(int index);
    User        get_by_id(int id);
    int         size();
    boolean     empty();
}
