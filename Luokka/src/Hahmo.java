public class Hahmo {
    private String nimi;
    private double pituus;
    private double paino;

    public Hahmo(){
        this("",0,0);
    }

    public Hahmo(String nimi, double pituus, double paino){
        this.nimi = nimi;
        this.pituus = pituus;
        this.paino = paino;

    }

    public double LaskeOlomuoto(){
        return this.paino/(this.pituus*this.pituus);
    }

    public String KerroOlomuoto(){
        double x = LaskeOlomuoto();
        if (x >= 15.5 && x <= 25) {
            return "Olet normaalipainoinen!" ;
        }else if(x > 25 && x <= 30){
            return "Elinvoimainen yksilö!";
        }else if(x > 30 && x <= 35){
            return "Taitavat lihakset painaa!";
        }else{
            return "Jotain pielessä!";
        }   
    }






    public String getNimi() {
        return this.nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getPituus() {
        return this.pituus;
    }

    public void setPituus(double pituus) {
        this.pituus = pituus;
    }

    public double getPaino() {
        return this.paino;
    }

    public void setPaino(double paino) {
        this.paino = paino;
    }

}

