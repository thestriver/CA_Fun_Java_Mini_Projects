package chapter6;

public class HomeAreaCalculator {

    /*
     * Write a class that creates instances of the `Rectangle` class to find the
     * total area of two rooms in a house.
     */
    public static void main(String args[]) {
        //rectangle 1
        Rectangle room1 = new Rectangle();
        room1.setLength(25);
        room1.setWidth(30);
        double room1Area = room1.calculateArea();

        //rectangle2
        Rectangle room2 = new Rectangle(30,75);
        double room2Area = room2.calculateArea();

        //total
        double totalArea = room1Area + room2Area;
        System.out.println("The total area of both rooms is" + totalArea);

    }



    }
