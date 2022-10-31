public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");




        public char kirjain(String nimi, int indeksi){
    
            //Muokkaa tähän koodiin virheenhallinta
        
            
            try{
                return nimi.charAt(indeksi); 
            }catch(NullPointerException e){
                System.out.println("+");
            }catch(IndexOutOfBoundsException e){
                System.out.println("-");
            }
            
        }






    }
}
