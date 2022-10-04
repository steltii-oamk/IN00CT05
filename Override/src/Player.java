public class Player {
    protected String name;
    protected int energy;

    public Player(String name, int energy){
        this.name = name;
        this.energy = energy;
    }

    public void takeHit(){
        this.energy -= 2;
    }

    @Override
    public String toString() {
        return "Player name: " + this.name +  " energy: " +this.energy;
    }
}
