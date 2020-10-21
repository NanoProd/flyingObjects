//-------------------------------------------------
//Assignment 2
// Part 1, Phase 1
//Written by: Joshua-James Nantel-Ouimet (#40131733)
//            Samaninder Singh (#40133493)
//-------------------------------------------------

/**
 * Base class.
 * @author Joshua-James Nantel-Ouimet
 * @author Samaninder Singh 
 * @version 1.0
 */

package FlyingObjects;
//base class
public class FlyingObjects {

    /**
     * default constructor
     */
    public FlyingObjects(){

    }
    /**
     * Copy constructor
     * @param object object being copied
     */
    public FlyingObjects(FlyingObjects object){
        
    }
    
    /** 
     * @param object object being copied
     * @return FlyingObjects
     */
    public FlyingObjects copy(FlyingObjects object){
        FlyingObjects temp = new FlyingObjects(object);
        return temp;
    }
    

    
    /** 
     * @return String
     */
    public String toString(){
        return "FlyingObject to string method";
    }
}
