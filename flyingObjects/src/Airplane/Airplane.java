//-------------------------------------------------
//Assignment 2
// Part 1, Phase 1
//Written by: Joshua-James Nantel-Ouimet (#40131733)
//            Samaninder Singh (#40133493)
//-------------------------------------------------

/**
 * This class allows the user to create Airplane objects, it is part of the Airplane package.
 * @author Joshua-James Nantel-Ouimet
 * @author Samaninder Singh 
 * @version 1.0
 */

package Airplane;
import FlyingObjects.*;

public class Airplane extends FlyingObjects {
    // attributes
    /**
     * represents the Airplane brand
     */
    private String brand;
    /**
     * Airplane price
     */
    private double price;
    /**
     * Airplane horse power
     */
    private int horsePower;

    /**
     * Default constructor
     * Values will be set to 0 or empty string 
     */
    public Airplane() {
        brand = "";
        price = 0.0;
        horsePower = 0;
    }

    /**
     * Parametrized constructor
     * @param brand String for brand
     * @param price double for price
     * @param horsePower int for horse power
     */
    public Airplane(String brand, double price, int horsePower) {
        this.brand = brand;
        this.price = price;
        this.horsePower = horsePower;
    }

    /**
     * copy constructor
     * @param object Airplane object that attributes will be copied from
     */
    public Airplane(Airplane object) {
        this.brand = object.brand;
        this.price = object.price;
        this.horsePower = object.horsePower;
    }

    // mutator methods
    /**
     * mutator method to set Brand
     * @param brand String for brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     * mutator method to set price
     * @param price double for price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * mutator method to st horse power
     *  @param horsePower int for horsePower
     */
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    // accesor methods
    /**
     * returns brand name
     * @return String
     */
    public String getBrand() {
        return brand;
    }
    /**
     * returns price
     * @return double
     */
    public double getPrice() {
        return price;
    }

    /**
     * returns horsePower
     * @return int 
     */
    public int getHorsePower() {
        return horsePower;
    }
    /**
     * ToString method that returns Airplane information
     * @return String
     */
    public String toString() {
        return "This Airplane is made by" +
        this.brand + ", it has " + this.horsePower + " horsepower and costs" + this.price;
    }

    /**
     * Compares to Airplane objects and returns true if all attributes are the same.
     * @return boolean
     */
    public boolean equals(Airplane object) {
        return this.brand == object.brand && this.price == object.price && this.horsePower == object.horsePower;
    }

}