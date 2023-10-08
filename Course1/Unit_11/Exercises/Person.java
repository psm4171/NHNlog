package Exercises;

public class Person {
    private String name;
    private String firstName;
    private int age;
    private String city;

    public Person(String name, String firstName, int age, String city){
        this.name = name;
        this.firstName = firstName;
        this.age = age;
        this.city = city;
    }


    public String getName() {
        return name;
    }


    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }


//    @Override
//    public String toString() {
//        return "Name: " + this.getName() + ", Surname: " + this.getFirstName() +
//                ", Age: " + this.getAge() + ", City: " + this.getCity();
//    }


}
