public class Calculator {
  
  //constructor
  public Calculator() {
    
  }
  
  public int add(int a, int b) {
    //sum = a + b;
    return a + b;
  }
  
  public int subtract(int a, int b) {
    //diff = a - b;
    return a-b;
    
  }
  
  public int multiply(int a, int b) {
    //multiply = a * b;
    return a * b;
    
  }
  
  public int divide(int a, int b) {
    //division = a / b;
    return a / b;
    
  }
  
  public int modulo(int a, int b) {
    //remain = a % b;
    return a % b;
    
  }
  
  public static void main(String[] Args) {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));
    
  }
  
  
}