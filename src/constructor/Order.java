package constructor;

public class Order 
{
int orderno;
String date;
Product p1;
Product p2;
Product p3;
Product p4;
Order(int orderno,String date,Product p1,Product p2,Product p3,Product p4){
	this.orderno=orderno;
	this.date=date;
	this.p1=p1;
	this.p2=p2;
	this.p3=p3;
	this.p4=p4;
}
}
