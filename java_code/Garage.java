import java.util.Scanner;
class Garage 
{ 
		 double totalReceipts=0.0;
		 double minimumFee=2.00;
		 double numberOfHours;
		 double maximumFee=10.00;
		 double parkingCharges;
		 
		 Garage()
		 {	  
			minimumFee=2.00;
			maximumFee=10.00;
			numberOfHours=0.0;
			parkingCharges=0.00;
			
			System.out.println("For Office Use Only:");
			totalReceipts=0.0;
		 }
		void setMinimumFee(double mf)
		{
			minimumFee=mf;
		}
		double getMinimumFee()
		{
			return minimumFee;
		}
		void setMaximumFee(double mxf)
		{
			maximumFee=mxf;
		}
		
		double getMaximumFee()
		{
			return maximumFee;
		}
		void setNumberOfHours(double nh)
		{
			numberOfHours=nh;
		}
		double getNumberOfhours()
		{
			return numberOfHours;
		}
		void setTotalReceipts(double tr)
		{
			totalReceipts=tr;
		}
		double getTotalReceipts()
		{
			return totalReceipts;
		}
		double calculateParkingCharges()
		{
			return (parkingCharges=minimumFee);
		}
		public void parkingCharges(int nextInt) 
		{
			// TODO Auto-generated method stub
			
		}
		public void setTotalReceipts(String nextLine) 
		{
			// TODO Auto-generated method stub
			
		}
		
}

