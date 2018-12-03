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
		List<LibraryItem> items = impl.sortByAuthor();
		for (LibraryItem  i : items) {
			System.out.print("sortByAuthor"+i.toString());
		}
		System.out.println();
		List<LibraryItem> items2 = impl.getByTitle("paper");
		for (LibraryItem  i : items2) {
			System.out.print("sortByAuthor   ===the key paper"+i.toString());
		}
		System.out.println();
		List<LibraryItem> items3 = impl.searchByAuthor("BB");
		for (LibraryItem  i : items3) {
			System.out.print("sortByAuthor   ===the key BB"+i.toString());
		}
		System.out.println();
		List<LibraryItem> items4 = impl.searchByContent("conten");
		for (LibraryItem  i : items4) {
			System.out.print("searchByContent ===the key conten"+i.toString());
		}
		System.out.println();
		List<LibraryItem> items5 = impl.sortByTitle();
		for (LibraryItem  i : items5) {
			System.out.print("sortByTitle ==="+i.toString());
		}
		
	}
	
}
