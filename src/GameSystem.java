import java.util.ArrayList;

public class GameSystem {

    private Game[] games;
    private Player[] players;
    private int gameCount;
    private int playerCount;

    public static void main(String[] args) {

    }

    public GameSystem(int maxGames, int maxPlayers) {
        games = new Game[maxGames];
        players = new Player[maxPlayers];
        gameCount = 0;
        playerCount = 0;
    }

    public void addGame(Game game) {
        if (gameCount < games.length) {
            games[gameCount++] = game;
        } else {
            System.out.println("The game list is full");
        }

    }

    public void addPlayer(Player player) {
        if (playerCount < players.length) {
            players[playerCount++] = player;
            System.out.println("Player has been added: " + player.getName());
        } else {
            System.out.println("The player list is full");
        }
    }

    public void displayAllGames() {
        System.out.println("\n--- All Games ---");
        for (int i = 0; i < gameCount; i++) {
            games[i].displayDetails();
        }
    }

    public void displayAllPlayers() {
        System.out.println("\n--- All Players ---");
        for (int i = 0; i < playerCount; i++) {
            players[i].displayPlayerDetails();
        }
    }

    public void updatePlayerScore(int playerId, double newScore) {
        Player player = findPlayerById(playerId);
        if (player != null) {
            player.updateScore(newScore);
            System.out.println("Score updated for player: " + player.getName());
        } else {
            System.out.println("Player with ID " + playerId + " not found.");
        }
    }
    public Game findGameById(int gameId) {
        for (int i = 0; i < gameCount; i++) {
            if (games[i].getGameId() == gameId) {
                return games[i];
            }
        }
        return null;
    }

    public Player findPlayerById(int playerId) {
        for (int i = 0; i < playerCount; i++) {
            if (players[i].getPlayerId() == playerId) {
                return players[i];
            }
        }
        return null;
    }

    public double calculateTotalRevenue() {
        double totalRevenue = 0;
        for (int i = 0; i < gameCount; i++) {
            totalRevenue += games[i].getPrice();
        }
        return totalRevenue;
    }

    public Player findTopScoringPlayer() {
        if (playerCount == 0) return null;{

        }
            Player highest  = players[0];
            for (int i = 1; i < playerCount; i++) {
                if (players[i].getScore() > highest .getScore()) {
                    highest = players[i];
                }
            }
        return highest;
    }
}


