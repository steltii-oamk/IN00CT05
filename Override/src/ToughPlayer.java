public class ToughPlayer extends Player{
    
    public ToughPlayer(String name, int energy){
        super(name, energy);
    }
    
    @Override
    public void takeHit(){
        this.energy -= 1;
    }
}
