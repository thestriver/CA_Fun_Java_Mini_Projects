package chapter6;

<<<<<<< HEAD
public class Rectangle {
=======
import chapter11.ShapeAbstract;

public class Rectangle  extends ShapeAbstract {
>>>>>>> eb428968b59a5e7232cd887c60877e5b46508a65
    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;

    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public Rectangle(double length, double width){
<<<<<<< HEAD
        setLength(length);
        setWidth(width);
        //or this.length = length; &&  this.width = width;
=======
        //setLength(length);
        //setWidth(width);
        this.length = length;
        this.width = width;
>>>>>>> eb428968b59a5e7232cd887c60877e5b46508a65
    }


    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

<<<<<<< HEAD

    public double calculateArea() {
        return length * width;

    }



}
=======
    @Override
    public double calculateArea() {
        return length * width;
    }
}

>>>>>>> eb428968b59a5e7232cd887c60877e5b46508a65
