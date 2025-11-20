public class Vehicle {
    String make;
    int speed;
    int HOURS = 24;
    int distance() {
        return speed * HOURS;
    }

    Vehicle(String make, int speed){
        this.make = make;
        this.speed = speed;
    }
}

