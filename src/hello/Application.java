package hello;

import java.util.List;

import hello.entity.LibraryItem;
import hello.service.library.LibraryImpl;

/**
 * 程序入口
 */
public class Application {
	
	public static void main(String[] args) throws Exception {
		
		LibraryImpl impl = new LibraryImpl();
//		List<LibraryItem> items = impl.sortByAuthor();
//		List<LibraryItem> items2 = impl.getItems();
//		List<LibraryItem> items3 = impl.searchByAuthor("BB");
		List<LibraryItem> items4 = impl.searchByContent("sdasd");
		for (LibraryItem  i : items4) {
			System.out.print(i.toString());
		}
		
	}
	
}
