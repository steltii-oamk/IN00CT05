import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numerot1 = new ArrayList<>(List.of(1,2,3,4,5,5));
        List<Integer> numerot2 = new ArrayList<>(List.of(5,4,7,6,5,4));
    
    
        int lkm = 0;
    
        for (int i = 0; i < numerot1.size(); i++) {
            if (numerot1.get(i) == numerot2.get(i)) {
                lkm++;
            }
        }
        System.out.println(lkm);
    }
}
