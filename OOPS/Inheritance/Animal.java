class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}


class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}


class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}


class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet!");
    }
}
class AnimalTest {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy", 4);
        Animal myCat = new Cat("Whiskers", 3);
        Animal myBird = new Bird("Chirpy", 2);

        myDog.makeSound();   
        myCat.makeSound();   
        myBird.makeSound();  
    }
}
