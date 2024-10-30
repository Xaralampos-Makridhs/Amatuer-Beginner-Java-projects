package ergasthrio5;

public class Bankaccount {
	protected String name;
	protected double balance;
	
	
	public Bankaccount(String name) {
		this.name=name;
	}
	
	public Bankaccount(String name,double balance) {
		this.name=name;
		this.balance=0.0;
	}
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public void withdraw(double amount) {
		if(balance<amount) {
			System.out.println("invalid amount.enter a valid amount of money");
		}else {
			balance-=amount;
		}
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void print() {
		System.out.println("name: "+name +"\n"+"balance: "+balance);
	}
	
	
	
}
