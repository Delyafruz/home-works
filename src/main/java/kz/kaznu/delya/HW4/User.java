package kz.kaznu.delya.HW4;

public class User {
    public String lastName;
    public String name;
    public String surname;
    public int yearOfBirth;
    public String email;
    public int age;


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

    public int getAge() {
        return age;
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

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Возраст не может быть отрицательным!");
        }
    }
}