import com.google.inject.Guice;
import com.google.inject.Injector;

/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'sam' at '2/8/16 9:03 PM' with Gradle 2.10
 *
 * @author sam, @date 2/8/16 9:03 PM
 */
public class Application {
    public static void main(String... args) {
        Injector injector = Guice.createInjector(new ApplicationModule());
        ApplicationEntry applicationEntry = injector.getInstance(ApplicationEntry.class);

        applicationEntry.speak();
    }
}
