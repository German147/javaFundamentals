package org.example.looselyCoupled;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({FIELD,TYPE,METHOD,PARAMETER})
public @interface TwentySevenDigits {
}
