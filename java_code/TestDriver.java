import java.util.Scanner;
public class TestDriver 
{
  
	 public static void main(String[] args) 
	 {
		  Scanner scanner = new Scanner(System.in);
		  Square square= new Square();
		  Rectangle rectangle=new Rectangle();
		  
	  int side = 0;  
	  int area = 0;
	  int perimeter = 0;
	  int length=0;
	  int width=0;
	  System.out.print("Square:");
	  scanner.nextLine();
	  {
	  System.out.println("Enter the length of side of square ");
	  side = scanner.nextInt();
	  area = side * side;
	  perimeter = 4 * side;
	  System.out.println("Area of Square is : " + area);
	  System.out.println("Perimeter of Square is : " + perimeter);
	  }
	  System.out.print("Rectangle:");
	  scanner.nextLine();
	  {
		 System.out.println("Enter the length of rectangle ");
		  scanner.nextInt();
		  System.out.println("Enter the width of rectangle ");
		  scanner.nextInt();
		  rectangle.FindArea();
		  rectangle.FindPerim();
	      System.out.println("Area of Rectangle is : " + area);
		  System.out.println("Perimeter of Rectangle is : " + perimeter);
	  }
	} 
}

