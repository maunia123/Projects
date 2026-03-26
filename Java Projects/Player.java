public class Player {
    private String name;
    private int position;
    private int score;

    public Player() {
        this.name = "";
        this.position = 0;
        this.score = 0;
    }

    public Player(String name, int position, int score) {
        this.name = name;
    }

    public String getPlayerName() {
        return name;   
    }

    public int getPlayerPosition() {
        return position;
    }

    public int getPlayerScore() {
        return score;
    }

    public void setPlayerName(String name) {
        this.name = name;
    }

    public void setPlayerPosition(int position) {
        this.position = position;
    }

    public void setPlayerScore(int score) {
        this.score = score;
    }

    public String toString() {
        return "Player Name: " + name + ", Position: " + position + ", Score: " + score;
    }
}
