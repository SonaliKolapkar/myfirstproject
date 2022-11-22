package home_work;

public class Test_D
{
public static void main(String[] args)
{
Doctor d1=new Doctor();
Doctor d2=new Doctor();
Doctor d3=new Doctor();

d1.accept(111, "Sonali", "MD", "Gynocologist", 4);
d2.accept(112,"Mohit","MD","Neurologist",3);
d3.accept(113,"Nikhil","MBBS","rumonologist",4);

d1.display();
d2.display();
d3.display();
}
}

