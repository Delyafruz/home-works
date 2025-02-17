package kz.kaznu.delya.HW4;

public class Main {
    public static void main(String[] args) {

User[] users= new User[10];
        for (int i = 0; i < users.length; i++) {
            users[i]=new User(){

                
            };
        }
    }

    public static void myInfo() {
        User person = new User();
        person.setNames("Азизова", "Деляфруз", "Максудовна", "robot1331gmail.com");
        person.setYearOfBirth(2005);
        System.out.println("ФИО: " + person.getLastName() + " " + person.getName() + " " + person.getSurname() + "\n" + "Email: " + person.getEmail() + "\n" + "Год рождения: " + person.getyearOfBirth());
    }
}
