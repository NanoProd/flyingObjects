//-------------------------------------------------
//Assignment 2
// Part 1, Phase 1
//Written by: Joshua-James Nantel-Ouimet (#40131733)
//            Samaninder Singh (#40133493)
//-------------------------------------------------

/**
 * This class allows the user to create Mav objects, it is part of the DroneMav package.
 * @author Joshua-James Nantel-Ouimet
 * @author Samaninder Singh 
 * @version 1.0
 */

package DroneMav;
import Uav.*;

public class Mav extends Uav {

    /**
     * String value representing the model
     */
    private String model;
    /**
     * double value representing the size
     */
    private double size;

    /**
     * Default constructor
     * Values will be assigned 0 or an empty string
     */
    public Mav() {
        super();
        model = "";
        size = 0.0;
    }

    /**
     * Parametrized Constructor
     * @param weight is a double representing the MAV weight
     * @param price is a double representing the MAV price
     * @param model is a String representing the MAV model
     * @param size is a double representing the MAV size
     */
    public Mav(double weight, double price, String model, double size) {
        super(weight, price);
        this.model = model;
        this.size = size;
    }

    /**
     * Copy constructor
     * @param object representing the object that is being copied
     */
    public Mav(Mav object) {
        super(object.getWeight(), object.getPrice());
        this.model = object.getModel();
        this.size = object.getSize();
    }

    // mutator methods
    /**
     * Mutator method to set Model name
     * @param model String for model name
     */
    public void setModel(String model) {
        this.model = model;
    }
    /**
     * Mutator method to set MAV size
     * @param size double for size
     */
    public void setSize(double size) {
        this.size = size;
    }

    // accessor methods
    /**
     * returns type of MAV model
     * @return String
     */
    public String getModel() {
        return model;
    }
    /**
     * returns size of MAV
     * @return double
     */
    public double getSize() {
        return size;
    }

    // toStrings method
    /**
     * To string method that prints out MAV information
     * @return String
     */
    public String toString() {
        return "This is a Micro Air Vehicle, the model type is " +
         this.model + ", it weighs " + this.getWeight() + 
         " pounds. It costs " + this.getPrice() + 
         " and it is " + this.size + " cubic centimeters";
    }

    // equals method
    /**
     * Compares to MAV objects and returns true if all of their attributes are equal
     * @param object represents the MAV object being compared to
     * @return boolean 
     */
    public boolean equals(Mav object) {
        return super.equals(object) && this.model == object.model && this.size == object.size;
    }

    
    /** 
     * @param object object being copied
     * @return Mav
     */
    public Mav copy(Mav object){
        Mav temp = new Mav(object);
        return temp;
    }
}
