package CoreJava;

public class ClassA124 
{
	int amount =10000;
	
	synchronized void withdraw(int amount) throws InterruptedException
	
	{
		if(this.amount<amount)
		{
			System.out.println("Insufficient balance");
			wait(10000,500);
			System.out.println("Amount credited");
			this.amount-=amount;
			System.out.println("withdraw successful \balance is"+this.amount);
		}
		else
		{
			this.amount-=amount;
			System.out.println("withdrwa successfully \n balance "+this.amount);
		}
	}
	synchronized void deposit(int amount)
	{
		this.amount+=amount;
		System.out.println("deposited succeful \balance is"+this.amount);
		notify();
		
		//notifyAlll();
	}

}
