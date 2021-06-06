package ex03;

public class UserIdsGenerator {
    public static final UserIdsGenerator INSTANCE = new UserIdsGenerator();
    private int maxId;

    private UserIdsGenerator(){
        maxId = 0;
    }

    public int generateId()
    {
        return maxId++;
    }

    public static UserIdsGenerator getInstance() {
        return INSTANCE;
    }
}
