import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat == beanCat1);
        System.out.println(bean == bean1);
    }
}