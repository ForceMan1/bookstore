package igor.test;
import static org.junit.Assert.assertTrue;
import igor.Book;
import igor.services.BookService;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.*;

public class BookServiceIT {
	@Test
	public void shouldCheckNumberIsMock(){
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		BookService bookService = container.instance().select(BookService.class).get();
		Book book = bookService.createBook("Second book", 50f, "Testing book");
		assertTrue(book.getNumber().startsWith("MOCK"));
		System.out.println(book);
		weld.shutdown();
	}
	
}
