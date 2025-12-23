// create a method sendEmail(String recipient , String message ) to simulate sending emails.



public class SendEmail{

public static void sendEmail(String recipient , String message){

	System.out.println("Sending email...");
        System.out.println("To      : " + recipient);
        System.out.println("Message : " + message);
        System.out.println("Email sent successfully!");
}
public static void main(String [] args){
	
	sendEmail("deewanmewada81@gmail.com" , "Welcome to the kodewala ");
	}
	
}