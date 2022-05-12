package Gather;

public class Student implements Comparable{
	private String number;
	private String name;
	private int age;
	
	public Student() {}
	public Student(String number, String name, int age) 
	{
		this.number = number;
		this.name = name;
		this.age = age;
	}
	public String getNumber() 
	{
		return number;
	}
	public void setNumber(String number)
	{
		this.number = number;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int compareTo(Object o)
	{
		if(!(o instanceof Student))
		{
			throw new RuntimeException("不是Student对象");
		}
		Student s = (Student)o;
		if(this.age > s.age)
			return 1;
		else if(this.age == s.age)
			return this.name.compareTo(s.name);
		else
			return -1;
	}
}
