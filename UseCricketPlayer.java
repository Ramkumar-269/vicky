package Ram;

public class UseCricketPlayer {
	public static void main(String[] args) {
		CricketPlayer cp=new CricketPlayer();
		cp.name="Ram";
		cp.age=24;
		cp.kitNo=9;
		cp.isFit=true;
		cp.bowilingSpeed=140;
		System.out.println(cp.name +cp.age +cp.kitNo +cp.isFit +cp.bowilingSpeed);
		cp.printName();
	}

}
