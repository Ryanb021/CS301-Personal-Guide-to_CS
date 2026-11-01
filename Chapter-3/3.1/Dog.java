// Creating an Object

public class Dog {

    public static void main(String[] args) {
        
        Dog myDog = new Dog("Buddy");

        myDog.bark();
    }

    String name;

    // Constructor
    public Dog(String dogName) {
        name = dogName;
    }

    // Instance method
    public void bark() {
        System.out.println(name + " says Woof");
    }
}
