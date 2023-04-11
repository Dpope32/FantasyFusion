import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Roster {
    private List<Player> players;

    public Roster() {
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }

    public void printRoster() {
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
