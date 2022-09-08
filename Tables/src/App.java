public class App {
    public static void main(String[] args) throws Exception {

    //Harj1
    int[] table = new int[5];

    table[0] = 1;
    table[1] = 2;
    table[2] = 3;
    table[3] = 4;
    table[4] = 5;

    //Harj2
    
    int[] table2 = {10,20,30};

    int luku2 = 5;

    table2[1] = luku2;

    System.out.println(table2[1]);

    //Harj3

    String[] name = {"Juhani","Matias","Koski"};

    for (int i = 0; i < name.length; i++) {
        System.out.println(name[i]);
    }


    }
}
