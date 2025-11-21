import java.util.Scanner;
public class Race {
    Vehicle vehicle;
    int max_dist = 0;
    String winner = "";

    String leader() {
        if (vehicle.distance() > max_dist) {
            max_dist = vehicle.distance();
            winner = vehicle.make;
        }
        return winner;
    }
    Race(Vehicle vehicle ) {
        this.vehicle = vehicle;
    }

    Race() {
        vehicle = new Vehicle();
    }
}


