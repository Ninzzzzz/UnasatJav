import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;

    private java.util.Date dateCreated;

    public GeometricObject() {}
    public GeometricObject(String color, boolean filled ){};

    public String getColor(){
        return color;
    };
    public void setColor(String color){};

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public String toString(){
        return null;

    };
}

class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        // Default constructor
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Add any additional methods or overrides specific to Circle if needed
}

class Square extends GeometricObject {
    private double side;

    public Square() {

        // Default constructor
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Add any additional methods or overrides specific to Square if needed
}

class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        // Default constructor
    };
    public  Rectangle(width , height){

    };
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Add any additional methods or overrides specific to Rectangle if needed
}
