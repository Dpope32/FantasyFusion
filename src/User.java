import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class User {
    private String username;
    private List<League> leagues;

    public User(String username) {
        this.username = username;
        leagues = new ArrayList<>();
    }

    public void addLeague(League league) {
        leagues.add(league);
    }

    public List<League> getLeagues() {
        return Collections.unmodifiableList(leagues);
    }

    public String getUsername() {
        return username;
    }
}
