public class Vehicle {
    final String make;
    final int speed;
    int HOURS = 24;
    public static final int MINSPEED = 0;
    public static final int MAXSPEED = 250;
    int distance() {
        return speed * HOURS;
    }

    Vehicle(String make, int speed){
        this.make = make;
        this.speed = speed;
    }
    Vehicle() {
        make = "no_name";
        speed = 0;
    }
}

