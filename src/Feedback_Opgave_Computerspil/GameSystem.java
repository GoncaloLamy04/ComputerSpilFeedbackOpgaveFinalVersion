package Feedback_Opgave_Computerspil;

public class GameSystem {

    private Game[] games;
    private Player[] players;
    private int gameCount;
    private int playerCount;

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
        } else {
            System.out.println("The player list is full");
        }
    }

    public void displayAllGames() {
        System.out.println("--- All Games ---");
        for (int i = 0; i < gameCount; i++) {
            System.out.println(games[i]);
        }
    }

    public void displayAllPlayers() {
        System.out.println("\n--- All Players ---");
        for (int i = 0; i < playerCount; i++) {
            System.out.println(players[i]);
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

    // Lineær søgning efter spil via id
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
        if (playerCount == 0) {
            System.out.println("No users found in system yet.");
            return null;
        }

        Player top = players[0];
        for (int i = 1; i < playerCount; i++) {
            if (players[i].getScore() > top.getScore()) {
                top = players[i];
            }
        }

        System.out.println("Topscorer: " + top.getName() + " (" + top.getScore() + " point)");
        return top;
    }
}
