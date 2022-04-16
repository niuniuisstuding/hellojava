package InheritanceAndPolymorphism;

public class EX11_3 extends EX11_1{
	private double width;
	private double height;
	
	public EX11_3() {
	}
	public EX11_3(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public EX11_3(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return 2 * (width + height);
	}
}
