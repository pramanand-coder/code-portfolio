
import java.util.Scanner;
public class OddEven 
{
	private static Scanner input;

	public static void main(String[]args)
	{
 input = new Scanner(System.in);

			  int number1;
			  int number2;
			
			System.out.print("Enter first integer:");
			number1=input.nextInt();
			System.out.print("Enter second integer:");
			number2=input.nextInt();
			
	    if(number1%2==0)
		{
			System.out.println("Number is even.");
		}
		else
		{
			System.out.println("Number is odd.");
		}
		if(number2%2==0)
		{
			System.out.println("Number is even.");
		}
		else
		{
			System.out.println("Number is odd.");
		}
		System.exit(0);
	}	
}
