package chapter9;

public class Square extends RectangleInherit{

    @Override
    public double calculatePerimeter() {
        return sides * length;
    }
    public void print(String what){
        System.out.println("I am a " + what);


    }
}
