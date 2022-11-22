package home_work;

public class Test_Stud 
{
public static void main(String[] args) 
{
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();

s1.accept(11, "Sonali", 78.65f);
s2.accept(12, "Shweta", 88.35f);
s3.accept(14, "Kalyani", 56.25f);

s1.display();
s2.display();
s3.display();

System.out.println("per the highest score and lowest score:");
Object max;
System.out.println(max.name+" "+max.stu_id);

Object min;
System.out.println(min.name+" "+min.stu_id);
}
}
