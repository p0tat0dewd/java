public class LargestNumber {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int[] numbers = new int[args.length];

                for (int i = 0; i < args.length; i++) {
                    numbers[i] = Integer.parseInt(args[i]);
                }
                int largest = findLargestNumber(numbers);
                System.out.println("The largest number is: " + largest);
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid integer numbers.");
            }
        } else {
            System.out.println("Please enter at least one integer number as a command line argument.");
        }
    }

    private static int findLargestNumber(int[] numbers) {
        int largest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }
}
