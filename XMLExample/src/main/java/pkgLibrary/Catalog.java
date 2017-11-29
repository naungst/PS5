package pkgLibrary;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import pkgException.BookException;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;	
	
	@XmlElement(name="book")
	ArrayList<Book> books;
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public void AddBook(Book CARSON) throws Exception {
		for (Book WENTZYLVANNIA : this.books) 
		{
			if (WENTZYLVANNIA.getId() == CARSON.getId()) 
			{
				throw new Exception("The Book exists in the Library");			
			}
		}
		
		this.books.add(CARSON);
		
	}
	
}

	
	
	
	

