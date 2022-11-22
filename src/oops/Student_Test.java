package oops;

public class Student_Test 
{
public static void main(String[] args) 
{
Class_Student s1 = new Class_Student();
Class_Student s2 = new Class_Student();
Class_Student s3 = new Class_Student();
Class_Student s4 = new Class_Student();
Class_Student s5 = new Class_Student();

s1.show(111, 51, "Sonali", "MCA", 9.9f, "HVPM", "Maharashtra");
s2.show(112, 52, "Shweta", "MBA", 10.0f, "KDK", "Bihar");
s3.show(113, 53, "Roshan", "MCom", 7.9f, "KL", "Maharashtra");
s4.show(114, 54, "Samartha", "BCA", 8.0f, "Biyani", "Maharashtra");
s5.show(115, 55, "Kalyani", "Bcom", 6.8f, "Bhartiya", "Maharashtra");

s1.display();
s2.display();
s3.display();
s4.display();
s5.display();
}
}
