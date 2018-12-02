package hello.entity.newspaper;

public class Story {
	
	private String story_author;
	
	private String story_title;
	
	private String content;

	public String getStory_author() {
		return story_author;
	}

	public String getStory_title() {
		return story_title;
	}

	public String getStory_content() {
		return content;
	}

	public void setStory_author(String story_author) {
		this.story_author = story_author;
	}

	public void setStory_title(String story_title) {
		this.story_title = story_title;
	}

	public void setStory_content(String story_content) {
		this.content = story_content;
	}

	@Override
	public String toString() {
		return "Story [story_author=" + story_author + ", story_title=" + story_title + ", story_content="
				+ content + "]";
	}
	
}
