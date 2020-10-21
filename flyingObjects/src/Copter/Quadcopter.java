//-------------------------------------------------
//Assignment 2
// Part 1, Phase 1
//Written by: Joshua-James Nantel-Ouimet (#40131733)
//            Samaninder Singh (#40133493)
//-------------------------------------------------

/**
 * This class allows the user to create Quadcopter objects, it is part of the Copter package.
 * @author Joshua-James Nantel-Ouimet
 * @author Samaninder Singh 
 * @version 1.0
 */
package Copter;

public class Quadcopter extends Helicopter {

    // attributes
    /**
     * int for max flying speed in m/s
     */
    private int maxFlyingSpeed;

    
    /**
     * default constructor
     * default values set to 0 or empty string
     */
    public Quadcopter() {
        super();
        maxFlyingSpeed = 0;
    }

    
    /**
     * paremetrized constructor
     * @param brand String for brand name
     * @param price double for price
     * @param horsePower int for horse power
     * @param cylinders int for quantity of cylinders
     * @param creationYear int for creation year
     * @param passengerCapacity int for passenger capacity
     * @param maxFlyingSpeed int for max flying speed in m/s
     */
    public Quadcopter(String brand, double price, int horsePower, int cylinders, int creationYear,
            int passengerCapacity, int maxFlyingSpeed) {
        super(brand, price, horsePower, cylinders, creationYear, passengerCapacity);
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    /**
     * copy constructor
     * @param object represents the object who's attributes will be copied from
     */
    public Quadcopter(Quadcopter object) {
        super(object.getBrand(), object.getPrice(), object.getHorsePower(), object.getCylinders(),
                object.getCreationYear(), object.getPassengerCapacity());
        this.maxFlyingSpeed = object.getMaxFlyingSpeed();
    }

    // mutator methods
    /**
     * sets max flying speed
     * @param maxFlyingSpeed int for max flying speed
     */
    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    // accessor methods
    /**
     * returns max flying speed in m/s.
     * @return int
     */
    public int getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }

    /**
     * To string method that displays Quadcopter information
     * 
     * @return String
     */
    public String toString() {
        return "This " + this.getCreationYear()+ " quadcopter is made by " + this.getBrand() +
            ", it costs " + this.getPrice() + " $, it is equipped with a " +
            this.getHorsePower() + " horse power engine with " + this.getCylinders() +
            " cylinders. It can carry up to " + this.getPassengerCapacity() + 
            " passengers and fly at a maximum speed of " + this.maxFlyingSpeed + " km/h";

    }

    /**
     * equals method
     * Compares to Quadcopter objects and returns true if all attributes are the same. 
     * @param object Quadcopter object being copied
     * @return boolean
     */
    public boolean equals(Quadcopter object) {
        if(object == null){
            return false;
        }
        if(object.getClass() != this.getClass()){
            return false;
        }
        return super.equals(object) && this.maxFlyingSpeed == object.maxFlyingSpeed;
    }

    



    
    /** 
     * @param object object being copied
     * @return Quadcopter
     */
    public Quadcopter copy(Quadcopter object){
        Quadcopter temp = new Quadcopter(object);
        return temp;
    }






}

