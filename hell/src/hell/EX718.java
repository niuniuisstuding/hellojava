package hell;
import java.util.Scanner;

public class EX718 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] arr = new double[10];
		for(int i = 0; i < 10; i++)
			arr[i] = input.nextDouble();
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 9 - i; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for(double val : arr)
			System.out.print(val + " ");

	}

}
