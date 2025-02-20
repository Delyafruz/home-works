package kz.kaznu.delya.HW6;

public class Cat {
    public String name;
    public int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            satiety=true;
            System.out.println(name + " поел.");
            return true;
        } else {
            System.out.println(name + " не смог поесть, мало еды в тарелке.");
            return false;
        }
    }

    public void info(){
        System.out.println(name+" - " + (satiety ? "Сыт" : "Голоден"));
    }
}
