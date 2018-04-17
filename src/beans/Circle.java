package beans;

public class Circle implements Shape{

    private Point centre;
    @Override
    public void draw() {
        System.out.println("Circle: " + centre.getX() + "," + centre.getY());
    }
}
