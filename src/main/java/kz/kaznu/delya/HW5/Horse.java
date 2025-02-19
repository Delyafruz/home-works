package kz.kaznu.delya.HW5;

public class Horse extends Animal {
    public Horse() {
        super("Буран", 60, 5, 200);
    }

    @Override
    public double swim(int distance) {
        int enduranceCost = 4 * distance;
        if (endurance >= enduranceCost) {
           endurance-=enduranceCost;
            double time = distance / speedSwim;
            System.out.println(name + " проплыл(м): " + distance + " и потратил сил: " + enduranceCost+ ". Затраченное время(сек.): " + time);
            return time;
        } else {
            System.out.println(name + " не может плыть, " + name + " устал." + "Не хватает выносливости: " + enduranceCost);
            return -1;
        }
    }
}




