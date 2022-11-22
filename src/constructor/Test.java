package constructor;

public class Test 
{
public static void main(String[] args) 
{
Product p1=new Product(11,"Rise",10,4.5f);
Product p2=new Product(12,"Salt",5,60.8f);
Product p3=new Product(13,"Sugar",8,860.0f);
Product p4=new Product(14,"Butter",6,710.9f);
Product p5=new Product(15,"Cheese",15,670.5f);
Product p6=new Product(16,"Tea",20,530.5f);
Product p7=new Product(17,"Cooking Oil",6,780.5f);
Product p8=new Product(18,"Eggs",13,350.5f);

Order order=new Order(11,"27nov",p1,p2,p7,p8);

Bill b1= new Bill(436465);
b1.CalBill(order);
System.out.println(b1.finalprice);
}
}
