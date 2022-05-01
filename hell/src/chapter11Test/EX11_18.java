package chapter11Test;
import java.util.Scanner;
public class EX11_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of the objects: ");
		int n = input.nextInt();
		
		int[]arr = new int[1000];
		int[]brr = new int[1000];
		System.out.print("Enter the weights of the objects: ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = 10;
			brr[i] = input.nextInt();
		}
		for(int i = 0; i < n; i++)
		{
			int count = 0;
			for(int j = 0; j < n; j++)
			{
				if(arr[i] - brr[j] >= 0)
				{
					arr[i] -= brr[j];
					if(0 == count)
					{
						System.out.print("Container " + (i + 1) + " contains objects with weight " + brr[j]);
						count++;
					}
					else
						System.out.print(" " + brr[j]);
					brr[j] = 11;
				}
			}
			System.out.println();
		}
	}

}
