// write a program to check if non primitive data type has null value or not ?

public  class CheckNonPrimitiveDataType{
	// instance varible
	String name;
	int arr[];

	public static void main(String [] args){
	
	CheckNonPrimitiveDataType test = new CheckNonPrimitiveDataType(); // created object 
		
 	System.out.println("Default value of String       : " + test.name);
        System.out.println("Default value of int array    : " + test.arr);


		
	// checking default null or not 

	if(test.name == null){
		System.out.println("yes ,string is null value ");
	}
	else{
		System.out.println("NO, String has not null value");
	}

	if(test.arr == null){
		System.out.println(" yes ,arr is null value ");
	}
	else{
		System.out.println("NO, arr has not null value");
	}

	
	
	}
}