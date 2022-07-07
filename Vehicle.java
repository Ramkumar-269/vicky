package Ram;

public class Vehicle {
	String brand;
	String movementType;
	int price;
	public Vehicle(String brand,String movementType,int price) {
		this.brand=brand;
		this.movementType=movementType;
		this.price=price;
	}
	public void printName() {
		System.out.println(brand);
	}

}
