package kz.kaznu.delya.HW6;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(50);


        Cat[] cats = {
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


