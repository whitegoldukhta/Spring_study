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
        PojoCat beanCat = (PojoCat) applicationContext.getBean("cat");
        PojoCat beanCat1 = (PojoCat) applicationContext.getBean("cat");
        boolean comparisonCats = beanCat1.getName().equals(beanCat.getName());
        boolean comparisonHello = (bean.getMessage()).equals(bean1.getMessage());
        System.out.println(comparisonCats);
        System.out.println(comparisonHello);
    }
}