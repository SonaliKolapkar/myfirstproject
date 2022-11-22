package jbk.test.fin;

public class Order {
	int orderid;
	String orderdate;
	void calBill(Book x,Book y,Book z) 
{
	float totalprice=x.price+y.price+z.price;
	System.out.println("Total bill is"+totalprice);
		
	}
	}
