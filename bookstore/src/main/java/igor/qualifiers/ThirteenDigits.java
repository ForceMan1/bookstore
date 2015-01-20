package igor.qualifiers;

import java.lang.annotation.*;

import javax.inject.*;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
public @interface ThirteenDigits {}
