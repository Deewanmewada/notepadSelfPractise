// write a program to count the total number of objects created for a class useing a static varialbe.

public class  CountStaticObj{
	
	// static varible to count obj
	static int count = 0 ;
	
	// constructor
	CountStaticObj() {
	 count++;
	}
	public static void main(String[] args){
		CountStaticObj s1 = new CountStaticObj();
		CountStaticObj s2 = new CountStaticObj();
		CountStaticObj s3 = new CountStaticObj();


		
		System.out.println(CountStaticObj.count);
		
	}
}