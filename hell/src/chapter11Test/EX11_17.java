package chapter11Test;
import java.util.Scanner;
public class EX11_17 {
	public static void main(String[] args)
	{
		System.out.print("Enter an integer m:");
		Scanner input = new Scanner(System.in);
		int m = input.nextInt(), n = 1;
		int temp = m;
		for(int i = 2; i <= m; i++)
		{
			int count = 0;
			if(m % i == 0)
			{
				while(m % i == 0)
				{
					count++;
					m /= i;
				}
				if(1 == count % 2)
					n *= i;
			}
		}
		System.out.println("The smallest number n for m * n to be a perfect square is " + n);
		System.out.println("m * n is " + temp * n);
	}
}
