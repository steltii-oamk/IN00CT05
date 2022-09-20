public class HahmoMain {

    public static void main(String[] args){
        Hahmo hahmo1 = new Hahmo("Pete", 1.1, 21);

        //System.out.println(hahmo1.LaskeOlomuoto());

        System.out.println(hahmo1.KerroOlomuoto());

        Hahmo hahmo2 = new Hahmo();

        hahmo2.setNimi("Sirkku");
        hahmo2.setPituus(1.5);
        hahmo2.setPaino(30);

        //System.out.println(hahmo2.LaskeOlomuoto());
        
        System.out.println(hahmo2.KerroOlomuoto());
    
    }
}
