package igor.generators;

import javax.enterprise.inject.Alternative;

import igor.qualifiers.*;

import java.util.Random;
import java.util.logging.*;

import javax.inject.*;

import igor.interceptors.*;

@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator{
	@Inject
	private Logger logger;
	
	@Loggable
	public String generateNumber(){
		String mock = "MOCK-" + Math.abs(new Random().nextInt());
		logger.info("Generated Mock: " + mock);
		return mock;
	}
}
