package patterns;

public class Pattern_5 
{
public static void main(String[] args) 
{
for(int n=1;n<=3;n++)
{
for(int i=1,j=10; i<=10; i++,j--)		
{
if(i<6)	
{
	System.out.print(i+"");
	}
else {
	System.out.print(j+"");
}
}
System.out.println();
}
}

}
