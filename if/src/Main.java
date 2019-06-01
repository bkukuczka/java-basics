import transportation.Car;
import transportation.Horse;
import transportation.Plane;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How far do you want to travel?");
        int distance = scanner.nextInt();
        System.out.println("What is your budget?");
        int budget = scanner.nextInt();

        Car budgetCar = new Car();
        Plane expensivePlane = new Plane();
        Horse oldHorse = new Horse();

        if(expensivePlane.calculatePrice(distance) < budget){
            System.out.println("You' re rich, go by plane.");
        } else if(budgetCar.calculatePrice(distance) < budget){
            System.out.println("You can rent a car");
        } else if(oldHorse.calculatePrice(distance) < budget){
            System.out.println("You're poor, choose a horse.");
        } else {
            System.out.println("You should rely on your feet.");
        }
    }
}
