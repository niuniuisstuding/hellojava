package ClassAndObject;

public class EX9_9 {

	public static void main(String[] args) {
		EX9_8 myCircle = new EX9_8(5.0);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		System.out.println("The number of objects created is " + EX9_8.getNumberOfObject());		
	}

}
