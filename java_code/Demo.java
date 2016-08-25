
public class Demo 
{
 public static void main(String args[])
 {
	 ExceptionA a = new ExceptionA();
	 a.get(4,8);
	 a.Show();
   try
    {
	 ExceptionB
	 ExceptionC;
    }
   catch(Exception statements)
    {
	   System.err.println("Exception handled in main.");
    }
   finally
   {
	  System.err.println("Finally executed in exception statements.");
   }
 }
}
