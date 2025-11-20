import java.util.Scanner;
public class Race {
    int max_dist = 0;
    String winner = "";
    Vehicle[] allCars;

    String leader() {
        for (Vehicle i : allCars) {
            if (i.distance() > max_dist) {
                max_dist = i.distance();
                winner = i.make;
            }
        }

        return winner;
    }
    Race(Vehicle[] allCars ) {
        this.allCars = allCars;
    }
}


