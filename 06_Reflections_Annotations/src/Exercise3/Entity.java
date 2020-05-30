package Exercise3;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
public @interface Entity {
    public GenerationType generationType() default GenerationType.LOWER_CASE;
}
