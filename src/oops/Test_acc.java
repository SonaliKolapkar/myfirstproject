package oops;

public class Test_acc 
{
public static void main(String[] args) 
{
SavingAccount a1 = new SavingAccount(5432,"Sonali",6000000);
SavingAccount a2 = new SavingAccount(5411,"Roshan",200000);
SavingAccount a3 = new SavingAccount(5444,"Kalyani",1000000);
SavingAccount a4 = new SavingAccount(7890,"Shweta",600000);
SavingAccount a5 = new SavingAccount(5678,"Mohit",1660000);

a1.Deposit(2000);
a1.Deposit(3000);
a1.showBalance();
a2.showBalance();
a2.Withdraw(500);
a2.showBalance();
a3.showBalance();
a4.showBalance();
a5.showBalance();
a4.Withdraw(40000);
a5.Withdraw(60000);
a4.showBalance();
a5.showBalance();
a1.Deposit(5000);
a1.showBalance();
a2.Deposit(5000);
a2.showBalance();

}
}
