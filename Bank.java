class bankaccount 
{
    String name;
    int balance;
    int accountNo;

    bankaccount(String name, int balance, int accountNo) 
	{
        this.name = name;
        this.balance = balance;
        this.accountNo = accountNo;
    }
    void display() 
	{
        System.out.println(name);
        System.out.println(balance);
    }
    void deposit(int amount) 
	{
        balance = balance + amount;
    }
    void withdraw(int amount) 
	{
        balance = balance - amount;
    }
}

public class Bank
{
    public static void main(String[] args) 
	{

        bankaccount b1 = new bankaccount("Ram", 123, 456);
        bankaccount b2 = new bankaccount("harsha", 123, 457);

        b1.display();
        b2.display();

        System.out.println("after");

        b1.deposit(3);
        b2.withdraw(3);

        b1.display();
        b2.display();
    }
}