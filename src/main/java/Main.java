import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        String winner = "";
        int speedCar = 0;
        String makeCar = "";
        for (int i = 0; i <= 2; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Please enter the car make #%d.%n", i+1);
            makeCar = scanner.next();
            System.out.printf("Please enter the vehicle speed #%d.%n", i+1);
            while (true) {
                    if (scanner.hasNextInt()) {
                        speedCar = scanner.nextInt();
                        if ((speedCar >= Vehicle.MINSPEED) && (speedCar <= Vehicle.MAXSPEED)) {
                            break;
                        } else {
                            System.out.printf("Speed must be between %d and %d.%n", Vehicle.MINSPEED, Vehicle.MAXSPEED);
                            System.out.printf("Please enter the vehicle speed #%d.%n", i+1);
                        }
                    } else {
                        System.out.println("Invalid input - please enter a number.");
                        scanner.next();
                        System.out.printf("Please enter the vehicle speed #%d.%n", i + 1);
                }
            }
        }
        winner  = new Race(new Vehicle(makeCar, speedCar)).leader();
        System.out.printf("The fastest car: %s%n", winner);
    }
}