
import java.util.Scanner;

class Vehicle {
    String make, model, fueltype;
    int year;

    public Vehicle(String make, String model, int year, String fueltype) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fueltype = fueltype;
    }

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fueltype);
    }
}

class Truck extends Vehicle {
    Truck(String make, String model, int year, String fueltype) {
        super(make, model, year, fueltype);
    }

    double calculatemaxspeed(double distance, double time) {
        return distance / time;
    }

    double fuelefficiency(double distance, double fuelconsumed) {
        return distance / fuelconsumed;
    }

    double distancetraveled(double speed, double time) {
        return speed * time;
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, String fueltype) {
        super(make, model, year, fueltype);
    }

    double calculatemaxspeed(double distance, double time) {
        return distance / time;
    }

    double fuelefficiency(double distance, double fuelconsumed) {
        return distance / fuelconsumed;
    }

    double distancetraveled(double speed, double time) {
        return speed * time;
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fueltype) {
        super(make, model, year, fueltype);
    }

    double calculatemaxspeed(double distance, double time) {
        return distance / time;
    }

    double fuelefficiency(double distance, double fuelconsumed) {
        return distance / fuelconsumed;
    }

    double distancetraveled(double speed, double time) {
        return speed * time;
    }
}

public class sup19 {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2022, "Gasoline");
        Car car = new Car("Toyota", "Camry", 2020, "Gasoline");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2021, "Gasoline");

        truck.displayDetails();
        System.out.println("Max Speed: " + truck.calculatemaxspeed(100, 2) + " km/h");
        System.out.println("fuel efficiency" + truck.fuelefficiency(100, 1.5));
        System.out.println("distance traveled" + truck.distancetraveled(50, 2));
		
		System.out.println("---------------------------------------------------------------------");

        car.displayDetails();
        System.out.println("Max Speed: " + car.calculatemaxspeed(80, 2) + " km/h");
        System.out.println("fuel efficiency" + car.fuelefficiency(80, 1.5));
        System.out.println("distance traveled" + car.distancetraveled(40, 2));

System.out.println("---------------------------------------------------------------------");

        motorcycle.displayDetails();
        System.out.println("Max Speed: " + motorcycle.calculatemaxspeed(50, 2) + " km/h");
        System.out.println("fuel efficiency" + motorcycle.fuelefficiency(50, 1.5));
        System.out.println("distance traveled" + motorcycle.distancetraveled(25, 2));
		
		System.out.println("---------------------------------------------------------------------");
    }
	
	
}
