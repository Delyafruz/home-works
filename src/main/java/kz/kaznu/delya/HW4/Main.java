package kz.kaznu.delya.HW4;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
    }

    public static void ex1() {
        User[] users = {
                new User("Иванов", "Иван", "Иванович", 1980, "ivanov.ivan@example.com"),
                new User("Петров", "Пётр", "Петрович", 1975, "petrov.petr@example.com"),
                new User("Сидорова", "Анна", "Викторовна", 1990, "sidorova.anna@example.com"),
                new User("Кузнецов", "Алексей", "Сергеевич", 1983, "kuznetsov.alexey@example.com"),
                new User("Морозова", "Елена", "Александровна", 1995, "morozova.elena@example.com"),
                new User("Смирнова", "Ольга", "Викторовна", 1972, "smirnova.olga@example.com"),
                new User("Васильев", "Дмитрий", "Олегович", 1965, "vasilyev.dmitry@example.com"),
                new User("Фёдоров", "Михаил", "Андреевич", 1986, "fedorov.mikhail@example.com"),
                new User("Алексеева", "Наталья", "Павловна", 1960, "alekseeva.natalia@example.com"),
                new User("Тихонов", "Сергей", "Владимирович", 1993, "tikhonov.sergey@example.com"),
        };
        for (int i = 0; i < users.length; i++) {
            if (2025 - users[i].yearOfBirth > 40) {
                users[i].info();
            } else {
                System.out.println("Пользователь меньше 40 лет");
            }
        }
    }
    public static void ex2(){
        Box box = new Box(30, 21, 10, "зеленый");
        box.infoBox();
        box.openBox();
        box.putItem("книга");
        box.infoBox();
        box.removeItem();
        box.infoBox();
        box.closeBox();
        box.repaint("синий");
        box.infoBox();
    }


}
