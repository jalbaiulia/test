package beans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans/spring.xml");

        context.registerShutdownHook();

        Triangle t = (Triangle) context.getBean("triangle");
        t.draw();

        Shape c = (Shape) context.getBean("circle");
        c.draw();

    }
}