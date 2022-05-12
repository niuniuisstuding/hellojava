package Gather;

public class Book {
	private String number;
	private String name;
	private double price;
	private String press;
	
	public Book() {}
	public Book(String number, String name, double price, String press)
	{
		this.number = number;
		this.name = name;
		this.price = price;
		this.press = press;
	}
	
	//number
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//price
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//press
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	
	
}
