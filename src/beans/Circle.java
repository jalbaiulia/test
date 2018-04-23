package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;

public class Circle implements Shape, ApplicationEventPublisherAware {

    private Point centre;

    @Autowired
    private MessageSource messageSource;

    private ApplicationEventPublisher publisher;


    public Point getCentre() {
        return centre;
    }

    //    @Required
    @Autowired
    @Qualifier("circleCentre")
    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void draw() {
        System.out.println("");
        System.out.println("MessageSource: " + messageSource.getMessage("greeting", null, "In circle default message", null));
        // use messageSource to write the message below
//        System.out.println("Circle: " + centre.getX() + "," + centre.getY());
        System.out.println("Circle centre point by MessagePoint: " + messageSource.getMessage("circle.point", new Object[]{centre.getX(), centre.getY()}, "Default centre message ", null));

        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);
    }


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
