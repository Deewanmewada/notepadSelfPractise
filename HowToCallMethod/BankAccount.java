//can give a example where you used static method and instance method 
//hint : use static method for task that do not  depend on specific object data and use instance method when the task needs data from a //specific object.

public class BankAccount {


 // instance variable (object-specific)
    double balance;

    // static variable (shared)
    public static double interestRate = 5.0;

    // instance method → depends on object data
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Balance: " + balance);
    }

    // static method → does NOT depend on object data
    public static void showInterestRate() {
        System.out.println("Interest Rate: " + interestRate);
    }



public static void main(String[] args) {
	
 // static method call
        BankAccount.showInterestRate();

        // instance method call
        BankAccount acc = new BankAccount();

        acc.deposit(1000);

	}
}