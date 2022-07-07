package Ram;

public class UseBank {
	public static void main(String[] args) {
		Bank bank=new Bank();
		System.out.println(bank.loan());
		System.out.println(bank.loan(20000));
		System.out.println(bank.loan(20000,400000));
	}

}
