package patterns; /* $@$@
                     $@$@$@$@
                     $@$@$@$@$@ */

public class Pattern_8 
{
public static void main(String[] args) 
{
for(int i=1;i<=5;++i) 
{	
for(int j=1;j<=4;j=j+1)
{
if(j%2==0)
System.out.print("@");
else
System.out.print("$");
}
System.out.println();
}
}
}