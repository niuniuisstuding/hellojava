package ClassAndObject;

public class EX9_2 {
	public static void main(String[] args)
	{
		EX9_2 circle1 = new EX9_2();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
		
		EX9_2 circle2 = new EX9_2(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
		
		EX9_2 circle3 = new EX9_2(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
		
		circle2.radius = 100;//circle2.setRadius(100);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
	}
	
	double radius;
	EX9_2()
	{
		radius = 1;
	}
	EX9_2(double newRadius)
	{
		radius = newRadius;
	}
	double getArea()
	{
		return radius * radius * Math.PI;
	}
	double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}
	void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	

}
