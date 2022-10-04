public class SoftPlayer extends Player{

    public SoftPlayer(String name, int energy){
        super(name, energy);
    }

    @Override
    public void takeHit() {
        super.takeHit();
        super.takeHit();
        System.out.println("I'm such a soft player!");
    }
}
