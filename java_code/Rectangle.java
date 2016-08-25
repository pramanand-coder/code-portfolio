public class Rectangle 
{
private static int length;
private static int width;
 
 public Rectangle()
  {
	length=(int) 0.0;
	width=(int) 0.0;
  }
 public Rectangle(int l, int w)
 {
	 length=l;
	 width=w;
 }
 public int FindArea()
 {
	 return length * width;
 }
 public int FindPerim()
 {
	 return (length*2) + (width*2);
 }

}
