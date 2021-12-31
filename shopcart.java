class shoppingcart
{
	String clothname;
	int qty;
	int price;
	shoppingcart(String clothname, int qty, int price)
	{
	this.clothname=clothname;
	this.qty=qty;
	this.price=price;
	}
	void showdetails()
	{
	System.out.println("Name="+clothname);
	}
	}
	class outfit extends shoppingcart
	{
	outfit(String clothname, int qty, int price)
	{
	super(clothname, qty, price);
	}

	void showdetails()
	{
	double amount = super.qty * super.price;
	System.out.println("OUTFIT="+clothname);
	System.out.println("QUANTITY="+qty);
	System.out.println("AMOUNT="+amount);
	}
	}
	public class shopcart
	{
	public static void main(String args[])
	{
	outfit s = new outfit("JEANS",40, 3000);
	outfit m = new outfit("TEE",50, 300);
	s.showdetails();
	m.showdetails();
	}
}
