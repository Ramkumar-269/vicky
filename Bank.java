package Ram;

public class Bank {
	public int loan() {
		return 30000;
	}
	public int loan(int salary) {
		return salary*10+30000;
	}
	public int loan(int salary,int propertyValue) {
		return(propertyValue/2)+(salary*10)+30000;
	}

}
