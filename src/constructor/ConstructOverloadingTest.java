package constructor;

public class ConstructOverloadingTest 
{
public static void main(String[] args) 
{
	ConstructOverloading obj=new ConstructOverloading(23);
	System.out.println(obj.getRollNum());
	
	ConstructOverloading obj2=new ConstructOverloading (25);
	System.out.println(obj2.getRollNum());
}

}
