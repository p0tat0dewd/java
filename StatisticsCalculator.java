import java.util.List;

public class StatisticsCalculator {

    public static Double findMinimum(List<Double> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        return numbers.stream().min(Double::compareTo).get();
    }

    public static Double findMaximum(List<Double> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        return numbers.stream().max(Double::compareTo).get();
    }

    public static Double calculateAverage(List<Double> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        Double sum = numbers.stream().mapToDouble(Double::doubleValue).sum();
        return sum / numbers.size();
    }

    public static Double calculateStandardDeviation(List<Double> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("List is empty");
            return null;
        }
        Double average = calculateAverage(numbers);
        Double variance = numbers.stream().mapToDouble(num -> Math.pow(num - average, 2)).sum() / numbers.size();
        return Math.sqrt(variance);
    }

    public static void main(String[] args) {
        List<Double> numbers = List.of(1.0, 2.5, 3.7, 4.8, 5.9);

        System.out.println("Minimum: " + findMinimum(numbers));
        System.out.println("Maximum: " + findMaximum(numbers));
        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Standard Deviation: " + calculateStandardDeviation(numbers));
    }
}
