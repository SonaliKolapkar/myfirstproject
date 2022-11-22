package patterns;

public class Pattern_4 
{
public static void main(String[] args) 
{
for(int j=0; j<4; j++)
{
for(int i=1;i<=9;i++)
{
	if(i==1 || i==2 || i==3)
		System.out.print("*");
	if(i==4 || i==5 || i==6)
		System.out.print("#");
	if(i==7 || i==8 || i==9)
		System.out.print("@");
	
	
}
	System.out.println();
}
	

	
}
}