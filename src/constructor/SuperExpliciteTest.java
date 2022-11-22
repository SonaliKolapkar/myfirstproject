package constructor;

public class SuperExpliciteTest 
{
public class  SuperExplicite extends  SuperExpliciteTest
{
	 SuperExplicite(){
		 super();
		 System.out.println("Constructor of Subclass");
	 }
	 void display() {
		 System.out.println("hello");
	 }
	 public static void main(String[] args) 
	 {
		 SuperExpliciteTest obj=new SuperExpliciteTest();
		 
}
}
}

