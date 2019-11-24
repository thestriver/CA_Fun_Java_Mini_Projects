package chapter12;

import java.util.*;

public interface CollectionsDemo {


    public static void main(String[] args) {
        setDemo();
        mapDemo();


    }

    public static void setDemo() {
        Set<String> fruit = new HashSet();
        fruit.add("lemon");
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("mango") ;

        var i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        for (String item: fruit) {   //enhanced for loop
            System.out.println(item);
        }
        fruit.forEach(x -> System.out.println(x));  //forEach method - Lamdbda expression
        fruit.forEach(System.out::println);  // syntactic sugar
    }

    public static void mapDemo() {
        Map<String,Integer> fruitCalories = new HashMap();
        fruitCalories.put("lemon", 40);
        fruitCalories.put("apple", 95);
        fruitCalories.put("banana", 105);
        fruitCalories.put("mango", 75);

        for (var entry : fruitCalories.entrySet()) { //enhanced for loop for Map
            System.out.println(entry.getValue());
        }


        fruitCalories.forEach(
                (k,v) -> System.out.println("Fruit: " + k + " " + "Calories: " + v )
        );

    }

}
