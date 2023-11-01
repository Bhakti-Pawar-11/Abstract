
public class Bike_Ktm extends Bike
{
	@Override
	void run()
	{
		System.out.println("KTM Bike");
	}

	public static void main(String[] args) {
		
		Bike B = new Bike_Ktm();
		B.run();
	}

}
