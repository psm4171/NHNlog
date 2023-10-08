package Exercises;

import java.util.ArrayList;
import java.util.List;

public class ListOfPersons {
    private ArrayList<Person> personList = new ArrayList<>();

//    public ListOfPersons(){
//       // personList = new ArrayList<>();
//    }

    public void AddPerson(Person person){
      personList.add(person);
    }

    public void deletePersonList(Person person){
        personList.remove(person);
    }

    public void modifyPersonList(Person oldPerson, Person newPerson){
        int index = personList.indexOf(oldPerson);
        personList.set(index, newPerson);

    }

    public void printAllPersons() {
        for (Person person : personList) {
            System.out.println("Name: " + person.getName() + ", Surname: " + person.getFirstName() +
                    ", Age: " + person.getAge() + ", City: " + person.getCity());
        }
    }


    public double average(){
        double total = 0.0;
        for(Person person : personList){
            total += person.getAge();
        }
        return (double) total / personList.size();
    }

    public int countPersonCity(String city){
        int count = 0;
        for(Person person : personList){
            if(person.getCity().equalsIgnoreCase(city)){
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        ListOfPersons listOfPersons = new ListOfPersons();

        Person person1 = new Person("sm", "Park", 26, "GwangJu");
        Person person2 = new Person("js", "Kim", 25, "Seoul");
        Person person3 = new Person("ka", "Han", 24, "GwangJu");
        Person person4 = new Person("sm", "Park", 26, "GwangJu");
        Person person5 = new Person("jh", "Jo", 22, "GwangJu");

        listOfPersons.AddPerson(person1);
        listOfPersons.AddPerson(person2);
        listOfPersons.AddPerson(person3);
        listOfPersons.AddPerson(person4);
        listOfPersons.AddPerson(person5);

        listOfPersons.deletePersonList(person4);

        listOfPersons.modifyPersonList(person1, person5);


        System.out.println("Print All Person : ");
        listOfPersons.printAllPersons();

        String cityCount = "GwangJu";
        int count = listOfPersons.countPersonCity(cityCount);
        System.out.println("\nSame City Count: " + count);


        double averageAge = listOfPersons.average();
        System.out.print("Calculate Age Average : " + averageAge);




    }
}
