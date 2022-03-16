package hell;
import java.util.Scanner;

public class Conversion2 {

	//5.38
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入一个十进制整数： ");
	int n = input.nextInt();
	conversionToEight(n);

	}
	public static void conversionToEight(int n)
	{
		if(n < 8)
			System.out.print(n);
		else
		{
			conversionToEight(n / 8);
			System.out.print(n % 8);
		}
	}

}
