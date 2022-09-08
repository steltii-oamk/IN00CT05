import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
    // 1 tehtava
    
    // Scanner sc = new Scanner(System.in);
    
    // System.out.println("Enter 1st integer value");
    // int myInt = Integer.parseInt(sc.nextLine());
    
    // System.out.println("Enter 2nd integer value");
    // int myInt2 = Integer.parseInt(sc.nextLine());
    
    // sc.close();
    
    // int summa = myInt+myInt2;
    // int tulo = myInt*myInt2;
    // int jako = myInt/myInt2;

    // System.out.println("Summa on " + summa + System.lineSeparator() + 
    //                     "Tulo on " + tulo + System.lineSeparator() + 
    //                     "Jako on " + jako);
                        
    
    // 3 tehtava
    
    // System.out.println(myInt + " + " + myInt2+ " = " + summa );
    // System.out.println(myInt + " * " + myInt2+ " = " + tulo );
    // System.out.println(myInt + " / " + myInt2+ " = " + jako );
    

    // 2 tehtava
    
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter name");
    // String name = sc.nextLine();
    // sc.nextLine();
    
    // System.out.println("Enter age");
    // int age = Integer.parseInt(sc.nextLine());
    // sc.close();
    // System.out.println("Nimi oli "+ name + " ja ikä oli " + age);
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter height in m.");
    double height = Double.parseDouble(sc.nextLine());
    
    System.out.println("Entet weight in kg");
    double weight = Double.parseDouble(sc.nextLine());

    double BMI = weight/height/height;
    System.out.printf("Your BMI is %, .2f" , BMI);

    sc.close();
    
    }
}
