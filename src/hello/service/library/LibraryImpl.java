package hello.service.library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import hello.entity.LibraryItem;
import hello.service.Library;

public class LibraryImpl implements Library{
	
	static Document doc = null; 
	
	private List<LibraryItem> items ;

	public List<LibraryItem> getItems() throws SAXException, IOException, ParserConfigurationException {
		
	  //加载XML文件:文件放在根目录下
	  InputStream is = new FileInputStream("xml\\data.xml");
	  doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
	  
	  // 按文档顺序返回包含在文档中且具有给定标记名称的所有Element的NodeList
	  NodeList nl = doc.getElementsByTagName("context-param");
	  // 返回NodeList中的某一个节点
	  Node n = nl.item(0);
	  // 获取节点的值
	  String returns = n.getFirstChild().getNodeValue();
		
	  return items;
	}
	
	public void setItems(List<LibraryItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "LibraryImpl [items=" + items + "]";
	}

	@Override
	public List<LibraryItem> getByTitle(String title) {
		return null;
	}

	@Override
	public List<LibraryItem> searchByAuthor(String author) {
		return null;
	}

	@Override
	public List<LibraryItem> searchByContent(String content) {
		return null;
	}

	@Override
	public List<LibraryItem> sortByTitle() {
		return null;
	}

	@Override
	public List<LibraryItem> sortByAuthor() {
		return null;
	}
	
	
	
}
