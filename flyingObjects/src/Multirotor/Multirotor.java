//-------------------------------------------------
//Assignment 2
// Part 1, Phase 1
//Written by: Joshua-James Nantel-Ouimet (#40131733)
//            Samaninder Singh (#40133493)
//-------------------------------------------------

/**
 * This class allows the user to create Multirotor objects, it is part of the Multirotor package.
 * @author Joshua-James Nantel-Ouimet
 * @author Samaninder Singh 
 * @version 1.0
 */
package Multirotor;

import Copter.*;

public class Multirotor extends Helicopter {

    // attributes
    /**
     * int for number of rotors
     */
    private int numberOfRotors;

       /**
     * default constructor
     * default values set to 0 or empty string
     */
    public Multirotor() {
        super();
        numberOfRotors = 0;
    }

    /**
     * parametrized constructor
     * @param brand String for brand
     * @param price double for price
     * @param horsePower int for horse power
     * @param cylinders int for quantity of cylinders
     * @param creationYear int for creation years
     * @param getPassengerCapacity int for passenger capacity
     * @param numberOfRotors int for number of rotors
     */
    public Multirotor(String brand, double price, int horsePower, int cylinders, int creationYear,
            int getPassengerCapacity, int numberOfRotors) {
        super(brand, price, horsePower, cylinders, creationYear, getPassengerCapacity);
        this.numberOfRotors = numberOfRotors;
    }

    /**
     * copy constructor
     * @param object Multirotor object who's attributes will be copied from
     */
    public Multirotor(Multirotor object) {
        super(object.getBrand(), object.getPrice(), object.getHorsePower(), object.getCylinders(),
                object.getCreationYear(), object.getPassengerCapacity());
        this.numberOfRotors = object.getNumberOfRotors();
    }

    // mutator methods
    /**
     * sets number of rotors
     * @param numberOfRotors int for number of rotors
     */
    public void setNumberOfRotors(int numberOfRotors) {
        this.numberOfRotors = numberOfRotors;
    }

    // accessor methods
    /**
     * returns number of rotors
     * @return int 
     */
    public int getNumberOfRotors() {
        return numberOfRotors;
    }

    /**
     * to string method that displays the multirotor's information
     * @return String
     */
    public String toString() {
        return "This multirotor is made by " + this.getBrand() +
            ", it costs " + this.getPrice() + " $, it is equipped with a " +
            this.getHorsePower() + " horse power engine with " + this.getCylinders() +
            " cylinders. It can carry up to " + this.getPassengerCapacity() + 
            " passengers and has " + this.numberOfRotors + " rotors."; 
    }

    /**
     * equals method that returns true if all attributes are the same
     * @param object Multirotor object being compared to
     * @return boolean
     */
    public boolean equals(Multirotor object) {
        return super.equals(object) && this.numberOfRotors == object.numberOfRotors;
    }

}
