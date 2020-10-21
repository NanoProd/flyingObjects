//-------------------------------------------------
//Assignment 2
// Part 1, Phase 1
//Written by: Joshua-James Nantel-Ouimet (#40131733)
//            Samaninder Singh (#40133493)
//-------------------------------------------------

/**
 * Driver.
 * @author Joshua-James Nantel-Ouimet
 * @author Samaninder Singh 
 * @version 1.0
 */

package FlyingObjects;

import Copter.*;
import DroneMav.*;
import Airplane.*;
import Multirotor.*;
import Uav.*;

public class Driver {


        public static void main(String[] args) {


        //test default constructors
        Mav mav1 = new Mav();
        Airplane airplane1 = new Airplane();
        Helicopter helicopter1 = new Helicopter();
        Quadcopter quadcopter1 = new Quadcopter();
        Multirotor multirotor1 = new Multirotor();
        AgricultureDrone agriculture1 = new AgricultureDrone();
        Uav uav1 = new Uav();
        
        //test parametrized construtor
        Mav mav2 = new Mav( 100.00 , 1234, "Nokia", 6);
        Airplane airplane2 = new Airplane( "Virgin", 120000, 31000);
        Helicopter heli2 = new Helicopter( "Parrot", 12313, 12223, 4, 2010, 12);
        Quadcopter quad2 = new Quadcopter( "Par", 4321, 1111, 2, 2020, 100, 123);
        Multirotor multi2 = new Multirotor( "Party", 43242, 22222, 5, 2020, 4, 2);
        AgricultureDrone agri2 = new AgricultureDrone(231, 4534, "vito", 3);
        Uav uav2 = new Uav(500, 5875);

        //test copy constructor
        Mav mav3 = new Mav(mav2);
        Airplane airplane3 = new Airplane(airplane2);
        Helicopter heli3 = new Helicopter(heli2);
        Quadcopter quad3 = new Quadcopter(quad2);
        Multirotor multi3 = new Multirotor(multi2);
        AgricultureDrone agri3 = new AgricultureDrone(agri2);
        Uav uav3 = new Uav(uav2);

        //print out all of the information using to string method
        FlyingObjects[] array = new FlyingObjects[21];
        array[0] = mav1;
        array[1] = airplane1;
        array[2] = helicopter1;
        array[3] = quadcopter1;
        array[4] = multirotor1;
        array[5] = agriculture1;
        array[6] = uav1;
        array[7] = mav2;
        array[8] = airplane2;
        array[9] = heli2;
        array[10] = quad2;
        array[11] = multi2;
        array[12] = agri2;
        array[13] = uav2;
        array[14] = mav3;
        array[15] = airplane3;
        array[16] = heli3;
        array[17] = quad3;
        array[18] = multi3;
        array[19] = agri3;
        array[20] = uav3; 


    for(int i=0; i<21; i++){

                    System.out.println();
            System.out.println(array[i].toString());
            System.out.println();
        }

    for(int i=0; i<21; i++){
        for(int j = 21; j <= 0; j--){
            if(array[i].equals(array[j])){
                System.out.println("Objects " + i + "and " + j + " are equal" );
            } else {
                System.out.println("They are not equal");
            }
               
            }
        }
    }

}
    

    

