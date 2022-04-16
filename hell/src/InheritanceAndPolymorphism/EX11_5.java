package InheritanceAndPolymorphism;

public class EX11_5 {
	public static void main(String[] args) {
		displayObject(new EX11_2(1, "red", false));
		displayObject(new EX11_3(1,1,"black",true));
	}
	public static void displayObject(EX11_1 object) {
		System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
	}
}
