package igor.interceptors;
import javax.interceptor.*;
import javax.inject.*;
import java.util.logging.*;

@Interceptor
@Loggable
public class LoggingInterceptors {
	@Inject
	private Logger  logger;
	
	@AroundInvoke
	public Object logMethod(InvocationContext ic) throws Exception {
		logger.entering(ic.getTarget().getClass().getName(), ic.getMethod().getName());
		try {
			return ic.proceed();
		}finally {
			logger.exiting(ic.getTarget().getClass().getName(), ic.getMethod().getName());
			System.out.println("Method " + ic.getMethod().getName() + " is invoked.");
		}
	}
	

}
