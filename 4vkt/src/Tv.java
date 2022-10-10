public class Tv extends Product{
    
    private int size = 0;
    
    public Tv(int price, int size){
        
        super(price);
        this.size = size;
        //Lisää tarvittavat kaksi riviä koodia tähän
        
    }
    
        
    public int getSize(){
        return this.size;
    }

}