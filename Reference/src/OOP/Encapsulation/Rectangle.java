package OOP.Encapsulation;

public class Rectangle {

    //private so we need to create setter and getters
    private double width;
    private double length;
    private double area;

    //constructor 1
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        this.area = width * length;
    }

    public static void main(String[] args) {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;

        //we had to set update the new area because the new width was set
        area = width * length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;

        //we have to update the area because the new length was set
        area = width * length;
    }

    //we can only get the area
    public double getArea() {
        return area;
    }
    //we don't want people to access the set area so that is why we don't have a setter method for area
    // because if th e len and wid are 5,5 someone can set the amount to whatever
}
