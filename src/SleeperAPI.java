import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SleeperAPI {
    private static final String API_BASE_URL = "https://api.sleeper.app/v1";
    private static final HttpClient httpClient = HttpClient.newBuilder().build();

    public static List<League> getLeagues(User user) throws IOException, InterruptedException {
        String endpoint = String.format("%s/user/%s/leagues/nfl/2023", API_BASE_URL, user.getUserId());
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // TODO: Parse the response JSON and create League objects

        List<League> leagues = new ArrayList<>();
        leagues.add(new League("League 1"));
        leagues.add(new League("League 2"));

        return leagues;
    }

    public static List<Player> getPlayers(Roster roster) throws IOException, InterruptedException {
        String endpoint = String.format("%s/league/%s/rosters", API_BASE_URL, roster.getLeagueId());
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // TODO: Parse the response JSON and create Player objects

        List<Player> players = new ArrayList<>();
        players.add(new Player("Player 1", "QB", "Team A", 30, 50));
        players.add(new Player("Player 2", "RB", "Team B", 25, 25));
        players.add(new Player("Player 3", "WR", "Team C", 27, 75));

        return players;
    }
}

