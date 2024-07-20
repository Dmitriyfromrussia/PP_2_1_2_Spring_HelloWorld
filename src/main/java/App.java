import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = // не понятно, почему не написать AnnotationConfigApplicationContext вместо ApplicationContext
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.equals(bean2));

        Cat bean3 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getVoice());
        Cat bean4 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean3 == bean4);
    }
}