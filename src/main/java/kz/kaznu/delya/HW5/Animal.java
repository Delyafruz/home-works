package kz.kaznu.delya.HW5;

public class Animal {
    protected String name;
    protected double speedRun;
    protected double speedSwim;
    protected int endurance;


    public Animal(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }

    public double run(int distance) {
        int enduranceCost=distance;
        if (endurance >= enduranceCost) {
            endurance -= enduranceCost;
            double time = distance / speedRun;
            System.out.println(name + " пробежал(м): " + distance + " и затратил сил: " + enduranceCost + ", Потратил время(сек): " + time);
            return time;
        } else {
            System.out.println(name + " не смог пробежать: " + distance + ". Не хватило выносливости: " + enduranceCost + " " + name + " устал.");
            return -1;
        }

    }


    public void info() {
        System.out.println("Name: " + name + ", Speed run(m/s): " + speedRun + ", Speed swim(m/s): " + speedSwim + ", Endurance: " + endurance);

    }

    public double swim(int distance) {
        if (speedSwim == 0) {
            System.out.println(name + " не умеет плавать.");
            return -1;
        }
        return 0;
    }

}



