package chapter6;

import chapter11.ShapeAbstract;

public class Rectangle  extends ShapeAbstract {
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
        //setLength(length);
        //setWidth(width);
        this.length = length;
        this.width = width;
    }


    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

