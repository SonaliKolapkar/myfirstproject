package home_work;

public class Student 
{
int id;
String name;
float per;

void accept(int id,String name,float per) 
{
	this.id=id;
	this.name=name;
	this.per=per;
}
void display()
{
System.out.println("---------");
System.out.println(id);
System.out.println(name);
System.out.println(per);
}
}
