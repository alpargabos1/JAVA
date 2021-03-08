package labor2;

public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area(){
        return length * width;
    }

    public double perimeter() {
        return 2 * length + 2 * width;
    }
}
