public class Box {
    private double length;
    private double width;
    private double height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public void displayBoxDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
    public void printVolume() {
        double volume = length * width * height;
        System.out.println("Volume of the box: " + volume);
    }

    public static void main(String[] args) {
        Box myBox = new Box(10, 6, 9);
        System.out.println("Box Dimensions:");
        myBox.displayBoxDimensions();
        myBox.printVolume();
    }
}
