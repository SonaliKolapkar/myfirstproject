package constructor;

public class Constructor 
{
public Constructor()//default constructor
{
	System.out.println("Constructor Running");
}
public Constructor(int a)//parameterized constructor
{
	System.out.println("Constructor Running"+a);
}
public static void main(String[] args) 
{
	Constructor cd=new Constructor();
	//parameterized Constructor calling
	Constructor cd1=new Constructor(5);
}

}
