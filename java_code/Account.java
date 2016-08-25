import java.util.Scanner;

public class Account 
{
	static class Customer
	{
		private int accNumber;
		private double balance;
		private double creditLimit;
		private double totalItemsCharge;
		private double totalCreditUsed;
		private static int counter= 1234;
		
	public Customer(double b, double cl)
	{
		this.accNumber= this.counter + 10;
		this.counter += 10;
		this.balance = b;
		this.creditLimit = cl;
		this.totalItemsCharge = 0.0;
		this.totalCreditUsed = 0.0;
	}
	public void setNewBalance()
	{
		balance= balance +totalItemsCharge-totalCreditUsed;
	}
	public double getBalance()
	{
		return balance;
	}
    public void setItemsCharge(double ic)
    {
    	totalItemsCharge += ic;
    }
    public void setCreditUsed(double cu)
    {
    	totalCreditUsed += cu;
    }
    public double getCreditLimit()
    {
    	return creditLimit;
    }
    public int getAccountNumber()
    {
    	return accNumber;
    }
  } 

  static class CreditLimit
  {
	public static void main(String args[])
	 {
		 Scanner sc= new Scanner(System.in);
		 double bal,cl,tic,tcu;
		 System.out.print("Enter number of Customers:");
		 int noOfCustomers=sc.nextInt();
		 for(int i=0;i<noOfCustomers;i++)
		 {
			 System.out.println("\nEnter customer"+(i + 1)+"details-->");
			 System.out.print("Enter balance and credit limit(use space to separate them):");
			 bal=sc.nextDouble();cl=sc.nextDouble();
			 Customer c= new Customer(bal,cl);
			 System.out.print("Enter total items charge and total credit used(use space to separate them):");
			 tic=sc.nextDouble();tcu=sc.nextDouble();
			 c.setItemsCharge(tic);
			 c.setCreditUsed(tcu);
			 c.setNewBalance();
			 if(c.getBalance()>c.getCreditLimit())
			 {
				 System.out.print("\nCredit Limit Exceeded for Account Number"+c.getAccountNumber());
			 }
			 else
			 {
				 System.out.print("\nSufficient Credit Limit Remaining for Account Number"+c.getAccountNumber());
			 }
		 }
	 }
  }
}




















