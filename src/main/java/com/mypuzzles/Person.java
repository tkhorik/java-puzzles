package com.mypuzzles;

import java.util.List;
import java.util.Optional;

// Реализовать функцию поиска человека по имени в списке
public class Person {
    final private String name;
    final private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Optional<Person> findPersonByName(List<Person> persons, String name) {
        for (Person person : persons) {
            if (person.name.equals(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
//        for (Person person : persons) {
//            if (person.name.equals(name)) {
//                return person;
//            }
//        }
//        return null;
//    }

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

        Person personInstance = new Person("Dummy", 0); // Create an instance to call the method
        Optional<Person> foundPerson = personInstance.findPersonByName(persons, "Bob");

        foundPerson.ifPresent(person -> {
            System.out.println(person.name);
            System.out.println(person.age);
        });
        System.out.println();
    }
}