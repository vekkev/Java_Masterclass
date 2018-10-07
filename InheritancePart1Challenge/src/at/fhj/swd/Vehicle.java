package at.fhj.swd;

public class Vehicle {

    private String brand;
    private String model;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;

        this.currentVelocity = 0;
        this.currentDirection = 0;

    }


    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + direction + " degrees");
    }


    public void move(int velocity, int direction ){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity +
                " in direction " + currentDirection);
    }


    public void stop(){
        this.currentVelocity = 0;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
