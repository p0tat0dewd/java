public class Vehicle {
    private static int totalVehicles = 0;
    private String make, model;
    private int year;
    private double price;
    public Vehicle() {
        totalVehicles++;
    }
    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        totalVehicles++;
    }
    public static int getTotalVehicles() {
        return totalVehicles;
    }
    public void displayVehicleInfo() {
        System.out.println("Make: " + make + "\nModel: " + model + "\nYear: " + year + "\nPrice: $" + price);
    }
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle("Ford", "Mustang", 1969, 500000.0);
        System.out.println("Vehicle 1 Information:");
        vehicle1.displayVehicleInfo();
        System.out.println("\nVehicle 2 Information:");
        vehicle2.displayVehicleInfo();
        System.out.println("\nTotal Vehicles: " + Vehicle.getTotalVehicles());
    }
}
