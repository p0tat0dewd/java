class Beverage {
    public void prepare() {
        System.out.println("Generic beverage prepared.");
    }

    public void serve() {
        System.out.println("Generic beverage served.");
    }
}

class Coffee extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Coffee prepared.");
    }

    @Override
    public void serve() {
        System.out.println("Coffee served.");
    }
}

class Tea extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Tea prepared.");
    }

    @Override
    public void serve() {
        System.out.println("Tea served.");
    }
}

class Smoothie extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Smoothie prepared.");
    }

    @Override
    public void serve() {
        System.out.println("Smoothie served.");
    }
}

public class BeverageApp {
    public static void main(String[] args) {
        Beverage beverage1 = new Coffee();
        Beverage beverage2 = new Tea();
        Beverage beverage3 = new Smoothie();

        beverage1.prepare();
        beverage1.serve();

        beverage2.prepare();
        beverage2.serve();

        beverage3.prepare();
        beverage3.serve();
    }
}
