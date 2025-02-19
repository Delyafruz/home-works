package kz.kaznu.delya.HW5;

public class Cat extends Animal {
    public Cat(){
        super("Мурзик", 25, 0, 50);
    }
    @Override
    public double swim(int distance) {
        System.out.println(name + " не умеет плавать!");
        return -1;
    }

}