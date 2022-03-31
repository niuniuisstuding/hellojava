package ClassAndObject;

public class EX9_11 {

	public static void main(String[] args) {
		EX9_8[] circleArray;
		circleArray = creatCircleArray();
		printCircleArray(circleArray);
	}
	public static EX9_8[] creatCircleArray()
	{
		EX9_8[] circleArray = new EX9_8[5];
		for(int i = 0; i < circleArray.length; i++)
		{
			circleArray[i] = new EX9_8(Math.random() * 100);
		}
		return circleArray;
	}
	public static void printCircleArray(EX9_8[] circleArray)
	{
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for(int i = 0; i < circleArray.length; i++)
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
		System.out.println("_____________________________________");
		System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray));
	}
	public static double sum(EX9_8[] circleArray)
	{
		double sum = 0;
		for(int i = 0; i < circleArray.length; i++)
		{
			sum += circleArray[i].getArea();
		}
		return sum;
	}
	
}
