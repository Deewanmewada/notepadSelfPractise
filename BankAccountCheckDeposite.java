// bank application 

//implement methods like deposite(double amount) and checkBalance() for basic banking operations.

public class BankAccountCheckDeposite{

double balance = 0.0;

// method to deoposite 
public  void deposite(double amount){
	if(amount > 0){
		balance = balance + amount;
            	System.out.println("Amount deposited: " + amount);

	}
	else {
            System.out.println("Invalid despite amount ");

		
	}
}

// method to check balance
public void checkBalance() {
        System.out.println("Current Balance: " + balance);

}

public static  void main(String [] args){
	BankAccountCheckDeposite  bankAccount = new BankAccountCheckDeposite();
	bankAccount.deposite(50000);
	bankAccount.checkBalance();
	}
}