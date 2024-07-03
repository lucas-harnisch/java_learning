
//simple program showing annotations in java @author as an example
//needs import on other packages with import src.Annotation.annotation_author;

package src.Annotation;


//interface necessary to set it as annotation
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



// annotation 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface annotation_author {


    String name();
}