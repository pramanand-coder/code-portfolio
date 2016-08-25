public class Square 
{
	private static double side;
	private static double area;
	private static double perimeter;
	
	 
	 public Square()
	  {
		side=0.0;
		area=0.0;
		perimeter=0.0;
	  }
	 public Square(double s, double a,double p)
	 {
		 side=s;
		 area=a;
		 perimeter=p;
	 }
	 public double FindSide()
	 {
		 return 0.0;
	 }
	 public double FindArea()
	 {
		 return side*side;
	 }
	 public double FindPerimeter()
	 {
		 return 4*side;
	 }

}

 

