package home_work;

public class Doctor 
{
int id;
String name;
String degree;
String specialization;
int exp;

void accept(int id,String name,String degree,String specialization,int exp)
{
this.id=id;
this.name=name;
this.degree=degree;
this.specialization=specialization;
this.exp=exp;
}
void display()
{
	System.out.println("----------");
	System.out.println(id);
	System.out.println(name);
	System.out.println(degree);
	System.out.println(specialization);
	System.out.println(exp);
}
}
