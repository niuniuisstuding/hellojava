package hell;

public class Tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int price = 10000;
        double rate = 0.05;
        double total1 = price;
        for(int i = 0; i < 10; i++)
        	total1 *= (1 + rate);
        double total2 = total1, total3 = 0;
        for(int i = 0; i < 4; i++)
        {
        	total2 *= (1 + rate);
        	total3 += total2;
        }
        System.out.println(total1);
        System.out.println(total3);
	}

}
