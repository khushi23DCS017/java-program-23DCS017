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
class Cat extends Animal {
    Cat(String p, int q) {
        super(p,q);
        
    }

    void eat() {
        System.out.println("cat eats");
    }
}
public class hierarchal {
    public static void main(String[] args) {
        
        Cat c= new Cat("meow", 5);
		Dog d= new Dog("dog1", 2);

        
        System.out.println("Name: " + c.name);
        System.out.println("Age: " + c.age);
		
		System.out.println("Name: " + d.name);
        System.out.println("Age: " + d.age);

        
        c.sound();
        d.bark();
		c.eat();
		d.sound();
    }
}
