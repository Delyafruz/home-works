package kz.kaznu.delya.HW5;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.info();
        horse.run(50);
        horse.swim(20);
        horse.info();
        System.out.println();

        Cat cat = new Cat();
        cat.info();
        cat.swim(47);
        cat.run(10);
        System.out.println();

        Dog dog = new Dog();
        dog.info();
        dog.swim(10);
        dog.run(10);

    }
}
