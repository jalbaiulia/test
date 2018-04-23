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

        System.out.println();
        System.out.println("Messaging:");
        System.out.println(context.getMessage("greeting", null, "Default message", null));


    }
}