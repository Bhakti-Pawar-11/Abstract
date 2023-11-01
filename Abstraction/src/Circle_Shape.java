
public class Circle_Shape
{
	float r=5;
	float area;
	
	public void display() 
	{
		area = 3.14f*r*r;
		System.out.println("Area of Circle "+area);
	}

	public static void main(String[] args)
	{
		Circle_Shape C = new Circle_Shape();
		C.display();

	}

}
