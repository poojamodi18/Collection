package hashMapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Person {
    private int age;
    private String name;
    public  Person(){}
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class HashMapExamplesOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Person> people = new HashMap<>();
        System.out.println("Enter number of people : ");
        int totalPeople = sc.nextInt();
        for (int i = 0; i < totalPeople; i++) {
            Person person = new Person();
            System.out.println("Enter Name : ");
            person.setName(sc.next());
            System.out.println("Enter Age : ");
            person.setAge(sc.nextInt());
            people.put(person.getName(),person);
        }

        System.out.println("Find Person by Name : ");
        System.out.println("Enter Name : ");
        String findPerson = sc.next();
        if(people.containsKey(findPerson)) {
            Person person = people.get(findPerson);
            System.out.println("Aga of " + person.getName() + " is " + person.getAge());
        }else{
            System.out.println("No such person");
        }

        for (Map.Entry<String, Person> stringPersonEntry : people.entrySet()) {
            System.out.println(stringPersonEntry.getKey()+" "+stringPersonEntry.getValue());
        }
    }
}
