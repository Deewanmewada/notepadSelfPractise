// interview Q ->  Design a class  to represent a bank account where each account has a  balance (instance variable) , and all accounts share a single interest rate (static variable).

public class BankAccount {

	int neerajAcc = 10000;
	int rupeshAcc  = 5000;
	int lokenACc = 5000;
	static int interstRate = 28%;


	public static void main(String args[]) {
		BankAccount bankAccount = new BankAccount();
		
		System.out.println("Neeraj account detail is : " + neerajAcc );
		System.out.println("rate : " + BankAccount.interstRate);
		
	}
}
