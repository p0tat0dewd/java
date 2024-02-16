public class PrimitiveToWrapper {
    public static void main(String[] args) {
        int intValue = 69;
        char charValue = 'X';
        double doubleValue = 2.17;
        Integer integerObj = intValue;
        Character charObj = charValue;
        Double doubleObj = doubleValue;
        System.out.println("Integer Object: " + integerObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Double Object: " + doubleObj);
    }
}
