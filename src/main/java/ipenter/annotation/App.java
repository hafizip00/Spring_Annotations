package ipenter.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new AnnotationConfigApplicationContext(Appconfig.class);
        Samsung s7 = factory.getBean(Samsung.class);
        s7.Config();
    }
}
