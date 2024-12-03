
//simple program showing annotations in java @author as an example
//needs import on other packages with import src.Annotation.annotation_author;

package annotation;


//interface necessary to set it as annotation
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



// annotation 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface author {


    String name();
}