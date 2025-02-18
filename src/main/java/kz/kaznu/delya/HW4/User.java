package kz.kaznu.delya.HW4;

public class User {
    private String lastName;
    private String name;
    private String surname;
    public int yearOfBirth;
    private String email;


    public int getyearOfBirth() {
        return yearOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }


    public void setNames(String lastName, String name, String surname, String email) {
        if (lastName.length() > 2 && name.length() > 2 && surname.length() > 2 && email.length() > 2) {
            this.lastName = lastName;
            this.name = name;
            this.surname = surname;
            this.email = email;
        } else {
            System.out.println("Имя не может быть меньше 2 букв!");
        }

    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            System.out.println("Год не может быть меньше нуля!");
        }

    }

    public User(String lastName, String name, String surname, int yearOfBirth, String email) {
        this.lastName = lastName;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public void info() {
        System.out.println("ФИО: " + lastName + " " + name + " " + surname + ", " + "Год рождения: " + yearOfBirth + ", " + "Email: " + email);
    }

}