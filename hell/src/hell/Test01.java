package hell;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;
		//第一种方法
		/*for(int i = 0; i < 32; i++)
		{
			if(((n >> i) & 1) == 1)
				count++;
		}*/
		//第二种，优化版本
		while(n != 0)
		{
			n = n & (n - 1);
			count++;
		}
		System.out.println(count);
	}
}
