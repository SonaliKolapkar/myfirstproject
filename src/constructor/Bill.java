package constructor;

public class Bill 
{
int billno;
float totalamount;
float discount;
float finalprice;

Bill(int billno){
	this.billno=billno;
}
void CalBill(Order order) 
{

 totalamount=order.p1.price+order.p2.price+order.p3.price+order.p4.price;
discount=(totalamount*10)/100;

System.out.println("discount applied 10%");
System.out.println(totalamount);
finalprice=totalamount-discount;
}
}
