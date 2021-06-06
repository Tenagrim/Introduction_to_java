package ex02;

public class UsersArrayList implements UsersList {
    private User [] content;

    private int len;
    private int cap;

    public  UsersArrayList()
    {
        len = 0;
        cap = 10;
        content = new User[cap];
    }

    private void double_cap()
    {
        User [] new_cont = new User[cap * 2];
        for (int i = 0; i < cap; i++) {
            new_cont[i] = content[i];
        }
        cap = cap * 2;
        content = new_cont;
    }

    @Override
    public boolean add(User u) {
        if(len >= cap)
            double_cap();
        content[len] = u;
        len++;
        return true;
    }

    @Override
    public User get(int index) {
        if (index < 0 || index >= len)
            throw new IndexOutOfBoundsException();
        return content[index];
    }

    @Override
    public User get_by_id(int id){
        for (int i = 0; i < len; i++) {
            if (content[i].getIdentifier() == id)
                return content[i];
        }
        throw new UserNotFoundException();
    }

    @Override
    public int size() {
        return len;
    }

    @Override
    public boolean empty() {
        return len == 0;
    }
}
