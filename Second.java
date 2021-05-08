
import java.io.*;
import java.util.*;
class Second
{

public static void main(String[] args) throws IOException {

	InputStreamReader istream = new InputStreamReader(System.in);
	BufferedReader bufRead = new BufferedReader(istream);
	
	System.out.println("Welcome To My Second Java Program");
	System.out.println("Please Enter In Your First Name: ");
	
	String firstName = bufRead.readLine();
	
	System.out.println("Please Enter the Year You Were Born:");
	String bornYear = bufRead.readLine();
	
	System.out.println("Hello "+firstName+" Your DOB: "+bornYear);
		
	System.out.println("Please Enter the current Year: ");
	String currYear = bufRead.readLine();
	
	System.out.println("Hello "+firstName+" Your DOB: "+currYear);
	

//we are now translating / converting to int.

	int b = Integer.parseInt(bornYear);	//ClassName.methodName means the parseInt() method is static
	int c = Integer.parseInt(currYear);
	int age = c-b;
	System.out.println("Your age: "+age);
		
	}

}