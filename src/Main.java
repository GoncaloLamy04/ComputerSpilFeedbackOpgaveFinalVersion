
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameSystem system = new GameSystem(5, 5);

        system.addPlayer(new Player(1, "Lewis", 21, 104.5));
        system.addPlayer(new Player(1, "Stephen", 45, 435.8));
        system.addPlayer(new Player(1, "Lebron", 23, 340.3));

        system.addGame(new Game(1, "F1 2025", "Racing", 549.99));
        system.addGame(new Game(2, "EA FC 26", "Sports Sim", 649.99));
        system.addGame(new Game(3, "Football Manager 26", "Strategy", 749.99));


        Game game = system.findGameById(9);
        if (game != null) {
            game.displayDetails();
        } else {
            System.out.println("Game not found.");
        }

        system.displayAllGames();
        system.displayAllPlayers();


        System.out.println();
        system.updatePlayerScore(1, 567);


        Player highestScoringPlayer = system.findTopScoringPlayer();
        if (highestScoringPlayer != null) {
            System.out.print("Topscorer: ");
            highestScoringPlayer.displayPlayerDetails();
        }

        System.out.println("Total revenue: " + system.calculateTotalRevenue() + " DKK");
    }
}
