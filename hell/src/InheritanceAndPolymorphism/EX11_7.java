package InheritanceAndPolymorphism;

public class EX11_7 {
	public static void main(String[] args) {
		Object object1 = new EX11_2(1);
		Object object2 = new EX11_3(1,1);
		
		displayObject(object1);
		displayObject(object2);
	}
	public static void displayObject(Object object) {
		if(object instanceof EX11_2)
		{
			System.out.println("The circle area is " + ((EX11_2)object).getArea());
			System.out.println("The circle diameter is " + ((EX11_2)object).getDiameter());
		}
		else if(object instanceof EX11_3) {
			System.out.println("The rectangle area is " + ((EX11_3)object).getArea());
		}
	}
}
