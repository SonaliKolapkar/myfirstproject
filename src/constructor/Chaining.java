package constructor;

public class Chaining 
{
public Chaining()
{
	System.out.println("Default Constructor");
}
public Chaining (String str) 
{
	this();
	System.out.println("Parameterized Constructor with Single param");
}
public Chaining (String str,int num) 
{
	this("Hello");
	System.out.println("Parameterized Constructor with double args");
}
public Chaining(int num1,int num2,int num3) 
{
	this("hello2");
	System.out.println("Parameterized Constructor with three args");
}
public static void main(String[] args) 
{
Chaining obj=new Chaining(5,5,15);

}
}
