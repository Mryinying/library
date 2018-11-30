package hello.service;

import java.util.List;

import hello.entity.LibraryItem;

public interface Library {
	
	List<LibraryItem> getByTitle(String title);
	
	List<LibraryItem> searchByAuthor(String author);
	
	List<LibraryItem> searchByContent(String content);
	
	List<LibraryItem> sortByTitle();
	
	List<LibraryItem> sortByAuthor();
	
}
