import java.util.Scanner;

public class GarageTest 
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner (System.in);
		Garage garage= new Garage();
		
		System.out.print("Enter Number of Hours:");
		garage.setNumberOfHours(sc.nextDouble());
		System.out.println("Is time parked less than 3 hours?(y/n):");
		garage.setMinimumFee(0);
		System.out.print("Enter Amount Charged(if over 3 hours):");
		garage.calculateParkingCharges();
		System.out.println("Is time parked over 10 Hours?(y/n):");
		garage.setMaximumFee(0);
		System.out.println("Add to Daily Receipts:");
		garage.setTotalReceipts(sc.nextLine());
	}
}
