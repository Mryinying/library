package hello.utils;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import hello.entity.LibraryItem;
import hello.entity.book.Book;
import hello.entity.journal.Journal;
import hello.entity.newspaper.Newspaper;

public class XmlParseHandler extends DefaultHandler{
	
	private List<LibraryItem> items;
	private String currentTag; // 记录当前解析到的节点名称
	private String itemTag; // 记录当前item的节点名称
	private Book book;
	private Journal journal;
	private Newspaper newspaper;
	String value = null;
	
	@Override
	public void startDocument() throws SAXException {
		items = new ArrayList<>();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<" + qName +">");
//		if(attributes.getLength()==0)
//			System.out.print(">");
//		for (int i = 0; attributes != null && i < attributes.getLength(); i++) {
//			String attName = attributes.getQName(i);
//			String attValueString = attributes.getValue(i);
//			
//			if(localName.equals("book")){
//				System.out.print(" " + attName + "=" + attValueString);
//				System.out.print(">");
//			}
//			
//		}
		if("book".equals(qName)){
			itemTag = qName;
		}else if("journal".equals(qName)){
			itemTag = qName;
		}else if("newspaper".equals(qName)){
			itemTag = qName;
		}
		currentTag = qName;
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		if("book".equals(itemTag)){
			if("author".equals(currentTag)){
				book.setAuthor(value);
			}
			items.add(book);
		}else if("journal".equals(itemTag)){
			items.add(journal);
		}else if("newspaper".equals(itemTag)){
			items.add(newspaper);
		}
		currentTag = null;
		System.out.print("</" + qName + ">");
	}
	
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		System.out.print(new String(ch,start,length));
		value = new String(ch,start,length);
	}
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
	}
}
