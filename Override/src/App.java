public class App {
    public static void main(String[] args) throws Exception {
        
        Player sp = new SoftPlayer("Jorma", 100);
        Player tp = new ToughPlayer("Pekka", 100);

        tp.takeHit();
        tp.takeHit();
        tp.takeHit();
        tp.takeHit();
        tp.takeHit();

        System.out.println(tp);




    }
}
