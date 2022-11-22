package constructor;

public class ConstructorCallSubclass 
{
	ConstructorCallSubclass()
	{
	System.out.println("Constructor of Subclass");
	}
	ConstructorCallSubclass(int num){
		System.out.println("Constructor with arg");
	}
	void display() {
		System.out.println("Hello");
	}
	public static void main(String[] args) 
	{
		ConstructorCallSubclass obj=new ConstructorCallSubclass	();
		obj.display();
		ConstructorCallSubclass obj2 =new ConstructorCallSubclass(10);
		obj2.display();
	}
	}
