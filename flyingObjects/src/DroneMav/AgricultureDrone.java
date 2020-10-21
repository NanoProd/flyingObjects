//-------------------------------------------------
//Assignment 2
// Part 1, Phase 1
//Written by: Joshua-James Nantel-Ouimet (#40131733)
//            Samaninder Singh (#40133493)
//-------------------------------------------------

/**
 * This class allows the user to create AgricultureDrone objects, it is part of the DroneMav package.
 * @author Joshua-James Nantel-Ouimet
 * @author Samaninder Singh 
 * @version 1.0
 */
package DroneMav;
import Uav.*;

public class AgricultureDrone extends Uav {
    /**
     * AgricultureDrone brand name
     */
    private String brand;
    /**
     * agricultureDrone size in cubic centimeters
     */
    private double size;

    // default constructor
       /**
     * default constructor
     * default values set to 0 or empty string
     */
    public AgricultureDrone(){
        super();
        brand = "";
        size = 0.0;
    }

    /**
     * Parametrized constructor
     * @param weight double for weight
     * @param price double for price
     * @param brand String for brand name
     * @param size double for size in cubic centimeters
     */
    public AgricultureDrone(double weight, double price, String brand, double size){
        super(weight, price);
        this.brand = brand;
        this.size = size;
    }

    /**
     * copy constructor
     * @param object Agricultur Drone object who's attributes will be copied
     */
    public AgricultureDrone(AgricultureDrone object){
        super(object.getWeight(), object.getPrice());
        this.brand = object.getBrand();
        this.size = object.getSize();
    }
    
    //mutator methods
    /**
     * sets brand name
     * @param brand String for brand name
     */
    public void setBrand(String brand){
        this.brand = brand;
    }
    /**
     * sets size in cubic centimeters
     * @param size double for size
     */
    public void setSize(double size){
        this.size = size;
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
     * returns size in cubic centimers
     * @return double
     */
    public double getSize() {
        return size ;
    }

    /**
     * to string method that prints out Agriculture Drone information to the console
     * @return String
     */
    public String toString() {
        return "This is an Agriculture Drone, the brand type is " +
         this.brand + ", it weighs " + this.getWeight() + 
         " pounds. It costs " + this.getPrice() + 
         " and it is " + this.size + " cubic centimeters";
    }

    /**
     * equals method that returns true if all attributes are equal
     * @param object AgricultureDrone that is being compared with
     * @return boolean
     */
    public boolean equals(AgricultureDrone object) {
        return super.equals(object) && this.brand == object.brand && this.size == object.size;
    }

       
       /** 
        * @param object object being copied
        * @return AgricultureDrone
        */
       public AgricultureDrone copy(AgricultureDrone object){
        AgricultureDrone temp = new AgricultureDrone(object);
        return temp;
    }

}
