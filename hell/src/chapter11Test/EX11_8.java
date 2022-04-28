package chapter11Test;

public class EX11_8 {
	public static void main(String[] args)
	{
		Account account = new Account(1122, 1000, "George");
		account.setAnnualInterestRate(1.5);
		account.withDraw(30);
		account.withDraw(40);
		account.withDraw(50);
		account.deposit(5);
		account.deposit(4);
		account.deposit(2);
		account.print();
	}
}
