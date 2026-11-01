// Interface Inheritance (Subtyping)

interface Animal {

    void makeSound();
}

class Cat implements Animal {

    public void makeSound() {
        System.out.println("Meow!");
    }
}
public class Animalexample {
    public static void main(String[] args) {
        
        Animal animal = new Cat();

        animal.makeSound();
    }
}
