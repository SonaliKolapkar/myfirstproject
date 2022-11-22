package oops;

public class Class_Student 

{
	int Id;
	int Roll_No;
	String Name;
	String Course;
	float cgpa;
	String College;
	String State;
void show(int Id, int Roll_No, String Name, String Course, float cgpa, String College, String State)
{
	this.Id=Id;
	this.Roll_No=Roll_No;
	this.Name=Name;
	this.Course=Course;
	this.cgpa=cgpa;
	this.College=College;
	this.State=State;
}
void display() 
{
System.out.println("-------------");
System.out.println(Id);
System.out.println(Roll_No);
System.out.println(Name);
System.out.println(Course);
System.out.println(cgpa);
System.out.println(College);
System.out.println(State);

}
}



