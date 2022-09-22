public class Rectangle {
    public double w, h;

    public Rectangle(){

    }

    public Rectangle(double w, double h){
        this.w = w;
        this.h = h;
    }

    public double getWidth(){
        return w;
    }

    public double getArea(){
        return w*h;
    }
}
