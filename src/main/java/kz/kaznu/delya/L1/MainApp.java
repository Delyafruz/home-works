package kz.kaznu.delya.L1;

import kz.kaznu.delya.HW6.Cat;
import kz.kaznu.delya.HW6.Plate;

public class MainApp {
    public static void main(String[] args) {
        Plate plate=new Plate(50);


        Cat[] cats={
                new Cat("Барсик", 5),
                new Cat("Мурзик", 7),
                new Cat("Том", 8),
                new Cat("Гарфилд", 10)
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }
        plate.addFood(10);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
        }
    }
}
