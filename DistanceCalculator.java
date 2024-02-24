import java.lang.Math;

public class DistanceCalculator {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2, String unit) {
        double distanceInMeters = calculateDistance(x1, y1, x2, y2);
        if (unit.equalsIgnoreCase("kilometers")) {
            return distanceInMeters / 1000;
        } else {
            return distanceInMeters;
        }
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2, boolean inMeters) {
        if (inMeters) {
            return calculateDistance(x1, y1, x2, y2);
        } else {
            return calculateDistance(x1, y1, x2, y2) / 1000;
        }
    }

    public static void main(String[] args) {
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 3.0;
        double y2 = 4.0;

        double distanceInMeters = calculateDistance(x1, y1, x2, y2);
        System.out.println("Distance between the points in meters: " + distanceInMeters + " meters");

        double distanceInKilometers = calculateDistance(x1, y1, x2, y2, "kilometers");
        System.out.println("Distance between the points in kilometers: " + distanceInKilometers + " kilometers");
    }
}
