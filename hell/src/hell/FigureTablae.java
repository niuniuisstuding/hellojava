package hell;

public class FigureTablae {

	//5.19
	public static void main(String[] args) {
		for(int i = 1; i <= 8; i++)
		{
			for(int j = 0; j < (8 - i); j++)
				System.out.print(" ");
			if(i == 1)
				System.out.print(i);
			else
			{
				int sum = 1;
				for(int k = 1; k < i; k++)
					sum *= 2;
				for(int g = 1; g <= sum; g *= 2)
					System.out.print(g + " ");
				for(int c = sum / 2; c >= 1; c /= 2)
					System.out.print(c + " ");
			}
			System.out.println();
		}
	}

}
