package homework_02.task_01;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private String country;
    private String city;

    public int getAge() { return age; }

    public String getCity() { return city; }

    public String getName() { return name; }

    public String getCountry() { return country; }

    public Student(int age, String city, String name, String country) {
        this.age = age;
        this.city = city;
        this.name = name;
        this.country = country;
    }

    public String toString(){
        return "\n{name: " + name
                + ", age: " + age
                + ", country: " + country
                + ", city: " + city
                + "}";
    }

}
