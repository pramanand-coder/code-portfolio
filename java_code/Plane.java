import java.util.Scanner;

public class Plane 
{
  public static void main (String args[])
  {
	  Scanner sc= new Scanner (System.in);
	  boolean seats[]= new boolean[10];
	  int seatsFull=0,seatFound,seatCount;
	  
	  for(int i=0;i<10;i++)
	  {
		  seats[i]= false;
	  }
	  do
	  {
		  seatCount=0;
		  for(int i=0;i<10;i++)
		  {
			  if(seats[i]==false)seatCount++;
		  }
		  
		  if(seatCount<1)
		  {
			  System.out.print("\nAll seats are sold for this flight.");
			  seatsFull=1;
			  break;
		  }
		  else
		  {
			  System.out.print("\n"+ seatCount +"seats are available.");
		  }
		  System.out.print("\nPress 1 for First Class or 2 for Economy Class:");
		  int seatClass=sc.nextInt();
		  switch(seatClass)
		  {
		  case 1:seatFound=0;
		  for (int i=0;i<5;i++)
		  {
			  if(seats[i]==false)
			  {
				  seats[i]=true;
				  System.out.print("\nBoarding Pass Details-->");
				  System.out.print("\nSeat Number:"+(i + 1));
				  System.out.print("\nFirst Class");
				  seatFound=1;
				  break;
			  }
	      }
		  break;
		  
		  case 2: seatFound=0;
		  if(seatFound==0)
		  {
			  for(int i=5;i<10;i++)
			  {
				  if(seats[i]==false)
				  {
					  seats[i]=true;
					  System.out.print("\nBoarding Pass Details-->");
					  System.out.print("\nSeat Number:"+(i + 1));
					  System.out.print("\nEconomy Class");
					  seatFound=1;
					  break;
				  }
			  }
		  }
		  break;
		  default:System.out.print("\nInvalid input...");seatFound=0;
		  }
		  
		  if(seatFound==0)
		  {
			  System.out.print("\nNo seats available in this class,would you like to travel in another class(y/n):");
			  sc.nextLine();
			  String changeSeatClass=sc.nextLine();
			  if(changeSeatClass.equalsIgnoreCase("n"))
			  {
				  break;
			  }
		  }
       }
	  while(seatsFull !=1);
	  System.out.print("\nNext Flight leaves in 3 hours..");
   }
}

