package chapter11Test;
import java.util.Date;
import java.util.ArrayList;
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private String name;
	private ArrayList<String>transactions = new ArrayList<>(); 
	
	public Account()
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	public Account(int id, double balance, String name)
	{
		this.id = id;
		this.balance = balance;
		this.name = name;
		dateCreated = new Date();
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated()
	{
		return dateCreated;
	}
	public double getMonthlyInterestRate()
	{
		return annualInterestRate / 12;
	}
	public double getMonthly()
	{
		return getMonthlyInterestRate() / 100 * balance;
	}
	public void withDraw(double value)
	{
		balance -= value;
		String str = getDateCreated().toString() + " withdtaw " + value + "余额" + balance;
		transactions.add(str); 
	}
	public void deposit(double value)
	{
		balance += value;
		String str = getDateCreated().toString() + " deposit " + value + "余额" + balance;
		transactions.add(str);
	}
	public void print()
	{
		for(int i = 0; i < transactions.size(); i++)
		{
			System.out.println(transactions.get(i));
			System.out.println();
		}
	}
}
