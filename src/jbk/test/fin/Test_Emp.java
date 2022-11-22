package jbk.test.fin;

public class Test_Emp 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		Employee e6 = new Employee();


		e1.accept(10, "Sonali", 10000.00);
		e1.operation();
		e1.display();
		
		e2.accept(11, "Nikhil", 12500.00);
		e2.operation();
		e2.display();
		
		e3.accept(12, "Roshan", 30000.00);
		e3.operation();
		e3.display();
		
		e4.accept(13, "Kalyani", 10800.00);
		e4.operation();
		e4.display();
		
		e5.accept(14, "Iraa", 12600.00);
		e5.operation();
		e5.display();
		
		e6.accept(15, "Mohit", 25000.00);
		e6.operation();
		e6.display();
		
		
		

	}

}
