public class StudentNames {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("List of student names:");
            for (String name : args) {
                System.out.println(name);
            }
        } else {
            System.out.println("Please enter at least one student name as a command line argument.");
        }
    }
}
