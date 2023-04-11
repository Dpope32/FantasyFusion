import java.util.Map;
import java.util.HashMap;

public class DataStorage {
    private Map<String, User> users;

    public DataStorage() {
        users = new HashMap<>();
    }

    public boolean addUser(String username) {
        if (users.containsKey(username)) {
            return false;
        }

        User user = new User(username);
        users.put(username, user);
        return true;
    }

    public User getUser(String username) {
        return users.get(username);
    }
}
