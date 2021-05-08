import java.io.*;
import java.util.*;


class Third {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name: " );
		String name = sc.nextLine();
		System.out.println("Your Name: "+name);
		
		System.out.println("Enter your no. " );
		int x = sc.nextInt();

		System.out.println("Enter value of n: ");
		int n = sc.nextInt();
		System.out.println("Power of no. = "+Math.pow(x, n));   //ClassName.methodName() as pow() is static method.
}
}

//Write a program to find the nth power of the no. entered by user. Note: use Scanner class..

// if-else, while, do-while, 