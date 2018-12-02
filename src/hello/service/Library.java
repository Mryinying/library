package hello.service;

import java.util.List;

import hello.entity.LibraryItem;

public interface Library {
	
	/**
	 * 根據title查詢
	 * @param title
	 * @return
	 */
	List<LibraryItem> getByTitle(String title);
	
	/**
	 * 根據author查詢
	 * @param author
	 * @return
	 */
	List<LibraryItem> searchByAuthor(String author);
	
	/**
	 * 根據content查詢
	 * @param content
	 * @return
	 */
	List<LibraryItem> searchByContent(String content);
	
	/**
	 * 根據title排序
	 * @return
	 */
	List<LibraryItem> sortByTitle();
	
	/**
	 * 根據Author排序
	 * @return
	 */
	List<LibraryItem> sortByAuthor();
	
}
