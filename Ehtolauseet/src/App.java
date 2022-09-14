import java.util.Scanner;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Anna ikäsi:");
        int age = Integer.parseInt(sc.nextLine());

        if(age < 18){
            System.out.println("Olet nuori!");
        }else if(age >= 35 && age <=50){
            System.out.println("Olet keski-ikäinen!");
        }else if(age > 50){
            System.out.println("Olet vanha!");
        }else{
            System.out.println("Normi ikä!");
        }

        
    }
}


