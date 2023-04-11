abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract void draw();

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Shape other = (Shape) obj;
        return color.equals(other.color);
    }
}

class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(String color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Circle other = (Circle) obj;
        return x == other.x && y == other.y && radius == other.radius;
    }
}

class Rectangle extends Shape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle(String color, int x1, int y1, int x2, int y2) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Rectangle other = (Rectangle) obj;
        return x1 == other.x1 && y1 == other.y1 && x2 == other.x2 && y2 == other.y2;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle("red", 100, 100, 50),
                new Rectangle("blue", 50, 50, 150, 100),
                new Circle("green", 200, 200, 75)
        };
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}