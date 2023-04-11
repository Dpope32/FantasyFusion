import java.util.List;
import java.util.ArrayList;

public class FantasyFusion {
    public static void main(String[] args) {
        DataStorage dataStorage = new DataStorage();
        dataStorage.addUser("username");
        User user = dataStorage.getUser("username");

        try {
            addLeaguesToUser(user);
            printRostersAndExposurePercentages(user);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    private static void addLeaguesToUser(User user) throws Exception {
        List<League> leagues = SleeperAPI.getLeagues(user);
        for (League league : leagues) {
            user.addLeague(league);
        }
    }

    private static void printRostersAndExposurePercentages(User user) {
        for (League league : user.getLeagues()) {
            System.out.println("League: " + league.getName());
            for (Roster roster : league.getRosters()) {
                System.out.println("Roster:");
                for (Player player : roster.getPlayers()) {
                    System.out.println(player);

                }
            }
            System.out.println();
        }
    }
}
