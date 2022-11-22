package jbk.test.fin;

public class Employee 
{
	int empid;
	String ename;
	double basicsal;
	double DA;
	double HRA;
	double gross_sal;

	void accept(int empid, String ename, double basicsal)
	{
		this.empid = empid;
		this.ename = ename;
		this.basicsal = basicsal;
}
	void operation() 
	{
		DA = basicsal * 0.1;
		HRA = basicsal * 0.15;
		gross_sal=basicsal+DA+HRA;
	
	}
	void display() 
	{
		System.out.println("==========");
		System.out.println(empid);
		System.out.println(ename);
		System.out.println(gross_sal);
}
}
