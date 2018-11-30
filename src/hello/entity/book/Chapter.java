package hello.entity.book;


/**
 * Chapter Class
 */
public class Chapter {
	
	private String chapter_name;
	
	private String chapter_no;
	
	private String chapter_content;
	
	public String getChapter_name() {
		return chapter_name;
	}

	public String getChapter_no() {
		return chapter_no;
	}
	
	public String getChapter_content() {
		return chapter_content;
	}
	
	public void setChapter_name(String chapter_name) {
		this.chapter_name = chapter_name;
	}

	public void setChapter_no(String chapter_no) {
		this.chapter_no = chapter_no;
	}

	public void setChapter_content(String chapter_content) {
		this.chapter_content = chapter_content;
	}

	@Override
	public String toString() {
		return "Chapter [chapter_name=" + chapter_name + ", chapter_no=" + chapter_no + ", chapter_content="
				+ chapter_content + "]";
	}
}
