package ergasthrio5;

public class Main {

	public static void main(String[] args) {
		Bankaccount BA1 =new Bankaccount("NIKOS",100);
			BA1.deposit(100);
			BA1.withdraw(50);
			BA1.print();
		
		Savingaccount BA2=new Savingaccount("XARHS",1.5);//onoma,epitokio
			BA2.setName("XARHS");
			BA2.deposit(2000);
			BA2.withdraw(300);
			BA2.print();
			BA2.transfer(100, BA1);
			BA1.print();
			BA2.print();
		
		Checkingaccount BA3= new Checkingaccount("KWSTAS");
			BA3.print();
				
		Registryaccount bank= new Registryaccount("BANK");
		bank.addAccount(BA1);
		bank.addAccount(BA2);
		bank.addAccount(BA3);
		
		bank.printacc();
	}

}