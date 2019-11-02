public class Droid {
  int batteryLevel;
  String name;
  
  
  
  public void performTask(String task) {
    System.out.print(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10 ;
    
  }
  
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
    
  }
  
  public static void main(String[] Args) {
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("Standing");
    
  }
  
  //toString
  
  public String tostring() {
    return "Hello! I'm the droid: " + name;
  }
  
  
  
  
  
}