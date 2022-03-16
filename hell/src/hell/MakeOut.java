package hell;

public class MakeOut {

	//5.25
	public static void main(String[] args) {
		double pi = 0;
		double sign = 1.0;
		for(int i = 1; i <=(2* 100000 - 1); i += 2)
		{
			pi += sign / i;
			sign = -sign;
			if(i ==(2 * 10000 - 1))
				System.out.println(4 * pi);
			else if(i ==(2 * 20000 - 1))
				System.out.println(4 * pi);
			else if(i ==(2 * 30000 - 1))
				System.out.println(4 * pi);
			else if(i ==(2 * 40000 - 1))
				System.out.println(4 * pi);
			else if(i ==(2 * 50000 - 1))
				System.out.println(4 * pi);
			else if(i ==(2 * 60000 - 1))
				System.out.println(4 * pi);
			else if(i ==(2 * 70000 - 1))
				System.out.println(4 * pi);
			else if(i ==(2 * 80000 - 1))
				System.out.println(4 * pi);
			else if(i ==(2 * 90000 - 1))
				System.out.println(4 * pi);
			else if(i ==(2 * 100000 - 1))
				System.out.println(4 * pi);
		}
		/*for(int i = 10000; i <= 100000; i+=10000)
		{
			pi = 0;
			for(int j = 1; j <= i; j++)
			{
				if(j % 2 != 0)
					pi = -1.0 / (2 * j - 1);
				else
					pi = 1.0 / (2 * j - 1);
			}
			System.out.println(4 * pi);
		}*/
	}

}
