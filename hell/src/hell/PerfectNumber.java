package hell;

public class PerfectNumber {

	//5.33
	public static void main(String[] args) {
		for(int i = 2; i < 10000; i++)
		{
			int sum = 0;
			for(int j = 1; j < i; j++)
			{
				if(i % j == 0)
					sum += j;
			}
			if(sum == i)
				System.out.println(i);
		}
	}

}
