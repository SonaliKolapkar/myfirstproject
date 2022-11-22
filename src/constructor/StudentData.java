package constructor;

public class StudentData 
{
private int stuID;
private String stuName;
private int stuAge;

StudentData()
{
	stuID=111;
	stuName="Shweta";
	stuAge=22;
}
StudentData(int num1,String str,int num2){
	stuID=num1;
	stuName=str;
	stuAge=num2;
}
public int getStuID() {
	return stuID;
}
public void setStuID(int stuID) 
{
	this.stuID=stuID;
}
public String getStuName()
{
	
return stuName;
}
public void setStuName(String stuName) 
{
	this.stuName=stuName;
}
public int getStuAge() 
{
	return stuAge;
}
public void setStuAge(int stuAge) 
{
	this.stuAge=stuAge;
}

}
