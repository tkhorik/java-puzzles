package com.mypuzzles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class CarObject {
    private int id;
    private String model;
    private int rentPerHour;

    public CarObject(int id, String model, int rentPerHour) {
        this.id = id;
        this.model = model;
        this.rentPerHour = rentPerHour;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getRentPerHour() {
        return rentPerHour;
    }

    @Override
    public String toString() {
        return "CarObject{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", rentPerHour=" + rentPerHour +
                '}';
    }
}

public class ObjectFiltering {
    public static void main(String[] args) {
        List<CarObject> cars = new ArrayList<>();
        cars.add(new CarObject(1, "Toyota", 50));
        cars.add(new CarObject(2, "Honda", 75));
        cars.add(new CarObject(3, "Ford", 40));
        cars.add(new CarObject(4, "BMW", 90));

        // Filter cars with rentPerHour less than 70 using the Stream API
        List<CarObject> affordableCars = cars.stream()
                .filter(car -> car.getRentPerHour() < 70)
                .toList();

        System.out.println("Affordable Cars (rent < $70):");
//        affordableCars.forEach(System.out::println);
        affordableCars.forEach(System.out::println);
    }
}
