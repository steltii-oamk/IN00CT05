public class Student {
    private String fname;
    private int age;

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if (age < 0) {
            System.out.println("VIRHE!!");
        }else{
            this.age = age;
        }
    }

    public void setInfo(String fname, int age){
        this.fname = fname;
        this.age = age;
    }

    public void growUp(){
        this.age++;
    }
}
