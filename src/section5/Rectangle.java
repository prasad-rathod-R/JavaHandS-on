package section5;

public class Rectangle extends Shape {
    int length;
    int breadth;

    protected double calculateArea() {
        return (length * breadth);
    }

    public Rectangle(int length, int breadth, String shapeName) {
        super(shapeName);
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

}
