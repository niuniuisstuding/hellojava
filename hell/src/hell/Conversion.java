package hell;
import java.util.Scanner;

public class Conversion {

	//5.37
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入一个十进制整数： ");
	int n = input.nextInt();
	conversionToTwo(n);

	}
	public static void conversionToTwo(int n)
	{
		if(n == 0 || n == 1)
			System.out.print(n);
		else
		{
			conversionToTwo(n / 2);
			System.out.print(n % 2);
		}
	}

}
