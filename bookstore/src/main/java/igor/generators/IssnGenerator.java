package igor.generators;
import igor.qualifiers.*;

import javax.inject.*;

import java.util.Random;
import java.util.logging.*;
import igor.interceptors.*;


@EightDigits
public class IssnGenerator implements NumberGenerator {
	@Inject
	private Logger logger;
	
	@Loggable
	public String generateNumber() {
		String issn = "8-" + Math.abs(new Random().nextInt());
		logger.info("Generated ISBN: " + issn);
		return issn;
	}

}
