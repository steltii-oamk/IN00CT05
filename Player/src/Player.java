public class Player {
    private String name;
    private int points;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return this.points;
    }

    public void addPoints(int points){
        if (points >= 0) {        
            this.points += points;
        }
    }

    public String getInfo(){
        return "Player " + this.name + " has " + this.points + " points.";
    }
}
