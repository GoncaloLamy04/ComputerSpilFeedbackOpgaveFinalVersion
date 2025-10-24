package Feedback_Opgave_Computerspil;

// Klasse der beskriver et spil i systemet
public class Game {
    private int gameId;
    private String title;
    private String genre;
    private double price;

    // Opretter spil med info, bruger setPrice for at undgå negativ pris
    public Game(int gameId, String title, String genre, double price) {
        this.gameId = gameId;
        this.title = title;
        this.genre = genre;
        setPrice(price);
    }

    // getter/setter metoder
    public int getGameId() {return gameId;}

    public void setGameId(int gameId) {this.gameId = gameId;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getGenre() {return genre;}

    public void setGenre(String genre) {this.genre = genre;}

    public double getPrice() {return price;}

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }

    // printer alle detaljer om spillet
    public void displayDetails() {
        System.out.println("Game Id: " + gameId);
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
    }

    // nemt print i én linje (bruges fx i GameSystem)
    @Override
    public String toString() {
        return "Game ID: " + gameId + " | Title: " + title + " | Genre: " + genre + " | Price: " + price + " DKK";
    }
}




