package Test;
import java.util.Scanner;
public class PointMain{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		Point p1 = new Point(x1,y1);
		Point p2 = new Point(x2,y2);
		System.out.printf("%.2f\n", p1.distance(p2));
		System.out.printf("%.2f\n",Point.distance(p1, p2));
	}
}
class Point{
	private double x, y;
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double distance(Point point) {
		return Math.sqrt((this.x - point.getX()) * (this.x - point.getX()) + (this.y - point.getY()) * (this.y - point.getY()));
	}
	public static double distance(Point point1, Point point2) {
		return Math.sqrt((point1.getX() - point2.getX()) * (point1.getX() - point2.getX()) + (point1.getY() - point2.getY()) * (point1.getY() - point2.getY()));
	}
}