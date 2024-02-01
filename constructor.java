import java.lang.reflect.Constructor;

public class constructor {
	int a;

	public constructor() {
		System.out.println("default constructor called.");
		a=10;
	}
	public constructor(int a) {
		System.out.println("parameterized constructor");
		this.a=a;
	}
	public static void main(String[] args) {
		constructor simpc= new constructor();
		System.out.println(simpc.a);
		
		constructor simpc1= new constructor(20);
		System.out.println(simpc1.a);

}
}
