
public class Player {

    private int PlayerId;
    private String name;
    private int ageId;
    private double score;


    public static void main(String[] args) {

    }

    public Player(int PlayerId, String name, int ageId, double score) {
        this.PlayerId = PlayerId;
        this.name = name;
        this.ageId = ageId;
        this.score = score;
    }

    public void setPlayerId(int PlayerId) {
        this.PlayerId = PlayerId;
    }

    public int getPlayerId() {
        return PlayerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAgeId(int ageId) {
        this.ageId = ageId;
    }

    public int getAgeId() {
        return ageId;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void updateScore(double score) {
        this.score = score;
    }

    public void displayPlayerDetails() {
        System.out.println("Player ID: " + PlayerId + ", Name: " + name + ", Age: " + ageId + ", Score: " + score);
    }

}





