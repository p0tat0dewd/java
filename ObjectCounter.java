class MyClass {
    private static int numberOfObjects = 0; 
    
    public MyClass() {
        numberOfObjects++; 
    }
    
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}

public class ObjectCounter {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
        System.out.println("Total number of objects created: " + MyClass.getNumberOfObjects());
    }
}
