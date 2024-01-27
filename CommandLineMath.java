public class CommandLineMath {
    public static void main(String[] args) {
        if (args.length == 2) {
            try {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                int sum = num1 + num2;
                int difference = num1 - num2;
                System.out.println("Sum: " + sum);
                System.out.println("Difference: " + difference);
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid integer numbers.");
            }
        } else {
            System.out.println("Please provide exactly two integer numbers as command line arguments.");
        }
    }
}
