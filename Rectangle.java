public class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return this.length * this.width;
    }
    public void displayArea() {
        System.out.println("Area: " + this.calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        rectangle.displayArea();
    }
}
