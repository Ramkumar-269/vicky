package Ram;

public class Bike extends Vehicle {
	int cc;
	String color;
	public Bike(String brand,String movementType,int price,int cc,String color) {
		super(brand, movementType, price);
		this.cc=cc;
		this.color=color;
	}
	public void printFields() {
		System.out.println("Color: "+color+", "+super.price);
		super.printName();
	}
	public String toString() {
		return super.brand+", "+super.movementType+", "+super.price+", "+cc+", "+color;
		
	}

}
