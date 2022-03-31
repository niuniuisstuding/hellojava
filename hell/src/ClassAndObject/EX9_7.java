package ClassAndObject;

public class EX9_7 {

	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of  Circle objects is " + EX9_6.numberOfObjects);
		
		EX9_6 c1 = new EX9_6();
		System.out.println("\nAfter creating objects");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects ("+ c1.numberOfObjects + ")");
		
		EX9_6 c2 = new EX9_6(5);
		c1.radius = 9;
		
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects ("+ c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects ("+ c2.numberOfObjects + ")");
	}

}
