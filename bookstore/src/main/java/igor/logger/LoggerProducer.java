package igor.logger;
import java.util.logging.*;

import javax.enterprise.inject.*;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggerProducer {
	@Produces
	public Logger produceLogger(InjectionPoint injectionPoint){
		 return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
	}
}
