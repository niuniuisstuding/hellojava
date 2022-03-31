package ClassAndObject;

public class EX9_10 {

	public static void main(String[] args) {
		EX9_8 myCircle = new EX9_8(1);
		
		int n = 5;
		printAreas(myCircle, n);
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);
	}
	public static void printAreas(EX9_8 c, int times)
	{
		System.out.println("Radius \t\tArea");
		while(times >= 1)
		{
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}

}
