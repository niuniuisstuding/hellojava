package ClassAndObjectTest;
import java.util.Scanner;
public class EX9_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入a,b,c的值:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		Quadratic quadratic = new Quadratic(a,b,c);
		if(quadratic.getDiscriminant() > 0 && 0 != a)
		{
			System.out.println("Root1 = " + quadratic.getRoot1());
			System.out.println("Root2 = " + quadratic.getRoot2());
		}
		else if(quadratic.getDiscriminant() == 0 || 0 == a)
			System.out.println("Root1 = Root2 = " + quadratic.getRoot1());
		else
			System.out.println("The equation has no roots");

	}

}
class Quadratic
{
	private int a;
	private int b;
	private int c;
	public Quadratic()
	{
		
	}
	public Quadratic(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA(){
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public int getDiscriminant()
	{
		if(this.b * this.b - 4 * this.a * this.c >= 0)
		    return this.b * this.b - 4 * this.a * this.c;
		else
			return -1;
	}
	public double getRoot1()
	{
		if(this.getDiscriminant() >= 0)
		{
			if(0 == this.a)
				return 1.0 * (-this.c) / this.b;
			return 1.0 * (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
		}
		else
			return 0;
	}
	public double getRoot2()
	{
		if(this.getDiscriminant() >= 0)
		{
			if(0 == this.a)
				return 1.0 * (-this.c) / this.b;
			return 1.0 * (-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
		}
		else
			return 0;
	}
	
}