package Gather;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class BookList {
	public static void main(String[] args)
	{
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("00001", "book1", 38.3, "北京出版社"));
		books.add(new Book("00002", "book2", 45.2, "湖南出版社"));
		books.add(new Book("00003", "book3", 26.5, "浙江出版社"));
		
		Iterator it = books.iterator();
		while(it.hasNext())
		{
			Book book = (Book)it.next();
			System.out.println(book.getNumber() + " " + book.getName() + " " + book.getPrice() + " " + book.getPress());
		}
	}
}
