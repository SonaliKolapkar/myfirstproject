package inheritance;

public class User 
{
String Name;
int Age;
long Ph;
}
class Employee extends User
{
String Specialization;
}
class Manager extends User
{
	String Department;
}
class main
{
public static void main(String[]args) 
	{
	Employee e1=new Employee();
	e1.Name="Sonali";
	e1.Age=24;
	e1.Ph=1234567890;
	e1.Specialization="Java";
	
	Manager m1=new Manager();
	m1.Name="skkk";
	m1.Age=22;
	m1.Ph=1234567890;
	m1.Department="HR";
	System.out.println(e1.Name);
	System.out.println(e1.Age);
	System.out.println(e1.Ph);
	System.out.println(e1.Specialization);
	
	System.out.println(m1.Name);
	System.out.println(m1.Age);
	System.out.println(m1.Ph);
	System.out.println(m1.Department);
	
}
	
}
