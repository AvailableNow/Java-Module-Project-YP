import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String winner = "";
        String carMake = "";
        int carSpeed = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            System.out.printf("Please enter the car make #%d.%n", i+1);
            carMake = scanner.next();
            System.out.printf("Please enter the vehicle speed #%d.%n", i+1);
            while (true) {
                if (scanner.hasNextInt()){
                    carSpeed = scanner.nextInt();
                    if ((carSpeed >= Vehicle.MINSPEED) && (carSpeed <= Vehicle.MAXSPEED)) {
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
            winner = new Race (new Vehicle(carMake, carSpeed)).leader();
            System.out.printf("The fastest car: %s%n", winner);
        }
    }
}
