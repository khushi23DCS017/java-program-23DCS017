import java.util.Scanner;
class Animal {
    String name;
    int age;

    Animal(String a, int b) {
        name = a;
        age = b;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    Dog(String x, int y) {
        super(x,y);
        
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

public class singleinheri {
    public static void main(String[] args) {
        
        Dog d = new Dog("dog1", 3);

        
        System.out.println("Name: " + d.name);
        System.out.println("Age: " + d.age);

        
        d.sound();
        d.bark();
    }
}
