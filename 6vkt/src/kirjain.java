public class kirjain {
    

    public char kirjain(String nimi, int indeksi){
    
        //Muokkaa tähän koodiin virheenhallinta
    
        
        try{
            return nimi.charAt(indeksi); 
        }catch(NullPointerException e){
            return "+";
        }catch(IndexOutOfBoundsException e){
            System.out.println("-");
        }
        
    }



}
