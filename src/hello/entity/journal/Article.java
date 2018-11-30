package hello.entity.journal;


/**
 * Article Class
 */
public class Article {
	
	private String article_author;
	
	private String article_title;
	
	private String article_content;

	public String getArticle_author() {
		return article_author;
	}

	public String getArticle_title() {
		return article_title;
	}

	public String getArticle_content() {
		return article_content;
	}

	public void setArticle_author(String article_author) {
		this.article_author = article_author;
	}

	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}

	public void setArticle_content(String article_content) {
		this.article_content = article_content;
	}

	@Override
	public String toString() {
		return "Article [article_author=" + article_author + ", article_title=" + article_title + ", article_content="
				+ article_content + "]";
	}
	
}
