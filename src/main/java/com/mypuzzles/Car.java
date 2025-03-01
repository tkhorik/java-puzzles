package com.mypuzzles;

import java.util.ArrayList;
import java.util.List;

class Car {
    private int carID;
    private String brand;
    private String model;
    private boolean available;
    private int rentPerHour;

    public Car(int carID, String brand, String model, boolean available, int rentPerHour) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.available = available;
        this.rentPerHour = rentPerHour;
    }

    public int getCarID() { return carID; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", available=" + available +
                ", rentPerHour=" + rentPerHour +
                '}';
    }
}

class CarRentalSystem {
    private List<Car> cars;

    public CarRentalSystem() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    // Retrieve all available cars
    public List<Car> getAvailableCars() {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.isAvailable()) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    // Update the availability status of a car given its ID
    public void updateCarAvailability(int carID, boolean availability) {
        for (Car car : cars) {
            if (car.getCarID() == carID) {
                car.setAvailable(availability);
                break;
            }
        }
    }

    public static void main(String[] args) {
        CarRentalSystem system = new CarRentalSystem();
        system.addCar(new Car(1, "Toyota", "Corolla", true, 50));
        system.addCar(new Car(2, "Honda", "Civic", false, 60));
        system.addCar(new Car(3, "Ford", "Focus", true, 55));

        System.out.println("Available Cars:");
        for (Car car : system.getAvailableCars()) {
            System.out.println(car);
        }

        // Changing availability of a car and printing the updated list
        system.updateCarAvailability(2, true);
        System.out.println("\nAfter updating availability:");
        for (Car car : system.getAvailableCars()) {
            System.out.println(car);
        }
    }
}
