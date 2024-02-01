public class Person {
    private int age;
    public Person(int initialAge) {
        if (initialAge >= 0) {
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }
    public void yearPasses() {
        this.age++;
    }
    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public static void main(String[] args) {
        Person person = new Person(-5);
        System.out.println("Initial age: " + person.age);
        person.amIOld();
        person.yearPasses();
        person.yearPasses();
        person.yearPasses();
        System.out.println("Updated age: " + person.age);
        person.amIOld();
    }
}
