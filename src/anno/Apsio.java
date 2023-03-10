package anno;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.CONSTRUCTOR, ElementType.TYPE,ElementType.FIELD,ElementType.PARAMETER })
@Documented // mettre notation dans la javadoc
@Inherited //utilisation implicite sur les classes filles
@Retention(RetentionPolicy.RUNTIME) // RunTime == présent en mémoire
public @interface Apsio {
    String value() default "inconnu";
    int annee() default 2007;
}
