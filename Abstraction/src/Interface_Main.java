
public class Interface_Main implements Interface
{
//	public void show()
//	{
//		System.out.println("Interface in Main");
//	}

	public static void main(String[] args) 
	{
		Interface I = new Interface_Main();
		I.show();
	}

@Override
public void show() 
{
	System.out.println("Interface in main");
}

}
