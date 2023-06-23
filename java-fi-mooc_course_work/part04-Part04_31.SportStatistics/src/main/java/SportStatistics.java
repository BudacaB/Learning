import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<Game> games = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Path.of(file))) {
            while (fileScanner.hasNext()) {
                String row = fileScanner.nextLine();
                String[] parts = row.split(",");
                games.add(new Game(parts[0], 
                        parts[1], 
                        Integer.valueOf(parts[2]), 
                        Integer.valueOf(parts[3]))
                );
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        long gamesCount = games.stream().filter(game -> game.getHomeTeam().equals(team) || game.getAwayTeam().equals(team))
                .count();
        
        System.out.println("Games: " + gamesCount);
        
        int wins = 0;
        int losses = 0;
        for (Game game : games) {
            if (game.getHomeTeam().equals(team)) {
                if (game.getHomePoints() > game.getAwayPoints()) {
                    wins++;
                } else if (game.getHomePoints() < game.getAwayPoints()) {
                    losses++;
                }
            } else if (game.getAwayTeam().equals(team)) {
                if (game.getHomePoints() < game.getAwayPoints()) {
                    wins++;
                } else if (game.getHomePoints() > game.getAwayPoints()) {
                    losses++;
                }
            }
        }
        
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
