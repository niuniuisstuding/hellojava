package hell;
import java.util.Scanner;

public class EX73 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[101];
		int a = 0;
		while((a = input.nextInt()) != 0)
		{
			arr[a]++;
		}
		for(int i = 1; i <= 100; i++)
		{
			if(arr[i] != 0)
				System.out.println(i + " occurs " + arr[i] + " times");
		}
	}

}
