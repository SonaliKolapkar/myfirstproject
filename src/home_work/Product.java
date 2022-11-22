package home_work;

public class Product 
{
String name;
int qty;
double price;
double totalprice;

Product(String name,int qty,double price,double totalprice)
{
this.name=name;
this.qty=qty;
this.price=price;
this.totalprice=totalprice;
}
public String getname()
{
return name;	
}
public int getqty()
{
return qty;
}
public double getprice() 
{
return price;
}
public double gettotalprice() 
{
return totalprice;
}
public static void main(String[] args) 
{
System.out.println("\n name ");	
}
}