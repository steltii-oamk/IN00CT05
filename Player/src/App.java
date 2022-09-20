public class App {
    public static void main(String[] args) throws Exception {

    Player player1 = new Player();
    Player player2 = new Player();
    Player player3 = new Player();
    
    player1.setName("Matti");

    player1.addPoints(10);
    player1.addPoints(20);
    player1.addPoints(30);

    System.out.println(player1.getInfo());
  
    player1.setName("Jorma");

    System.out.println(player1.getInfo());




    // player1.name = "Matti";
    // player1.points = 15;

    // player2.name = "Jukka";
    // player2.points = 34;
    
    // player3.name = player2.name;
    // player3.points = player2.points;
    
    // System.out.println("Nimi: " + player1.name + "   Pisteet: " + player1.points);
    // System.out.println("Nimi: " + player2.name + "   Pisteet: " + player2.points);
    // System.out.println("Nimi: " + player3.name + "   Pisteet: " + player3.points);
    
    // player1.addPoints(50);

    }
}
