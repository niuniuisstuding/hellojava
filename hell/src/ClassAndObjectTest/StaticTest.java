package ClassAndObjectTest;

public class StaticTest {
	int i = 10;
	int j = 20;
	static{
		System.out.println("Static cood");
		StaticTest w = new StaticTest();
		System.out.println(w.i);
	}
	{
		System.out.println("实例代码块");
	}
	public StaticTest()
	{
		System.out.println("无参构造方法");
	}

	public static void main(String[] args) {
		System.out.println("main begin");
		StaticTest w1 = new StaticTest();
		System.out.println(w1.j);
		System.out.println("main over");

	}

}
