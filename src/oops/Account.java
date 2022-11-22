package oops;

public class Account
{
int Accno;
String Name;
double Balance;

Account(int Accno,String Name,double Balance)
{
this.Accno=Accno;
this.Name=Name;
this.Balance=Balance;
}
void Withdraw(double amount) 
{
	Balance=Balance-amount;
}
void Deposit(double amount) 
{
	Balance=Balance-amount;
}

void showBalance() 
{
	System.out.println(Name +"Balance is "+Balance);
}
}
