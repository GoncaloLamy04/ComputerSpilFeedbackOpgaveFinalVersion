
package Feedback_Opgave_Computerspil;

public class Main {
    public static void main(String[] args) {
        GameSystem system = new GameSystem(5, 5);

        system.addPlayer(new Player(1, "Lewis", 21, 104.5));
        system.addPlayer(new Player(2, "Stephen", 45, 435.8));
        system.addPlayer(new Player(3, "John Finals", 23, 340.3));

        system.addGame(new Game(1, "F1 2025", "Racing", 549.99));
        system.addGame(new Game(2, "Star Citizen", "Space Sim", 649.99));
        system.addGame(new Game(3, "The Finals", "FPS", 0));

        System.out.println();
        system.displayAllGames();
        system.displayAllPlayers();

        System.out.println();

        system.updatePlayerScore(1, 567);
        // Find den højeste score
        system.findTopScoringPlayer();

        // Totalindtægt
        System.out.println("Total revenue: " + system.calculateTotalRevenue() + " DKK");

        System.out.println();
        System.out.println("-! TRY/CATCH TEST !-");
        // Læste om hvordan man gjorde dette for at teste fejl beskeder i programmet
        try {
            system.addGame(new Game(4, "Glitch Game", "RPG", -200));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            system.addPlayer(new Player(4, "Baby", -2, 500));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
