package test;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class AnimalKingdom {
    public static void main(String[] args) {

        Dog dog = new Dog("Tommy", 3);
        Cat cat = new Cat("Kitty", 2);

        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println();

        cat.eat();
        cat.sleep();
        cat.meow();
    }
}
