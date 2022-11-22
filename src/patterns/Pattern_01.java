package patterns;

public class Pattern_01
{
public static void main(String[] args)
{
int i,j;
for(i=1;i<=4;i++)
{
for(j=0;j<=3;j++)
{
	if(j%2==0)
		System.out.print("*");
	else
		System.out.print("#");
}
System.out.println();
}
	
}
}
