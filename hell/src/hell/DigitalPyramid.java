package hell;
import java.util.Scanner;

public class DigitalPyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个1-15间的整数： ");
		int n = input.nextInt();
		for(int i = 1; i <= n; i++)
		{
			for(int j = 0; j < 2 *(n - i); j++)
				System.out.print(" ");
			if(i == 1)
				System.out.print(i);
			else
			{
				for(int k = i; k >= 1; k--)
					System.out.print(k + " ");
				for(int h = 2; h <= i; h++)
					System.out.print(h + " ");
			}
			System.out.println();
		}

	}

}
