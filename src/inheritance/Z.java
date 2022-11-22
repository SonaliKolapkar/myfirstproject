package inheritance;

public class Z extends Y
{
public void methodZ()
{
	System.out.println("class Z is method");
}
public static void main(String[] args) 
{
Z obj=new Z();
obj.methodX();
obj.methodY();
obj.methodZ();
}
}

