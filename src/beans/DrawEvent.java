package beans;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DrawEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "Draw Event Occured";
    }
}
