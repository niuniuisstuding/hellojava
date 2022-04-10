package ClassAndObjectTest;
import java.util.Scanner;
import java.util.Date;
import java.util.Random;
public class EX9_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int[] arr = new int[100000];
		for(int i = 0; i < 100000; i++)
			arr[i] = random.nextInt();
		StopWatch watch = new StopWatch();
		watch.start();
		for(int i = 0; i < 100000 - 1; i++)
		{
			for(int j = 0; j < 9999 - i; j++)
			{
				if(arr[i] > arr[i + 1])
				{
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		watch.stop();
		System.out.println(watch.getElapsedTime());
	}

}
class StopWatch{
	private long startTime, endTime;
	//构造方法，初始化startTime
	public StopWatch() {
		Date date1 = new Date();
		this.startTime = date1.getTime();
	}
	public void start() {
		Date date2 =  new Date();
		this.startTime = date2.getTime(); 
	}
	public void stop() {
		Date date3 = new Date();
		this.endTime = date3.getTime();
	}
	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}
}
