package Gather;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class StudentTreeSet {
	public static void main(String[] args)
	{
		Set<Student> stus = new TreeSet<Student>();
		Scanner input = new Scanner(System.in);
		
		String number = input.next(), name;
		int age = 0;
		
		while(!number.equals("exit"))
		{
			name = input.next();
			age = input.nextInt();
			stus.add(new Student(number, name, age));
			number = input.next();
		}
		
		Iterator<Student> it = stus.iterator();
		while(it.hasNext())
		{
			Student stu = (Student)it.next();
			System.out.println(stu.getNumber() + " " + stu.getName() + " " + stu.getAge());
		}
	}
}
