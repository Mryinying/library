package hello.entity.book;

import java.util.List;

import hello.entity.LibraryItem;

/**
 * Book Class
 */
public class Book extends LibraryItem{
	
	private String title;
	
	private String author;
	
	private List<Chapter> chapters;
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}

	public List<Chapter> getChepters() {
		return chapters;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", chapters=" + chapters + "]";
	}
	
}
