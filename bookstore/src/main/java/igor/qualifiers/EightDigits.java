package igor.qualifiers;
import javax.accessibility.*;

import java.lang.annotation.*;

import javax.inject.*;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
public @interface EightDigits {}
