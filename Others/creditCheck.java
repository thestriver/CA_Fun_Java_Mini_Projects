import.java.util.Scanner;


public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]){
    
    getSalary();
    getCreditScore();
    isUserQualified();
    scan.close();

	}
	
	public static double getSalary(){
		System.out.println("Enter your salary:");
    	double salary = scan.nextDouble();
    	return salary;
    
	}

	public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scan.nextInt();
        return creditScore;
    }

}


	public static boolean isUserQualified(){
	if (creditScore >= requiredCreditScore && Salary >=requiredSalary) {
		return true;
		
	}
	else {

	}


}




}