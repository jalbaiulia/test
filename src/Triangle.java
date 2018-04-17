public class Triangle {

    private String type;
    private int height;

    private Point pointA;
    private Point pointB;
    private Point pointC;


    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // constructor injection
    public Triangle(String type){
        this.type = type;
    }

    public Triangle(int height){
        this.height = height;

    }

    public Triangle(int height, String type){
        this.height = height;
        this.type = type;

    }

    public String getType() {
        return type;
    }


//    // method injection
//    public void setType(String type) {
//        this.type = type;
//    }

    public void draw(){

        System.out.println("Triangle drawn "+ getType() + " " + getHeight() + " " + pointA + pointB + pointC);
    }

}
