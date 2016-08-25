import java.util.Scanner;

class InvoiceTest 
{
   private static Scanner sc;

public static void main(String[]args)
 {
	 sc = new Scanner (System.in);
	 Invoice invoice= new Invoice();
	 
	 System.out.print("Enter part number:");
	 invoice.setPartNumber(sc.nextLine());
	 System.out.print("Enter part description:");
	 invoice.setPartDescription(sc.nextLine());
	 System.out.print("Enter item purchased:");
	 invoice.setItemPurchased(sc.nextInt());
	 System.out.print("Enter price per item:");
	 invoice.setPricePerItem(sc.nextDouble());
	 
	 System.out.print("\n\nDetail of items purchasing-->");
	 System.out.print("\nPart number:"+ invoice.getPartNumber());
	 System.out.print("\nPart number:"+ invoice.getPartDescription());
	 System.out.print("\nTotal Billing Amount:"+ invoice.getInvoiceAmount());
  }
}

