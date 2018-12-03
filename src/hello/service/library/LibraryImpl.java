package hello.service.library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import hello.entity.LibraryItem;
import hello.entity.book.Book;
import hello.entity.book.Chapter;
import hello.entity.journal.Article;
import hello.entity.journal.Journal;
import hello.entity.newspaper.Newspaper;
import hello.entity.newspaper.Story;
import hello.service.Library;
import hello.utils.XStreamUtil;

public class LibraryImpl implements Library{
	
	private static List<LibraryItem> items ;
	
	/**
	 * 数据放在ArrayList  自己拼装数据
	 */
//	static {
//      
//      Book book = new Book();
//      book.setAuthor("AA");
//      Chapter chapter = new Chapter();
//      chapter.setChapter_content("sdasd");
//      List<Chapter> chapters  = new ArrayList<>();
//      chapters.add(chapter);
//      book.setChapters(chapters);
//      
//      Journal journal = new Journal() ;
//      List<Article> articles  = new ArrayList<>();
//      Article article = new Article();
//      article.setArticle_author("asdasd");
//      article.setArticle_title("sasdad");
//      articles.add(article);
//      
//      journal.setArticles(articles);
//      journal.setTitle("JJJJJJJJJJJJJ");
//      journal.setYear_publication("2010");
//      
//      
//      Newspaper newspaper = new Newspaper();
//      Story story = new Story();
//      story.setStory_author("story");
//      story.setStory_title("格林");
//      List<Story> stories = new ArrayList<>();
//      stories.add(story);
//      newspaper.setDate_publication(new Date());
//      newspaper.setTitle("newspaper");
//      newspaper.setStories(stories);
//      
//      items.add(newspaper);	
//      items.add(book);
//      items.add(journal);
//	}
	
	/**
	 * 从data.xml里读取图书信息  要添加 删除在data里进行修改
	 */
	static {
		BufferedReader bReader;
		try {
			bReader = new BufferedReader(new FileReader(LibraryImpl.class.getClassLoader().getResource("").getPath().substring(1)+"\\data.xml"));
			StringBuffer sb = new StringBuffer();
			// 一行一行的写
			String strLine = null;
			while((strLine = bReader.readLine()) != null) {
				sb.append(strLine);
				
			}   
			bReader.close();
			items = XStreamUtil.xmlToBean(sb.toString(), List.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<LibraryItem> getItems() throws Exception{
		return items;
	}
	
	@Override
	public String toString() {
		return "LibraryImpl [items=" + items + "]";
	}

	@Override
	public List<LibraryItem> getByTitle(String title) {
		List<LibraryItem> selectItems = new ArrayList<>();
		for (LibraryItem i : items) {
			if(i.getTitle().contains(title)) {
				selectItems.add(i);
			}
		}
		return selectItems;
	}

	@Override
	public List<LibraryItem> searchByAuthor(String author) {
		List<LibraryItem> selectItems = new ArrayList<>();
		for (LibraryItem i : items) {
			if (i.getType()==1) {
				Book book = (Book)i;
				if(book.getAuthor().contains(author)) {
					selectItems.add(i);
				}
			}else if(i.getType()==2) {
				Journal journal = (Journal)i;
				List<Article> articles = journal.getArticles();
				for (Article a : articles) {
					if(a.getArticle_author().contains(author)) {
						selectItems.add(i);
					}
				}
			}else if(i.getType()==3) {
				Newspaper newspaper = (Newspaper)i;
				List<Story> stories = newspaper.getStories();
				for (Story s : stories) {
					if(s.getStory_author().contains(author)) {
						selectItems.add(i);
					}
				}
			}
		}
		return selectItems;
	}

	@Override
	public List<LibraryItem> searchByContent(String content) {
		
		List<LibraryItem> selectItems = new ArrayList<>();
		for (LibraryItem i : items) {
			if (i.getType()==1) {
				Book book = (Book)i;
				List<Chapter> chepters = book.getChepters();
				for (Chapter c : chepters) {
					if(c.getChapter_content().contains(content) && !selectItems.contains(i)) {
						selectItems.add(i);
					}
				}
			}else if(i.getType()==2) {
				Journal journal = (Journal)i;
				List<Article> articles = journal.getArticles();
				for (Article a : articles) {
					if(a.getArticle_content().contains(content) && !selectItems.contains(i)) {
						selectItems.add(i);
					}
				}
			}else if(i.getType()==3) {
				Newspaper newspaper = (Newspaper)i;
				List<Story> stories = newspaper.getStories();
				for (Story s : stories) {
					if(s.getStory_content().contains(content) && !selectItems.contains(i)) {
						selectItems.add(i);
					}
				}
			}
		}
		return selectItems;
	}

	@Override
	public List<LibraryItem> sortByTitle() {
		items.sort(new Comparator<LibraryItem>() { 
			// 排序
			@Override
			public int compare(LibraryItem o1, LibraryItem o2) {
				if (o1.getTitle() != null && o2.getTitle() != null) {
					return o1.getTitle().compareTo(o2.getTitle());
				} else {
					return -1;
				}
			}
		});
		return items;
	}

	@Override
	public List<LibraryItem> sortByAuthor() {
		
		for (LibraryItem i : items) {
			if (i.getType()==1) {
				Book book = (Book)i;
				//第一作者就是Book作者
				i.setAuthor(book.getAuthor());
			}else if(i.getType()==2) {
				Journal journal = (Journal)i;
				List<Article> articles = journal.getArticles();
				articles.sort(new Comparator<Article>() { 
					// 排序
					@Override
					public int compare(Article o1, Article o2) {
						if (o1.getArticle_author() != null && o2.getArticle_author() != null) {
							return o1.getArticle_author().compareTo(o2.getArticle_author());
						} else {
							return -1;
						}
					}
				});
				//第一作者是Article排序第一的作者
				i.setAuthor(journal.getArticles().get(0).getArticle_author());
			}else if(i.getType()==3) {
				Newspaper newspaper = (Newspaper)i;
				List<Story> stories = newspaper.getStories();
				stories.sort(new Comparator<Story>() { 
					// 排序
					@Override
					public int compare(Story o1, Story o2) {
						if (o1.getStory_author() != null && o2.getStory_author() != null) {
							return o1.getStory_author().compareTo(o2.getStory_author());
						} else {
							return -1;
						}
					}
				});
				//第一作者是Story排序第一的作者
				i.setAuthor(newspaper.getStories().get(0).getStory_author());
			}
		}
		items.sort(new Comparator<LibraryItem>() { 
			// 排序
			@Override
			public int compare(LibraryItem o1, LibraryItem o2) {
				if (o1.getTitle() != null && o2.getTitle() != null) {
					return o1.getAuthor().compareTo(o2.getAuthor());
				} else {
					return -1;
				}
			}
		});
		return items;
	}
	
	
	
}
