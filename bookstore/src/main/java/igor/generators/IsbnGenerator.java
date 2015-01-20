package igor.generators;
import javax.inject.*;
import java.util.logging.*;
import igor.qualifiers.*;
import igor.interceptors.*;
import java.util.*;

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator{
	@Inject
	private Logger logger;
	
	@Loggable
	public String generateNumber() {
		String isbn = "13-84356-" + Math.abs(new Random().nextInt());
		return isbn;
	}

}
