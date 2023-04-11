import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class League {
    private String name;
    private List<Roster> rosters;

    public League(String name) {
        this.name = name;
        rosters = new ArrayList<>();
    }

    public void addRoster(Roster roster) {
        rosters.add(roster);
    }

    public List<Roster> getRosters() {
        return Collections.unmodifiableList(rosters);
    }

    public String getName() {
        return name;
    }
}
