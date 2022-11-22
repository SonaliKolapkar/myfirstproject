package basic;

public class Demo_6 
{ 
	public static void main(String[] args) 
	{
	int icounter=0,jcounter=0,kcounter=0;
	for(int i=0;i<3;i=i+1) 
	{
		icounter = icounter + 1;
	for(int j=0;j<3;j=j+1) 
	{
		jcounter=jcounter+1;
		for(int k=0;k<3;k=k+1) 
		{
		kcounter=kcounter+1;
		}
	}
	}
	System.out.println("icounter "+icounter);
	System.out.println("jcounter "+jcounter);
	System.out.println("kcounter "+kcounter);
	}

}
