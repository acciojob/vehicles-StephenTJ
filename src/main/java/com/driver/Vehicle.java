package com.driver;

public class Vehicle {

    String name;

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public int  getCurrentDirection(){
        return this.currentDirection;
    }
    public int  getCurrentSpeed(){
        return this.currentSpeed;
    }
    public void steer(int direction){
        this.currentDirection=direction;
        //direction is in degrees, add it to the current direction
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        this.currentSpeed=speed;
        this.currentDirection=direction;
        //set the values of currentSpeed and currentDirection
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }


    public void stop(){
        currentSpeed=0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}
