package hello.entity;

public abstract class LibraryItem {
	
	private String title;
	
	/**
	 * 第一作者
	 */
	private String author;
	
	/**
	 * 书籍类型 1,Book 2,Journal,3,Newspaper
	 */
	private int type;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
}
