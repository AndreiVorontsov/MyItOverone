package level4.lesson10.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringUsage {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("level4.lesson10.Spring");

        Message msg = context.getBean(Message.class);
        System.out.println(msg);
        Message msg2 = context.getBean(Message.class);
        System.out.println(msg2);

//        Car car = context.getBean(Car.class);
//        System.out.println(car);



    }
}
