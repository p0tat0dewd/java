public class ASCII {
    public static void main(String[] args) {
        System.out.println("ASCII values for characters from 'A' to 'Z':");
        printASCII('A', 'Z');
        System.out.println("\nASCII values for characters from 'a' to 'z':");
        printASCII('a', 'z');
        System.out.println("\nASCII values for digits from '0' to '9':");
        printASCII('0', '9');
    }
    public static void printASCII(char startChar, char endChar) {
        char currentChar = startChar;
        while (currentChar <= endChar) {
            int asciiValue = (int) currentChar;
            System.out.println("'" + currentChar + "' : " + asciiValue);
            currentChar++;
        }
    }
}
