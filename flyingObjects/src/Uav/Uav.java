//-------------------------------------------------
//Assignment 2
// Part 1, Phase 1
//Written by: Joshua-James Nantel-Ouimet (#40131733)
//            Samaninder Singh (#40133493)
//-------------------------------------------------

/**
 * This class allows the user to create Uav objects, it is part of the Uav package.
 * @author Joshua-James Nantel-Ouimet
 * @author Samaninder Singh 
 * @version 1.0
 */
package Uav;

import FlyingObjects.*;

public class Uav extends FlyingObjects {

    // attributes
    /**
     * Uav weight 
     */
    private double weight;
    /**
     * Uav price
     */
    private double price;

    // default constructor
       /**
     * default constructor
     * default values set to 0 or empty string
     */
    public Uav() {
        super();
        weight = 0.0;
        price = 0.0;
    }

    /**
     * Parametrized constructor
     * @param weight double for weight in pounds
     * @param price double for price
     */
    public Uav(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    /**
     * Copy constructor
     * @param object Uav who's attributes will be copied from
     */
    public Uav(Uav object) {
        this.weight = object.weight;
        this.price = object.price;
    }

    // mutator methods
    /**
     * sets weight
     * @param weight double for weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    /**
     * sets price
     * @param price double for price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    // accesor methods
    /**
     * returns weight
     * @return double
     */
    public double getWeight() {
        return weight;
    }
    /**
     * returns price
     * @return double
     */
    public double getPrice() {
        return price;
    }

    
    /**
     * to string method that displays the UAV's information
     * @return String
     */
    public String toString() {
        return "This is a UAV, it weighs " + this.weight + 
         " pounds. It costs " + this.price + " $.";
    }

    
    /**
     * equals method that returns true if all attributes are equal
     * @param object Uav who is being compared to calling object
     * @return boolean
     */
    public boolean equals(Uav object) {
        if(object == null){
            return false;
        }
        if(object.getClass() != this.getClass()){
            return false;
        }
        return this.weight == object.weight && this.price == object.price;
    }

     
     /** 
      * @param object object being copied
      * @return Uav
      */
     public Uav copy(Uav object){
        Uav temp = new Uav(object);
        return temp;
    }
}
