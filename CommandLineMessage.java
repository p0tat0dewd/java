public class CommandLineMessage {
    public static void main(String[] args) {
        if (args.length > 0) {
            StringBuilder message = new StringBuilder();
            for (String arg : args) {
                message.append(arg).append(" ");
            }

            System.out.println("Entered message: " + message.toString().trim());
        } else {
            System.out.println("Please enter a message as a command line argument.");
        }
    }
}

