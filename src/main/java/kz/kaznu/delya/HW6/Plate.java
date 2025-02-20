package kz.kaznu.delya.HW6;

public class Plate {
    public int maxFood;
    public int nowFood;


    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.nowFood = maxFood;
    }

    public boolean decreaseFood(int amount) {
        if (nowFood >= amount) {
            nowFood -= amount;
            return true;
        } else {
            System.out.println("В тарелке недостаточно еды!");
            return false;
        }
    }

    public void addFood(int amount) {
        if (nowFood + amount > maxFood) {
            nowFood = maxFood;
        } else {
            nowFood += amount;
        }
        System.out.println("В тарелку добавили еды. Сейчас в тарелке: " + nowFood);
    }

    public int getNowFood() {
        return nowFood;
    }
}
