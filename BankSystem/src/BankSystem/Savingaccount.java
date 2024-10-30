package ergasthrio5;

public class Savingaccount extends Bankaccount {
	private double intrate;
	
	public Savingaccount(String name,double intrate) {
		super(name);
		this.intrate=intrate;
	}
	
	public Savingaccount(String name,double balance,double intrate) {
		super(name,balance);
		this.intrate=intrate;
	}
	
	public void Calculateintrate() {
		double interest = (getBalance() * intrate)/100;
		deposit(interest);
	}
	
	public void transfer(double amount,Bankaccount ac) {
		this.withdraw(amount);
		ac.deposit(amount);
	}
	
	public void print() {
		System.out.print("Bank savings:");
		super.print();
	}
	

}
