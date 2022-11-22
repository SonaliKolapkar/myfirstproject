package constructor;

public class ConstructOverloading 
{
private int RollNum;
ConstructOverloading()
{
	RollNum=1234;
}
ConstructOverloading(int num)
{
	this();
	RollNum=RollNum+RollNum;
}
public int getRollNum()
{
	return RollNum;
}
public void setRollNum(int RollNum) 
{
	this.RollNum=RollNum;
}
}
