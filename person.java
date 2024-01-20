public class person {
    private String name;
    private int age;
    private String phonenumber;

    public person(String name, int age, String phonenumber) {
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nPhone Number: " + phonenumber + "\n");
    }

    public static void main(String[] args) {
        person person1 = new person("meow meow", 69, "1234567890");
        person person2 = new person("joemama", 96, "9876543210");
        person person3 = new person("statutory ape", 22, "9765430921");
        person1.displayDetails();
        person2.displayDetails();
        person3.displayDetails();
    }
}


