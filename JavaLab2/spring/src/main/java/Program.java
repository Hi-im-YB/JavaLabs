import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        System.out.println(context.getBean(AddOperation.class).operate(1, 2));
        System.out.println(context.getBean(SubtractOperation.class).operate(1, 2));
        System.out.println(context.getBean(MultiplyOperation.class).operate(1, 2));
        System.out.println(context.getBean(DivideOperation.class).operate(1, 2));
    }
}
