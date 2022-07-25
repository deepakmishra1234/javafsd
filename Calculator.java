package phase1.project;
import java.util.Scanner;
public class Calculator 
{ 
	public static void main(String[] args)
	{
		int n1, n2;
		char operator;
		double result = 0.0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the first number");
		n1= scan.nextInt();
		System.out.println("Enter the second number");
		n2= scan.nextInt();
		System.out.println("Enter the  operation which needs to be done");
		operator= scan.next().charAt(0);
		
		switch (operator)
		{
		case '+' : result = n1+n2;
		           break;
		case '-' : result = n1-n2;
	               break;
		case '*' : result = n1*n2;
		           break;
		case '/' : result = n1/n2;
		           break;
		           
		}
		System.out.println(n1+" "+operator+" "+n2+ "= "+ result);
		
		
		
	}
	
}
