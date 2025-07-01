class Rectangle {
    double length;
    double width;
    double calculateArea() {
        return length * width;
    }
}

public class area {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(); // Create object
        rect1.length = 10.0;
        rect1.width = 5.0;
        System.out.println("Area: " + rect1.calculateArea());
    }
}