import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Vehicle[] allCars = new Vehicle[3];
        for (int i = 0; i <= 2; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Please enter the car make #%d.%n", i+1);
            String makeCar = scanner.next();
            System.out.printf("Please enter the vehicle speed #%d.%n", i+1);
            int speedCar = scanner.nextInt();
            while ((speedCar < 0) || (speedCar > 250)) {
                System.out.printf("Please enter the vehicle speed #%d.%n", i+1);
                speedCar = scanner.nextInt();
            }
            allCars[i] = new Vehicle(makeCar, speedCar);
        }
        Race winner  = new Race(allCars);
        System.out.printf("Самая быстрая машина: %s%n", winner.leader());
    }
}