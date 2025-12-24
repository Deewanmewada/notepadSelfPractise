public class BankAccountModifier{

// private variable (data hiding)
private double balance = 0;



// constructor to initialize balance
public BankAccountModifier(double balance){
	this.balance = balance;
}

 // protected method to calculate interest
protected double calculateInterest(){
	double interestRate = 5.0;
	return (balance * interestRate)/100;
}


    
// public method to display account details

public void display(){
	System.out.println("Account Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
}


}