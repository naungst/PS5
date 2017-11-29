package pkgEmpty;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.junit.Test;
import pkgExceptions.BookException;
import pkgLibrary.Book;
import pkgLibrary.Catalog;

public class BookTest {

	@Test
	public void GetBookTest() throws BookException, pkgException.BookException {
		Catalog cat = pkgLibrary.Book.ReadXMLFile();
		Book Donavan = new Book(cat, "bk102");
		assertEquals("Oberon's Legacy",Donavan.getTitle());
	}
	
	@Test(expected = BookException.class)
	public void GetBookTestException() throws BookException, pkgException.BookException {
		Catalog cat = pkgLibrary.Book.ReadXMLFile();
		Book McNabb = new Book(cat, "bk103");
		assertEquals("Hamlet", McNabb.getTitle());	
	}
	
	@Test
	public void AddBookTest() throws Exception {
		Catalog cat = pkgLibrary.Book.ReadXMLFile();
		cat.AddBook(new Book("bk235","author","title","genre", 76.0, new Date(2009,10,8),
			"description", 14.00));
		Book Westbrook = new Book(cat, "bk235");
		assertEquals("author",Westbrook.getAuthor());
	}
		
	@Test(expected = BookException.class)
	public void AddBookTestException() throws Exception {
		Catalog cat = pkgLibrary.Book.ReadXMLFile();
		cat.AddBook(new Book("bk236","author","title","genre", 86.0, new Date(2002,6,18),
			"description", 27.00));
		Book Westbrook = new Book(cat, "bk236");
		assertEquals("author",Westbrook.getAuthor());
	}
}