package hell;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;
		//��һ�ַ���
		/*for(int i = 0; i < 32; i++)
		{
			if(((n >> i) & 1) == 1)
				count++;
		}*/
		//�ڶ��֣��Ż��汾
		while(n != 0)
		{
			n = n & (n - 1);
			count++;
		}
		System.out.println(count);
	}
}
