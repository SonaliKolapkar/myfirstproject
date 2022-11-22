package constructor;

public class StudentTestOverloading 
{
	public static void main(String[] args) 
	{
	StudentData myobj=new StudentData();
	System.out.println("Studen Name is:"+myobj.getStuName());
	System.out.println("Student Age is:"+myobj.getStuAge());
	System.out.println("Student ID is:"+myobj.getStuID());
	
	
	StudentData myobj2=new StudentData(111,"Sonali",24);
	System.out.println("Student Name is:"+myobj2.getStuName());
	System.out.println("Student Age is:"+myobj2.getStuAge());
	System.out.println("Student ID is:"+myobj2.getStuID());
	}

}
