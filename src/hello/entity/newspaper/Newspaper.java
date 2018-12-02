package hello.entity.newspaper;

import java.util.Date;
import java.util.List;

import hello.entity.LibraryItem;

public class Newspaper extends LibraryItem{
	
	private Date date_publication;
	
	private List<Story> stories;
	
	public Date getDate_publication() {
		return date_publication;
	}
	
	public List<Story> getStories() {
		return stories;
	}
	
	public void setDate_publication(Date date_publication) {
		this.date_publication = date_publication;
	}

	public void setStories(List<Story> stories) {
		this.stories = stories;
	}

	@Override
	public String toString() {
		return "Newspaper [author=" + getAuthor() + ", title=" + getTitle() + ",date_publication=" + date_publication + ", stories=" + stories 
				+ "]\r\n";
	}
	
	
}
