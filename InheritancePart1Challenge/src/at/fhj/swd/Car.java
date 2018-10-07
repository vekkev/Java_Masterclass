package at.fhj.swd;

public class Car extends Vehicle {

    private int brakes;
    private int wheels;
    private String bodykit;
    private int seats;
    private boolean isManual;
    private int doors;
    private int gears;

    private int currentGear;

    public Car(String brand, String model, int brakes, int wheels, String bodykit,
               int seats, boolean isManual, int doors, int gears) {
        super(brand, model);
        this.brakes = brakes;
        this.wheels = wheels;
        this.bodykit = bodykit;
        this.seats = seats;
        this.isManual = isManual;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " +
                this.currentGear + " gear.");
    }


    public void changeVelocity (int speed, int direction){
        System.out.println("Car.changeVelocity(): Velocity " +
                speed + " direction " + direction);
        move (speed, direction);
    }




    public int getBrakes() {
        return brakes;
    }

    public int getWheels() {
        return wheels;
    }

    public String getBodykit() {
        return bodykit;
    }

    public int getSeats() {
        return seats;
    }
}
