package myname;

public class Person {
    private String name;
    private String lastName;

    public Person() {
        this.name = "Serhii";
        this.lastName = "Snihur";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
