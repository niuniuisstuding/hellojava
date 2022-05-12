package Gather;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class BookHashMap {
	public static void main(String[] args)
	{
		Map<String,Book> books = new HashMap<String, Book>();
		books.put("book1",new Book("00001", "book1", 38.3, "北京出版社"));
		books.put("book2",new Book("00002", "book2", 45.2, "湖南出版社"));
		books.put("book3",new Book("00003", "book3", 26.5, "浙江出版社"));
		
		Iterator iter = books.entrySet().iterator();
		while(iter.hasNext())
		{
			Map.Entry entry = (Map.Entry)iter.next();
			System.out.println(((Book) entry.getValue()).getNumber() + " " + ((Book) entry.getValue()).getName() + " " 
					+ ((Book) entry.getValue()).getPrice() + " " + ((Book) entry.getValue()).getPress());
		}
	}
}
