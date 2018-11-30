package hello;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hello.entity.LibraryItem;
import hello.entity.book.Book;
import hello.entity.book.Chapter;
import hello.entity.journal.Article;
import hello.entity.journal.Journal;
import hello.entity.newspaper.Newspaper;
import hello.entity.newspaper.Story;
import hello.utils.XStreamUtil;

public class Application {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader bReader = new BufferedReader(new FileReader("src\\data2.xml"));
		StringBuffer sb = new StringBuffer();
		// 一行一行的写
        String strLine = null;
        while((strLine = bReader.readLine()) != null) {
        	sb.append(strLine);
        	
        }   
        bReader.close();
		List<LibraryItem> xmlToBean = XStreamUtil.xmlToBean(sb.toString(), List.class);
		
        List<LibraryItem> items  = new ArrayList<>();
//        
//        Book book = new Book();
//        book.setAuthor("AA");
//        Chapter chapter = new Chapter();
//        chapter.setChapter_content("sdasd");
//        List<Chapter> chapters  = new ArrayList<>();
//        chapters.add(chapter);
//        book.setChapters(chapters);
//        
//        Journal journal = new Journal() ;
//        List<Article> articles  = new ArrayList<>();
//        Article article = new Article();
//        article.setArticle_author("asdasd");
//        article.setArticle_title("sasdad");
//        articles.add(article);
//        
//        journal.setArticles(articles);
//        journal.setTitle("JJJJJJJJJJJJJ");
//        journal.setYear_publication("2010");
//        
//        
//        Newspaper newspaper = new Newspaper();
//        Story story = new Story();
//        story.setStory_author("story");
//        story.setStory_title("格林");
//        List<Story> stories = new ArrayList<>();
//        stories.add(story);
//        newspaper.setDate_publication(new Date());
//        newspaper.setTitle("newspaper");
//        newspaper.setStories(stories);
//        
//        items.add(newspaper);	
//        items.add(book);
//        items.add(journal);
//        String beanToXml = XStreamUtil.beanToXml(items);
//        System.out.println(beanToXml);
		
	}
	
}
