package hello;

import java.util.List;
import java.util.Scanner;

import hello.entity.LibraryItem;
import hello.service.library.LibraryImpl;

/**
 * 程序入口
 */
public class Application {
	
	public static void main(String[] args) throws Exception {
		
		LibraryImpl impl = new LibraryImpl();
		
		System.out.print("Input Author：");
		Scanner Sc = new Scanner(System.in);
		String key = Sc.nextLine();
		List<LibraryItem> items3 = impl.searchByAuthor(key);
		if(items3.size()<=0) {
			System.out.println("searchByAuthor("+key+"). result is null");
		}
		for (LibraryItem  i : items3) {
			System.out.print("searchByAuthor("+key+"). result is "+i.toString());
		}
		System.out.println();
		
		System.out.print("Input Content：");
		key = Sc.nextLine();
		List<LibraryItem> items4 = impl.searchByContent(key);
		if(items4.size()<=0) {
			System.out.println("searchByContent("+key+"). result is null");
		}
		for (LibraryItem  i : items4) {
			System.out.print("searchByContent("+key+"). result is "+i.toString());
		}
		System.out.println();
		
		System.out.print("Input Title：");
		key = Sc.nextLine();
		List<LibraryItem> items2 = impl.getByTitle(key);
		if(items2.size()<=0) {
			System.out.println("getByTitle("+key+"). result is null");
		}
		for (LibraryItem  i : items2) {
			System.out.print("getByTitle("+key+"). result is "+i.toString());
		}
		System.out.println();
		
		System.out.print("sortByAuthor (y/n):");
		key = Sc.nextLine();
		if(key.equals("y")) {
			List<LibraryItem> items = impl.sortByAuthor();
			for (LibraryItem  i : items) {
				System.out.print("sortByAuthor"+i.toString());
			}
			System.out.println();
		}
		
		System.out.print("sortByTitle (y/n):");
		key = Sc.nextLine();
		if(key.equals("y")) {
			List<LibraryItem> items5 = impl.sortByTitle();
			for (LibraryItem  i : items5) {
				System.out.print("sortByTitle ==="+i.toString());
			}
		}
		Sc.close();
	}
	
}
