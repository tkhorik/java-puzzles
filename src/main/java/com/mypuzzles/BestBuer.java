package com.mypuzzles;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
//interview-practice
public class BestBuer {
    public static void main(String[] args) {
//Задача 1: Поиск "самого дорогого" покупателя
//Есть список покупателей, каждый из которых совершил несколько покупок. Нужно:
//Для каждого покупателя найти общую сумму его покупок.
//Определить, кто потратил больше всех.
//Если таких покупателей несколько — вернуть любого.

        record Purchase(String item, double price) {}
        record Customer(String name, List<Purchase> purchases) {}

        List<Customer> customers = List.of(
                new Customer("Alice", List.of(
                        new Purchase("Laptop", 1200.0),
                        new Purchase("Mouse", 50.0)
                )),
                new Customer("Bob", List.of(
                        new Purchase("Phone", 800.0),
                        new Purchase("Headphones", 150.0)
                )),
                new Customer("Charlie", List.of(
                        new Purchase("Monitor", 300.0),
                        new Purchase("Keyboard", 100.0),
                        new Purchase("Mouse", 50.0)
                ))
        );

        Comparator<Object> Comparator = null;
        Optional<Customer> topSpender = customers.stream()
                .max(java.util.Comparator.comparingDouble(
                        customer -> customer.purchases().stream()
                                .mapToDouble(Purchase::price)
                                .sum()
                ));
    }
}