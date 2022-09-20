public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }


    //eka
    public void tulosta() {
        System.out.println("hello");
    }

    //toka
    public void tulosta(int variable) {
        for (int i = 0; i < variable; i++) {
            System.out.println("hello");
        }
        
    }

    //kolmas
    public int laske(int variable, int variable2) {
        
        int lasku = variable-variable2;
        return lasku;
    }

    //neljas
    public int summa(int[] arr) {
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i]; 
        }
    
        return sum;
        
    }

    //viides
    public int[] taulu(int index, int[] luvut){
        
        luvut[0] = 0;
        luvut[index] = 5;
        int var = luvut.length-1;

        luvut[var] = 7;
        
        return luvut;
    }

    //kuudes
    public java.util.List<Integer> listControl(int luku){
        
        java.util.List<Integer> numbers = new java.util.ArrayList<>();
        numbers.addAll(java.util.List.of(4,3,2,4,5,6));
        
        //LISÄÄ metodin parametrina saatu luku listan numbers loppuun.
        numbers.add(5,luku);

        //KORVAA listan numbers ensimmäinen numero luvulla 8
        numbers.set(0,8);

        //Laske listan numbers numeroiden summa ja LISÄÄ summa listan loppuun.
        int sum = 0;
        for(int i : numbers){
            sum += i;
            System.out.println(sum);
        }

        System.out.println(sum);

        numbers.add(numbers.size()-1, sum);

        
        return numbers;
    }


}
