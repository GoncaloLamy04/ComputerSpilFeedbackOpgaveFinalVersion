package Feedback_Opgave_Computerspil;

// Klasse der beskriver en spiller i systemet
public class Player {
    private int PlayerId;
    private String name;
    private int age;
    private double score;

    // Opretter spiller med basic info, bruger setAge og setScore for at undgå negative værdier
    public Player(int PlayerId, String name, int age, double score) {
        this.PlayerId = PlayerId;
        this.name = name;
        setAge(age);
        setScore(score);
    }

    // getter/setter metoder
    public int getPlayerId() {return PlayerId;}

    public void setPlayerId(int PlayerId) {this.PlayerId = PlayerId;}

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public int getAge() {return age;}

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }

    public double getScore() {return score;}

    public void setScore(double score) {
        if (score < 0) throw new IllegalArgumentException("Score cannot be negative");
        this.score = score;
    }

    // hurtig måde at ændre spillerens score på
    public void updateScore(double score) {this.score = score;}

    // printer alle spillerens data i flere linjer
    public void displayPlayerDetails() {
        System.out.println("Player Id: " + PlayerId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
    }

    // nemt print i én linje (bruges fx i GameSystem)
    @Override
    public String toString() {
        return "Player: " + PlayerId + " | Name: " + name + " | Age: " + age + " | Score: " + score;
    }

}





