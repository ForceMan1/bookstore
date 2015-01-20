package igor.services;
import igor.interceptors.*;
import igor.qualifiers.*;
import igor.generators.*;
import javax.inject.*;
import igor.Book;

@Loggable
public class BookService {
	@Inject @ThirteenDigits
	private NumberGenerator numberGenerator;
	
	public Book createBook(String title, Float price, String description){
		Book book = new Book(title, price, description);
		book.setNumber(numberGenerator.generateNumber());
		return book;
	}
	

}
