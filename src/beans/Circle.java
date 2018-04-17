package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{

    private Point centre;
    @Override
    public void draw() {
        System.out.println("Circle: " + centre.getX() + "," + centre.getY());
    }

    public Point getCentre() {
        return centre;
    }

//    @Required
    @Autowired
    @Qualifier("circleCentre")
    public void setCentre(Point centre) {
        this.centre = centre;
    }
}
