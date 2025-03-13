package com.mypuzzles;

import java.util.List;
// Реализовать функцию поиска человека по имени в списке
public class Person {
    final private String name;
    final private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person findPersonByName(List<Person> persons, String name) {
        for (Person person : persons) {
            if (person.name.equals(name)) {
                return person;
            }
        }
        return null;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        List<Person> persons = List.of(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );
        Person person = new Person("Alice", 30);
        person.printDetails();
        Person foundPerson = person.findPersonByName(persons, "Bob");
        System.out.println(foundPerson.age);
    }
}
