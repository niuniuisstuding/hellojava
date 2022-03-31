package ClassAndObject;

public class EX9_8 {
	private double radius = 1;
	private static int numberOfObject = 0;
	public EX9_8()
	{
		numberOfObject++;
	}
	public EX9_8(double newRadius)
	{
		radius = newRadius;
		numberOfObject++;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double newRadius)
	{
		radius = (newRadius >= 0)?newRadius:0;
	}
	public static int getNumberOfObject()
	{
		return numberOfObject;
	}
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
}
