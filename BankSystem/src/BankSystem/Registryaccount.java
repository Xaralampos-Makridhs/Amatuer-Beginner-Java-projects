package ergasthrio5;
import java.util.ArrayList;

public class Registryaccount {
	private String name;
	private ArrayList<Bankaccount> accounts=new ArrayList<>();
	
	
	public Registryaccount(String name) {
		this.name=name;
	}
	
	public void addAccount(Bankaccount acc) {
		accounts.add(acc);
	}
	
	public void printacc() {
		System.out.println("---->Bank Account: "+name+"<----");
		for(Bankaccount acc:accounts) {
				acc.print();
		}
	}
}
