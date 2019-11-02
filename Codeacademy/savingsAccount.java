public class SavingsAccount {
  
    int balance;
    
    public SavingsAccount(int initialBalance){
      balance = initialBalance;
    }
    //check Balance method
    public void checkBalance() {
      System.out.println("Hello! Your balance is " + balance);
    }
    
    //Amount to deposit
    public void deposit(int amountToDeposit) {
      balance = balance + amountToDeposit;
      System.out.println("You just deposited " + amountToDeposit);
      }
    
    //withdraw method
    public int withdraw(int amountToWithdraw) {
      balance = balance - amountToWithdraw;
      return amountToWithdraw;  
    }
      
    //main method  
    public static void main(String[] args){
      SavingsAccount savings = new SavingsAccount(2000);
      
      //Check balance:
      savings.checkBalance();
      
      //System.out.println("Hello!");
      //System.out.println("Your balance is "+savings.balance);
      
      //Withdrawing:
      savings.withdraw(300);
      //int afterWithdraw = savings.balance - 300;
      //savings.balance = afterWithdraw;
      System.out.println("You just withdrew "+300);
      
      //Check balance:
     savings.checkBalance();
      //System.out.println("Hello!");
      //System.out.println("Your balance is "+savings.balance);
      
      //Deposit:
      savings.deposit(600);
      //int afterDeposit = savings.balance + 600;
      //savings.balance = afterDeposit;
      //System.out.println("You just deposited "+600);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
      //Deposit:
      int afterDeposit2 = savings.balance + 600;
      savings.balance = afterDeposit2;
      System.out.println("You just deposited "+600);
      
      //Check balance:
      System.out.println("Hello!");
      System.out.println("Your balance is "+savings.balance);
      
    }    
    
    
    
  }
  