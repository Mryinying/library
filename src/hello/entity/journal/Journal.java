package hello.entity.journal;

import java.util.List;

import hello.entity.LibraryItem;

/**
 * Journal Class
 */
public class Journal extends LibraryItem {
	
	
	private String year_publication;
	
	private String volume_no;
	
	private List<Article> articles ;


	public String getYear_publication() {
		return year_publication;
	}

	public String getVolume_no() {
		return volume_no;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setYear_publication(String year_publication) {
		this.year_publication = year_publication;
	}

	public void setVolume_no(String volume_no) {
		this.volume_no = volume_no;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "Journal [ author=" + getAuthor() + ", title=" + getTitle() + ",year_publication=" + year_publication + ", volume_no=" + volume_no + ", articles=" + articles
				+ "] \r\n";
	}
	
}
