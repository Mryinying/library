package hello.entity.book;

import java.util.List;

import hello.entity.LibraryItem;

/**
 * Book Class
 */
public class Book extends LibraryItem{
	
	private String author;
	
	private List<Chapter> chapters;
	
	public String getAuthor() {
		return author;
	}

	public List<Chapter> getChepters() {
		return chapters;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + getTitle() + ", chapters=" + chapters + "] \r\n";
	}
	
	
}
