public class Invoice 
{

	String partNumber;
	String partDescription;
	int itemPurchased;
	double pricePerItem;
	
	Invoice()
	{
		partNumber=" ";
		partDescription=" ";
		itemPurchased=0;
		pricePerItem=0.0;
	}
	void setPartNumber(String pn)
	{
		partNumber= pn;
	}
	String getPartNumber()
	{
		return partNumber;
	}
	void setPartDescription(String pd)
	{
		partDescription=pd;
	}
	String getPartDescription()
	{
		return partDescription;
	}
	void setItemPurchased(int ip)
	{
		itemPurchased= ip;
	}
	int getItemPurchased()
	{
		return itemPurchased;
	}
	void setPricePerItem(double ppi)
	{
		pricePerItem= ppi;
	}
	double getPricePerItem()
	{
		return pricePerItem;
	}
	double getInvoiceAmount()
	{
		return (itemPurchased * pricePerItem);
	}
	
}



