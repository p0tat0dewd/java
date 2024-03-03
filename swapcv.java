public class swapcv {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int num1 = 96;
        int num2 = 69;
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        swap(num1, num2);
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
